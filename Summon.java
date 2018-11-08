package TheKingWar;
import java.util.Scanner;

public class Summon extends Hero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
		/**建立英雄名称hero_name*/
		int [][]hero = new int[10][4]; 
		hero = hero();
		int i=0,alive=10;
		while(alive>1) {//当英雄只剩下一个时，跳出循环
			alive=die(hero);
			if(hero[i][3]<=0) {
				i+=1;//跳过已死亡的英雄回合
				if(i==10)
					i=0;//建立0到9之间的循环
			}
	        System.out.println(hero_name[i]+"的回合：");//提示语
	        String[] cmd;
			String temp;
			temp = input.nextLine() + " ";
			//在每条指令末尾加上一个空格，便于下面的@param split()方法分割字符串到cmd数组中
			cmd = temp.split(" ");//每条指令按空格分割成几部分
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
/**判断英雄存活量*/
	private static int die(int[][] hero) {
		int alive=10;
		for(int i=0;i<10;i++)
			if(hero[i][3]<=0)
				alive-=1;
		return alive;
	}
/**发呆*/
	private static int[][] stay(int[][] hero, int i) {
		String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
		String [][]location =first_map2();
		if(hero[i][3]<8)//判断生命值高低
		   hero[i][3]+=1;//生命值恢复一
		else hero[i][2]+=1;//攻击力增加一
		System.out.println(hero_name[i]+"的生命值为"+hero[i][3]);
		System.out.println(hero_name[i]+"的攻击力为"+hero[i][2]);
		map(hero,location);//打印新地图
		return hero;
		
	}
/**移动*/
	private static int[][] move(int[][] hero, int i, int x, int y) {
		hero[i][0]+=x;
		hero[i][1]+=y;//更新坐标
		String [][]location =first_map2();
		map(hero,location);//打印新地图
		return hero;
	}
/**攻击*/
	private static int[][] attack(int[][] hero, int i, int e) {
			switch(i) {//主动技能
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
			switch(i) {//被动技能
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
	/**@author 陈伟洋*/
	 }





