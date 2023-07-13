package FirstGame;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //创建英雄和装备
        Soldier s1 = new Soldier("北方神的荣耀",100,10,10,"","红温");
        Master m2 = new Master("哈利波特",60,20,10,"","破防");
        Weapon w1 = new Weapon(1,"圣剑",15,10);
        Weapon w2 = new Weapon(2,"权戒",10,20);
        Weapon w3 = new Weapon(3,"魅惑之眼",15,15);
        //显示英雄的初始值
        System.out.println("-----显示玩家初始值：-----");
        s1.showyourself(s1);
        m2.showyourself(m2);
        System.out.println();
        //战斗开始
        boolean condition =true;
        System.out.println("     Let's fight!");
        while(condition){
            //选择游戏的回合
            System.out.println();
            System.out.println("-----请输入你的回合:------");
            System.out.println("---普攻回合请输入attack---");
            System.out.println("--装备拾取回合请输入take--");
            System.out.println("-使用技能回合请输入UseSkill-");
            System.out.println("-----结束游戏输入end-----");
            Scanner sc = new Scanner(System.in);
            String res = sc.next();
            String a = "attack";
            String b = "take";
            String c = "UseSkill";
            String d = "end";
            boolean result1 = res.equalsIgnoreCase(a);
            boolean result2 = res.equalsIgnoreCase(b);
            boolean result3 = res.equalsIgnoreCase(c);
            boolean result4 = res.equalsIgnoreCase(d);
            //普攻回合
            if(result1){
                System.out.println("接下来是普攻互换回合");
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
            //装备拾取回合
            else if(result2){
                System.out.println("接下来是装备拾取回合");
                System.out.println("1: "+w1.name+" 2: "+w2.name+" 3: "+w3.name);
                System.out.println(s1.name+"选择装备:");
                Weapon ws = new Weapon();
                Scanner sc2 = new Scanner(System.in);
                int resa = sc2.nextInt();
                ws.id=resa;
                s1.take(s1,ws);
                System.out.println(s1.name+"的战斗力为： "+s1.power+" 护盾为： "+s1.defense);
                System.out.println(m2.name+"选择装备:");
                Scanner sc3 = new Scanner(System.in);
                int resb = sc3.nextInt();
                Weapon wm = new Weapon();
                wm.id=resb;
                m2.take(m2,wm);
                System.out.println(m2.name+"的战斗力为： "+m2.power+" 护盾为： "+m2.defense);
            }
            //技能使用回合
            else if(result3){
                System.out.println("接下来是技能使用回合");
                s1.UseSkill(m2,s1);
                m2.UseSkill(s1,m2);
                System.out.println(s1.name+"的血量为: "+s1.blood+s1.name+"的护盾为: "+s1.defense);
                System.out.println(m2.name+"的血量为: "+m2.blood+m2.name+"的护盾为: "+m2.defense);
                if(s1.blood<=0){
                    System.out.println(s1.name+"被击杀"+"恭喜"+m2.name+"获胜");
                    condition=false;
                }
                if(m2.blood<=0){
                    System.out.println(m2.name+"被击杀"+"恭喜"+s1.name+"获胜");
                    condition=false;
                }

            }
            //游戏结束指令
            else if(result4){
                break;
            }
            //游戏警告指令
            else{
                System.out.println("！！！请输入正确的指令！！！");
            }


        }
        System.out.println("------游戏结束------");
    }
}