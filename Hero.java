package TheKingWar;
import java.util.Scanner;
public class Hero extends Map{
	public static int[][] hero() {
		/**������*/
		String[][]location=first_map();
		//��ӡ��ʼ��ͼ
		int[][] hero = {{1,1,1,5},{3,3,1,5},{5,5,1,5},{7,7,1,5},{9,9,1,5},{11,11,1,5},{13,13,1,5},{15,15,1,5},{17,17,1,5},{19,19,1,5}};
		//����Ӣ�۳�����
		map(hero,location);
		//��ӡ��ͼ
		return hero;				 
	}
    /**Ӣ��A����������
     * ����*/
	public static int[][] skillA(int[][] hero,int e) {
		String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
		//����Ӣ������
		String[][]location=first_map2();
		if(hero[0][0]-3<hero[e][0]&&hero[0][0]+3>hero[e][0]&&hero[0][1]-3<hero[e][1]&&hero[0][1]+3>hero[e][1]) {
			//�жϵ����Ƿ��ڹ�����Χ��
			System.out.println("���е���");
		    hero[e][3]-=2*hero[0][2];//�������������˺�
		    System.out.println(hero_name[e]+"������ֵ����"+hero[e][3]);
		    location[hero[0][0]+1][hero[0][1]+1-1]=" |";
		    location[hero[e][0]+1][hero[e][1]+1-1]=" !";
		map(hero,location);
		}else 
			System.out.println("δ���е���");
		return hero;
	}
	/**Ӣ��B����������
	 * ��Ѫ*/
	public static int[][] skillB(int[][] hero,int e) {
		String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
		String[][]location=first_map2();
		if(hero[1][0]==hero[e][0]||hero[1][1]==hero[e][1]) {
			//�ж��Ƿ��ڹ�����Χ��
			System.out.println("���е���");
		    hero[e][3]-=hero[1][2];
		    hero[1][3]+=hero[1][2];
		    System.out.println(hero_name[e]+"������ֵ����"+hero[e][3]);
		    System.out.println(hero_name[1]+"������ֵ�ظ�Ϊ"+hero[1][3]);
		    if(hero[1][0]==hero[e][0]) {
		    	//�ж��Ƿ���ͬһ����
			   if(hero[1][1]<hero[e][1])
				  for(int i=hero[1][1]+1;i<hero[e][1];i++)
					  location[hero[1][0]+1][i+1]="--";
			   else
				   for(int i=hero[e][1]+1;i<hero[1][1];i++)
					   location[hero[1][0]+1][i+1]="--";
		    }else//��ͬһ����ʱ
		    	if(hero[1][0]<hero[e][0])
			     for(int i=hero[1][0]+1;i<hero[e][0];i++)
				      location[i+1][hero[1][1]+1]="| ";
		     else 
			     for(int i=hero[e][0]+1;i<hero[1][0];i++)
				     location[i+1][hero[1][1]+1]="| ";
		     map(hero,location);
		}else
			System.out.println("δ���е���");
		return hero;
	}
    /**Ӣ��C����������
     * ����*/
	public static int[][] skillC(int[][] hero,int e) {
		String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
		String[][]location=first_map2();
		if(hero[2][0]-3<hero[e][0]&&hero[2][0]+3>hero[e][0]&&hero[2][1]-3<hero[e][1]&&hero[2][1]+3>hero[e][1]) {
			//�жϵ����Ƿ��ڹ�����Χ��
			System.out.println("���е���");
		    hero[e][3]-=2*hero[2][2];//�������������˺�
		    System.out.println(hero_name[e]+"������ֵ����"+hero[e][3]);
		    location[hero[2][0]+1][hero[2][1]+1-1]=" |";
		    location[hero[e][0]+1][hero[e][1]+1-1]=" !";
		map(hero,location);
		}else 
			System.out.println("δ���е���");
		return hero;
	}
    /**Ӣ��D����������
     * ��Ѫ*/
    public static int[][] skillD(int[][] hero,int e) {
    	String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
    	String[][]location=first_map2();
    	if(hero[3][0]==hero[e][0]||hero[3][1]==hero[e][1]) {
			//�ж��Ƿ��ڹ�����Χ��
			System.out.println("���е���");
		    hero[e][3]-=hero[3][2];
		    hero[3][3]+=hero[3][2];
		    System.out.println(hero_name[e]+"������ֵ����"+hero[e][3]);
		    System.out.println(hero_name[3]+"������ֵ�ظ�Ϊ"+hero[3][3]);
		    if(hero[3][0]==hero[e][0]) {
		    	//�ж��Ƿ���ͬһ����
			   if(hero[3][1]<hero[e][1])
				  for(int i=hero[3][1]+1;i<hero[e][1];i++)
					  location[hero[3][0]+1][i+1]="--";
			   else
				   for(int i=hero[e][1]+1;i<hero[3][1];i++)
					   location[hero[3][0]+1][i+1]="--";
		    }else//��ͬһ����ʱ
		    	if(hero[1][0]<hero[e][0])
			     for(int i=hero[3][0]+1;i<hero[e][0];i++)
				      location[i+1][hero[3][1]+1]="| ";
		     else 
			     for(int i=hero[e][0]+1;i<hero[1][0];i++)
				     location[i+1][hero[3][1]+1]="| ";
		     map(hero,location);
		}else
			System.out.println("δ���е���");
    	return hero;
	}
    /**Ӣ��E����������
     * ����*/
    public static int[][] skillE(int[][] hero,int e) {
    	String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
    	String[][]location=first_map2();
    	if(hero[4][0]-3<hero[e][0]&&hero[4][0]+3>hero[e][0]&&hero[4][1]-3<hero[e][1]&&hero[4][1]+3>hero[e][1]) {
			//�жϵ����Ƿ��ڹ�����Χ��
			System.out.println("���е���");
		    hero[e][3]-=2*hero[4][2];//�������������˺�
		    System.out.println(hero_name[e]+"������ֵ����"+hero[e][3]);
		    location[hero[4][0]+1][hero[4][1]+1-1]=" |";
		    location[hero[e][0]+1][hero[e][1]+1-1]=" !";
		map(hero,location);
		}else 
			System.out.println("δ���е���");
    	return hero;
	}
    /**Ӣ��F����������
     * ��Ѫ*/
    public static int[][] skillF(int[][] hero,int e) {
    	String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
    	String[][]location=first_map2();
    	if(hero[1][0]==hero[e][0]||hero[1][1]==hero[e][1]) {
			//�ж��Ƿ��ڹ�����Χ��
			System.out.println("���е���");
		    hero[e][3]-=hero[5][2];
		    hero[5][3]+=hero[5][2];
		    System.out.println(hero_name[e]+"������ֵ����"+hero[e][3]);
		    System.out.println(hero_name[5]+"������ֵ�ظ�Ϊ"+hero[5][3]);
		    if(hero[1][0]==hero[e][0]) {
		    	//�ж��Ƿ���ͬһ����
			   if(hero[5][1]<hero[e][1])
				  for(int i=hero[5][1]+1;i<hero[e][1];i++)
					  location[hero[5][0]+1][i+1]="--";
			   else
				   for(int i=hero[e][1]+1;i<hero[5][1];i++)
					   location[hero[5][0]+1][i+1]="--";
		    }else//��ͬһ����ʱ
		    	if(hero[5][0]<hero[e][0])
			     for(int i=hero[5][0]+1;i<hero[e][0];i++)
				      location[i+1][hero[5][1]+1]="| ";
		     else 
			     for(int i=hero[e][0]+1;i<hero[5][0];i++)
				     location[i+1][hero[5][1]+1]="| ";
		     map(hero,location);
		}else
			System.out.println("δ���е���");
    	return hero;
	}
    /**Ӣ��G����������
     * ����*/
    public static int[][] skillG(int[][] hero,int e) {
    	String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
    	String[][]location=first_map2();
    	if(hero[6][0]-3<hero[e][0]&&hero[6][0]+3>hero[e][0]&&hero[6][1]-3<hero[e][1]&&hero[6][1]+3>hero[e][1]) {
			//�жϵ����Ƿ��ڹ�����Χ��
			System.out.println("���е���");
		    hero[e][3]-=2*hero[6][2];//�������������˺�
		    System.out.println(hero_name[e]+"������ֵ����"+hero[e][3]);
		    location[hero[6][0]+1][hero[6][1]+1-1]=" |";
		    location[hero[e][0]+1][hero[e][1]+1-1]=" !";
		map(hero,location);
		}else 
			System.out.println("δ���е���");
    	return hero;
	}
    /**Ӣ��H����������
     * ��Ѫ*/
    public static int[][] skillH(int[][] hero,int e) {
    	String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
    	String[][]location=first_map2();
    	if(hero[7][0]==hero[e][0]||hero[7][1]==hero[e][1]) {
			//�ж��Ƿ��ڹ�����Χ��
			System.out.println("���е���");
		    hero[e][3]-=hero[7][2];
		    hero[7][3]+=hero[7][2];
		    System.out.println(hero_name[e]+"������ֵ����"+hero[e][3]);
		    System.out.println(hero_name[7]+"������ֵ�ظ�Ϊ"+hero[7][3]);
		    if(hero[7][0]==hero[e][0]) {
		    	//�ж��Ƿ���ͬһ����
			   if(hero[7][1]<hero[e][1])
				  for(int i=hero[7][1]+1;i<hero[e][1];i++)
					  location[hero[7][0]+1][i+1]="--";
			   else
				   for(int i=hero[e][1]+1;i<hero[7][1];i++)
					   location[hero[7][0]+1][i+1]="--";
		    }else//��ͬһ����ʱ
		    	if(hero[7][0]<hero[e][0])
			     for(int i=hero[7][0]+1;i<hero[e][0];i++)
				      location[i+1][hero[7][1]+1]="| ";
		     else 
			     for(int i=hero[e][0]+1;i<hero[1][0];i++)
				     location[i+1][hero[7][1]+1]="| ";
		     map(hero,location);
		}else
			System.out.println("δ���е���");
    	return hero;
	}
    /**Ӣ��I����������
     * ����*/
    public static int[][] skillI(int[][] hero,int e) {
    	String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
    	String[][]location=first_map2();
    	if(hero[8][0]-3<hero[e][0]&&hero[8][0]+3>hero[e][0]&&hero[8][1]-3<hero[e][1]&&hero[8][1]+3>hero[e][1]) {
			//�жϵ����Ƿ��ڹ�����Χ��
			System.out.println("���е���");
		    hero[e][3]-=2*hero[8][2];//�������������˺�
		    System.out.println(hero_name[e]+"������ֵ����"+hero[e][3]);
		    location[hero[8][0]+1][hero[8][1]+1-1]=" |";
		    location[hero[e][0]+1][hero[e][1]+1-1]=" !";
		map(hero,location);
		}else 
			System.out.println("δ���е���");
    	return hero;
	}
    /**Ӣ��J����������
     * ��Ѫ*/
    public static int[][] skillJ(int[][] hero,int e) {
    	String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
    	String[][]location=first_map2();
    	if(hero[9][0]==hero[e][0]||hero[9][1]==hero[e][1]) {
			//�ж��Ƿ��ڹ�����Χ��
			System.out.println("���е���");
		    hero[e][3]-=hero[9][2];
		    hero[9][3]+=hero[9][2];
		    System.out.println(hero_name[e]+"������ֵ����"+hero[e][3]);
		    System.out.println(hero_name[9]+"������ֵ�ظ�Ϊ"+hero[9][3]);
		    if(hero[1][0]==hero[e][0]) {
		    	//�ж��Ƿ���ͬһ����
			   if(hero[1][1]<hero[e][1])
				  for(int i=hero[9][1]+1;i<hero[e][1];i++)
					  location[hero[9][0]+1][i+1]="--";
			   else
				   for(int i=hero[e][1]+1;i<hero[9][1];i++)
					   location[hero[9][0]+1][i+1]="--";
		    }else//��ͬһ����ʱ
		    	if(hero[9][0]<hero[e][0])
			     for(int i=hero[9][0]+1;i<hero[e][0];i++)
				      location[i+1][hero[9][1]+1]="| ";
		     else 
			     for(int i=hero[e][0]+1;i<hero[9][0];i++)
				     location[i+1][hero[9][1]+1]="| ";
		     map(hero,location);
		}else
			System.out.println("δ���е���");
    	return hero;
	}
    /**Ӣ��A�ı�������
    * �ظ�����ֵ*/
    public static int[][] skillPassiveA(int[][] hero,int i){
    	hero[0][3]+=1;//�ظ�����ֵ
    	return hero;
    }
    /**Ӣ��B�ı�������
     * �����˺�*/
    public static int[][] skillPassiveB(int[][] hero,int i){
    	hero[i][3]-=1;//�����˺�
    	return hero;
    }
    /**Ӣ��C�ı�������
     * �ظ�����ֵ*/
    public static int[][] skillPassiveC(int[][] hero,int i){
    	hero[0][3]+=1;//�ظ�����ֵ
    	return hero;
    }
    /**Ӣ��D�ı�������
     * �����˺�*/
    public static int[][] skillPassiveD(int[][] hero,int i){
    	hero[i][3]-=1;//�����˺�
    	return hero;
    }
    /**Ӣ��E�ı�������
     * �ظ�����ֵ*/
    public static int[][] skillPassiveE(int[][] hero,int i){
    	hero[0][3]+=1;//�ظ�����ֵ
    	return hero;
    }
    /**Ӣ��F�ı�������
     * �����˺�*/
    public static int[][] skillPassiveF(int[][] hero,int i){
    	hero[i][3]-=1;//�����˺�
    	return hero;
    }
    /**Ӣ��G�ı�������
     * �ظ�����ֵ*/
    public static int[][] skillPassiveG(int[][] hero,int i){
    	hero[0][3]+=1;//�ظ�����ֵ
    	return hero;
    }
    /**Ӣ��H�ı�������
     * �����˺�*/
    public static int[][] skillPassiveH(int[][] hero,int i){
    	hero[i][3]-=1;//�����˺�
    	return hero;
    }
    /**Ӣ��I�ı�������
     * �ظ�����ֵ*/
    public static int[][] skillPassiveI(int[][] hero,int i){
    	hero[0][3]+=1;//�ظ�����ֵ
    	return hero;
    }
    /**Ӣ��J�ı�������
     * �����˺�*/
    public static int[][] skillPassiveJ(int[][] hero,int i){
    	hero[i][3]-=1;//�����˺�
    	return hero;
    }
}
