package FirstGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //创建英雄和装备
        Soldier s1 = new Soldier("热血小青年",50,20,10,"红温");
        Master m2 = new Master("哥哥污",40,40,10,"吃口药");
        Weapon w1 = new Weapon("圣剑",30,10);
        Weapon w2 = new Weapon("法杖",20,20);
        Weapon w3 = new Weapon("魅惑之眼",30,30);
        /*按键介绍
        * attack = a;
        * take = t;
        * UseSkill = K;
        * */

        //战斗开始
        System.out.println("Let's fight!");
        System.out.println(s1.blood);
        while(true){
            Scanner sc = new Scanner(System.in);
            int res = sc.nextInt();
            s1.attack();
            s1.UseSkill();
            s1.take(w1);
            m2.take(w2);
            m2.UseSkill();
            m2.take(w3);
            System.out.println(s1.name);

        }
    }
}