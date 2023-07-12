package FirstGame;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //创建英雄和装备
        Soldier s1 = new Soldier("北方神的荣耀",50,20,10,"","红温");
        Master m2 = new Master("哈利波特",40,40,10,"","吃口药");
        Weapon w1 = new Weapon(1,"圣剑",30,10);
        Weapon w2 = new Weapon(2,"权戒",20,20);
        Weapon w3 = new Weapon(3,"魅惑之眼",30,30);
        //显示英雄的初始值
        System.out.println("-----显示玩家初始值：-----");
        s1.showyourself(s1);
        m2.showyourself(m2);
        System.out.println();
        //战斗开始
        boolean condition =true;
        System.out.println("     Let's fight!");
        System.out.println();
        while(condition){
            //选择游戏的回合
            System.out.println("-----请输入你的回合:------");
            System.out.println("---普攻回合请输入attack---");
            System.out.println("--装备拾取回合请输入take--");
            System.out.println("-使用技能回合请输入UseSkill-");
            Scanner sc = new Scanner(System.in);
            String res = sc.next();
            String a = "attack";
            String b = "take";
            String c = "UseSkill";
            boolean result1 = res.equalsIgnoreCase(a);
            boolean result2 = res.equalsIgnoreCase(b);
            boolean result3 = res.equalsIgnoreCase(c);
            if(result1){
                System.out.println("接下来是普攻互换回合");
                for(int i=0;i<3;i++){
                    s1.attack(m2);
                    m2.attack(s1);
                    System.out.println(s1.name+"的血量为: "+s1.blood);
                    System.out.println(m2.name+"的血量为: "+m2.blood);
                    if(s1.blood<=0){
                        System.out.println(s1.name+"被击杀"+"恭喜"+m2.name+"获胜");
                        condition=false;
                    }
                    if(m2.blood<=0){
                        System.out.println(m2.name+"被击杀"+"恭喜"+s1.name+"获胜");
                        condition=false;
                    }
                }

            }
            if(result2){
                System.out.println("接下来是装备拾取回合");
            }
            if(result3){
                System.out.println("接下来是技能使用回合");
            }
            /*s1.attack();
            s1.UseSkill();
            s1.take(w1);
            m2.take(w2);
            m2.UseSkill();
            m2.take(w3);*/
            //System.out.println(s1.name);

        }
        System.out.println("------游戏结束------");
    }
}