package TheKingWar;
import java.util.Scanner;

public class Summon extends Hero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
		/**����Ӣ������hero_name*/
		int [][]hero = new int[10][4]; 
		hero = hero();
		int i=0,alive=10;
		while(alive>1) {//��Ӣ��ֻʣ��һ��ʱ������ѭ��
			alive=die(hero);
			if(hero[i][3]<=0) {
				i+=1;//������������Ӣ�ۻغ�
				if(i==10)
					i=0;//����0��9֮���ѭ��
			}
	        System.out.println(hero_name[i]+"�Ļغϣ�");//��ʾ��
	        String[] cmd;
			String temp;
			temp = input.nextLine() + " ";
			//��ÿ��ָ��ĩβ����һ���ո񣬱��������@param split()�����ָ��ַ�����cmd������
			cmd = temp.split(" ");//ÿ��ָ��ո�ָ�ɼ�����
			switch (cmd.length) {
			case 3:hero =move(hero,i, Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]) );
			break;//"move x y"
			case 2:hero =attack(hero,i, Integer.parseInt(cmd[1]));
			break;//"attack enemy"
			case 1:hero =stay(hero, i);
			break;//"stay"
			default :break;
			}
		    i+=1;
		    if(i==10)
				i=0;
		}
		}
/**�ж�Ӣ�۴����*/
	private static int die(int[][] hero) {
		int alive=10;
		for(int i=0;i<10;i++)
			if(hero[i][3]<=0)
				alive-=1;
		return alive;
	}
/**����*/
	private static int[][] stay(int[][] hero, int i) {
		String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
		String [][]location =first_map2();
		if(hero[i][3]<8)//�ж�����ֵ�ߵ�
		   hero[i][3]+=1;//����ֵ�ָ�һ
		else hero[i][2]+=1;//����������һ
		System.out.println(hero_name[i]+"������ֵΪ"+hero[i][3]);
		System.out.println(hero_name[i]+"�Ĺ�����Ϊ"+hero[i][2]);
		map(hero,location);//��ӡ�µ�ͼ
		return hero;
		
	}
/**�ƶ�*/
	private static int[][] move(int[][] hero, int i, int x, int y) {
		hero[i][0]+=x;
		hero[i][1]+=y;//��������
		String [][]location =first_map2();
		map(hero,location);//��ӡ�µ�ͼ
		return hero;
	}
/**����*/
	private static int[][] attack(int[][] hero, int i, int e) {
			switch(i) {//��������
			case 0:hero = skillA(hero,e);break;
			case 1:hero = skillB(hero,e);break;
			case 2:hero = skillC(hero,e);break;
			case 3:hero = skillD(hero,e);break;
			case 4:hero = skillE(hero,e);break;
			case 5:hero = skillF(hero,e);break;
			case 6:hero = skillG(hero,e);break;
			case 7:hero = skillH(hero,e);break;
			case 8:hero = skillI(hero,e);break;
			case 9:hero = skillJ(hero,e);break;
		    }
			switch(i) {//��������
			case 0:hero = skillPassiveA(hero,i);break;
			case 1:hero = skillPassiveB(hero,i);break;
			case 2:hero = skillPassiveC(hero,i);break;
			case 3:hero = skillPassiveD(hero,i);break;
			case 4:hero = skillPassiveE(hero,i);break;
			case 5:hero = skillPassiveF(hero,i);break;
			case 6:hero = skillPassiveG(hero,i);break;
			case 7:hero = skillPassiveH(hero,i);break;
			case 8:hero = skillPassiveI(hero,i);break;
			case 9:hero = skillPassiveJ(hero,i);break;
		    }
			return hero;
	}
	/**@author ��ΰ��*/
	 }





