package TheKingWar;
import java.util.Scanner;
public class Hero extends Map{
	public static int[][] hero() {
		/**初定义*/
		String[][]location=first_map();
		//打印初始地图
		int[][] hero = {{1,1,1,5},{3,3,1,5},{5,5,1,5},{7,7,1,5},{9,9,1,5},{11,11,1,5},{13,13,1,5},{15,15,1,5},{17,17,1,5},{19,19,1,5}};
		//定义英雄初属性
		map(hero,location);
		//打印地图
		return hero;				 
	}
    /**英雄A的主动技能
     * 重伤*/
	public static int[][] skillA(int[][] hero,int e) {
		String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
		//定义英雄名称
		String[][]location=first_map2();
		if(hero[0][0]-3<hero[e][0]&&hero[0][0]+3>hero[e][0]&&hero[0][1]-3<hero[e][1]&&hero[0][1]+3>hero[e][1]) {
			//判断敌人是否在攻击范围内
			System.out.println("击中敌人");
		    hero[e][3]-=2*hero[0][2];//两倍攻击力的伤害
		    System.out.println(hero_name[e]+"的生命值还有"+hero[e][3]);
		    location[hero[0][0]+1][hero[0][1]+1-1]=" |";
		    location[hero[e][0]+1][hero[e][1]+1-1]=" !";
		map(hero,location);
		}else 
			System.out.println("未击中敌人");
		return hero;
	}
	/**英雄B的主动技能
	 * 吸血*/
	public static int[][] skillB(int[][] hero,int e) {
		String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
		String[][]location=first_map2();
		if(hero[1][0]==hero[e][0]||hero[1][1]==hero[e][1]) {
			//判断是否在攻击范围内
			System.out.println("击中敌人");
		    hero[e][3]-=hero[1][2];
		    hero[1][3]+=hero[1][2];
		    System.out.println(hero_name[e]+"的生命值还有"+hero[e][3]);
		    System.out.println(hero_name[1]+"的生命值回复为"+hero[1][3]);
		    if(hero[1][0]==hero[e][0]) {
		    	//判断是否在同一竖排
			   if(hero[1][1]<hero[e][1])
				  for(int i=hero[1][1]+1;i<hero[e][1];i++)
					  location[hero[1][0]+1][i+1]="--";
			   else
				   for(int i=hero[e][1]+1;i<hero[1][1];i++)
					   location[hero[1][0]+1][i+1]="--";
		    }else//在同一横排时
		    	if(hero[1][0]<hero[e][0])
			     for(int i=hero[1][0]+1;i<hero[e][0];i++)
				      location[i+1][hero[1][1]+1]="| ";
		     else 
			     for(int i=hero[e][0]+1;i<hero[1][0];i++)
				     location[i+1][hero[1][1]+1]="| ";
		     map(hero,location);
		}else
			System.out.println("未击中敌人");
		return hero;
	}
    /**英雄C的主动技能
     * 重伤*/
	public static int[][] skillC(int[][] hero,int e) {
		String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
		String[][]location=first_map2();
		if(hero[2][0]-3<hero[e][0]&&hero[2][0]+3>hero[e][0]&&hero[2][1]-3<hero[e][1]&&hero[2][1]+3>hero[e][1]) {
			//判断敌人是否在攻击范围内
			System.out.println("击中敌人");
		    hero[e][3]-=2*hero[2][2];//两倍攻击力的伤害
		    System.out.println(hero_name[e]+"的生命值还有"+hero[e][3]);
		    location[hero[2][0]+1][hero[2][1]+1-1]=" |";
		    location[hero[e][0]+1][hero[e][1]+1-1]=" !";
		map(hero,location);
		}else 
			System.out.println("未击中敌人");
		return hero;
	}
    /**英雄D的主动技能
     * 吸血*/
    public static int[][] skillD(int[][] hero,int e) {
    	String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
    	String[][]location=first_map2();
    	if(hero[3][0]==hero[e][0]||hero[3][1]==hero[e][1]) {
			//判断是否在攻击范围内
			System.out.println("击中敌人");
		    hero[e][3]-=hero[3][2];
		    hero[3][3]+=hero[3][2];
		    System.out.println(hero_name[e]+"的生命值还有"+hero[e][3]);
		    System.out.println(hero_name[3]+"的生命值回复为"+hero[3][3]);
		    if(hero[3][0]==hero[e][0]) {
		    	//判断是否在同一竖排
			   if(hero[3][1]<hero[e][1])
				  for(int i=hero[3][1]+1;i<hero[e][1];i++)
					  location[hero[3][0]+1][i+1]="--";
			   else
				   for(int i=hero[e][1]+1;i<hero[3][1];i++)
					   location[hero[3][0]+1][i+1]="--";
		    }else//在同一横排时
		    	if(hero[1][0]<hero[e][0])
			     for(int i=hero[3][0]+1;i<hero[e][0];i++)
				      location[i+1][hero[3][1]+1]="| ";
		     else 
			     for(int i=hero[e][0]+1;i<hero[1][0];i++)
				     location[i+1][hero[3][1]+1]="| ";
		     map(hero,location);
		}else
			System.out.println("未击中敌人");
    	return hero;
	}
    /**英雄E的主动技能
     * 重伤*/
    public static int[][] skillE(int[][] hero,int e) {
    	String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
    	String[][]location=first_map2();
    	if(hero[4][0]-3<hero[e][0]&&hero[4][0]+3>hero[e][0]&&hero[4][1]-3<hero[e][1]&&hero[4][1]+3>hero[e][1]) {
			//判断敌人是否在攻击范围内
			System.out.println("击中敌人");
		    hero[e][3]-=2*hero[4][2];//两倍攻击力的伤害
		    System.out.println(hero_name[e]+"的生命值还有"+hero[e][3]);
		    location[hero[4][0]+1][hero[4][1]+1-1]=" |";
		    location[hero[e][0]+1][hero[e][1]+1-1]=" !";
		map(hero,location);
		}else 
			System.out.println("未击中敌人");
    	return hero;
	}
    /**英雄F的主动技能
     * 吸血*/
    public static int[][] skillF(int[][] hero,int e) {
    	String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
    	String[][]location=first_map2();
    	if(hero[1][0]==hero[e][0]||hero[1][1]==hero[e][1]) {
			//判断是否在攻击范围内
			System.out.println("击中敌人");
		    hero[e][3]-=hero[5][2];
		    hero[5][3]+=hero[5][2];
		    System.out.println(hero_name[e]+"的生命值还有"+hero[e][3]);
		    System.out.println(hero_name[5]+"的生命值回复为"+hero[5][3]);
		    if(hero[1][0]==hero[e][0]) {
		    	//判断是否在同一竖排
			   if(hero[5][1]<hero[e][1])
				  for(int i=hero[5][1]+1;i<hero[e][1];i++)
					  location[hero[5][0]+1][i+1]="--";
			   else
				   for(int i=hero[e][1]+1;i<hero[5][1];i++)
					   location[hero[5][0]+1][i+1]="--";
		    }else//在同一横排时
		    	if(hero[5][0]<hero[e][0])
			     for(int i=hero[5][0]+1;i<hero[e][0];i++)
				      location[i+1][hero[5][1]+1]="| ";
		     else 
			     for(int i=hero[e][0]+1;i<hero[5][0];i++)
				     location[i+1][hero[5][1]+1]="| ";
		     map(hero,location);
		}else
			System.out.println("未击中敌人");
    	return hero;
	}
    /**英雄G的主动技能
     * 重伤*/
    public static int[][] skillG(int[][] hero,int e) {
    	String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
    	String[][]location=first_map2();
    	if(hero[6][0]-3<hero[e][0]&&hero[6][0]+3>hero[e][0]&&hero[6][1]-3<hero[e][1]&&hero[6][1]+3>hero[e][1]) {
			//判断敌人是否在攻击范围内
			System.out.println("击中敌人");
		    hero[e][3]-=2*hero[6][2];//两倍攻击力的伤害
		    System.out.println(hero_name[e]+"的生命值还有"+hero[e][3]);
		    location[hero[6][0]+1][hero[6][1]+1-1]=" |";
		    location[hero[e][0]+1][hero[e][1]+1-1]=" !";
		map(hero,location);
		}else 
			System.out.println("未击中敌人");
    	return hero;
	}
    /**英雄H的主动技能
     * 吸血*/
    public static int[][] skillH(int[][] hero,int e) {
    	String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
    	String[][]location=first_map2();
    	if(hero[7][0]==hero[e][0]||hero[7][1]==hero[e][1]) {
			//判断是否在攻击范围内
			System.out.println("击中敌人");
		    hero[e][3]-=hero[7][2];
		    hero[7][3]+=hero[7][2];
		    System.out.println(hero_name[e]+"的生命值还有"+hero[e][3]);
		    System.out.println(hero_name[7]+"的生命值回复为"+hero[7][3]);
		    if(hero[7][0]==hero[e][0]) {
		    	//判断是否在同一竖排
			   if(hero[7][1]<hero[e][1])
				  for(int i=hero[7][1]+1;i<hero[e][1];i++)
					  location[hero[7][0]+1][i+1]="--";
			   else
				   for(int i=hero[e][1]+1;i<hero[7][1];i++)
					   location[hero[7][0]+1][i+1]="--";
		    }else//在同一横排时
		    	if(hero[7][0]<hero[e][0])
			     for(int i=hero[7][0]+1;i<hero[e][0];i++)
				      location[i+1][hero[7][1]+1]="| ";
		     else 
			     for(int i=hero[e][0]+1;i<hero[1][0];i++)
				     location[i+1][hero[7][1]+1]="| ";
		     map(hero,location);
		}else
			System.out.println("未击中敌人");
    	return hero;
	}
    /**英雄I的主动技能
     * 重伤*/
    public static int[][] skillI(int[][] hero,int e) {
    	String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
    	String[][]location=first_map2();
    	if(hero[8][0]-3<hero[e][0]&&hero[8][0]+3>hero[e][0]&&hero[8][1]-3<hero[e][1]&&hero[8][1]+3>hero[e][1]) {
			//判断敌人是否在攻击范围内
			System.out.println("击中敌人");
		    hero[e][3]-=2*hero[8][2];//两倍攻击力的伤害
		    System.out.println(hero_name[e]+"的生命值还有"+hero[e][3]);
		    location[hero[8][0]+1][hero[8][1]+1-1]=" |";
		    location[hero[e][0]+1][hero[e][1]+1-1]=" !";
		map(hero,location);
		}else 
			System.out.println("未击中敌人");
    	return hero;
	}
    /**英雄J的主动技能
     * 吸血*/
    public static int[][] skillJ(int[][] hero,int e) {
    	String[] hero_name = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j "};
    	String[][]location=first_map2();
    	if(hero[9][0]==hero[e][0]||hero[9][1]==hero[e][1]) {
			//判断是否在攻击范围内
			System.out.println("击中敌人");
		    hero[e][3]-=hero[9][2];
		    hero[9][3]+=hero[9][2];
		    System.out.println(hero_name[e]+"的生命值还有"+hero[e][3]);
		    System.out.println(hero_name[9]+"的生命值回复为"+hero[9][3]);
		    if(hero[1][0]==hero[e][0]) {
		    	//判断是否在同一竖排
			   if(hero[1][1]<hero[e][1])
				  for(int i=hero[9][1]+1;i<hero[e][1];i++)
					  location[hero[9][0]+1][i+1]="--";
			   else
				   for(int i=hero[e][1]+1;i<hero[9][1];i++)
					   location[hero[9][0]+1][i+1]="--";
		    }else//在同一横排时
		    	if(hero[9][0]<hero[e][0])
			     for(int i=hero[9][0]+1;i<hero[e][0];i++)
				      location[i+1][hero[9][1]+1]="| ";
		     else 
			     for(int i=hero[e][0]+1;i<hero[9][0];i++)
				     location[i+1][hero[9][1]+1]="| ";
		     map(hero,location);
		}else
			System.out.println("未击中敌人");
    	return hero;
	}
    /**英雄A的被动技能
    * 回复生命值*/
    public static int[][] skillPassiveA(int[][] hero,int i){
    	hero[0][3]+=1;//回复生命值
    	return hero;
    }
    /**英雄B的被动技能
     * 反弹伤害*/
    public static int[][] skillPassiveB(int[][] hero,int i){
    	hero[i][3]-=1;//反弹伤害
    	return hero;
    }
    /**英雄C的被动技能
     * 回复生命值*/
    public static int[][] skillPassiveC(int[][] hero,int i){
    	hero[0][3]+=1;//回复生命值
    	return hero;
    }
    /**英雄D的被动技能
     * 反弹伤害*/
    public static int[][] skillPassiveD(int[][] hero,int i){
    	hero[i][3]-=1;//反弹伤害
    	return hero;
    }
    /**英雄E的被动技能
     * 回复生命值*/
    public static int[][] skillPassiveE(int[][] hero,int i){
    	hero[0][3]+=1;//回复生命值
    	return hero;
    }
    /**英雄F的被动技能
     * 反弹伤害*/
    public static int[][] skillPassiveF(int[][] hero,int i){
    	hero[i][3]-=1;//反弹伤害
    	return hero;
    }
    /**英雄G的被动技能
     * 回复生命值*/
    public static int[][] skillPassiveG(int[][] hero,int i){
    	hero[0][3]+=1;//回复生命值
    	return hero;
    }
    /**英雄H的被动技能
     * 反弹伤害*/
    public static int[][] skillPassiveH(int[][] hero,int i){
    	hero[i][3]-=1;//反弹伤害
    	return hero;
    }
    /**英雄I的被动技能
     * 回复生命值*/
    public static int[][] skillPassiveI(int[][] hero,int i){
    	hero[0][3]+=1;//回复生命值
    	return hero;
    }
    /**英雄J的被动技能
     * 反弹伤害*/
    public static int[][] skillPassiveJ(int[][] hero,int i){
    	hero[i][3]-=1;//反弹伤害
    	return hero;
    }
}
