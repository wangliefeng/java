package FirstGame;

public class Main {
    public static void main(String[] args) {
        //创建英雄和装备
        Soldier s1 = new Soldier();
        Master m2 = new Master();
        Weapon w1 = new Weapon();
        Weapon w2 = new Weapon();
        //战斗开始
        System.out.println("Let's fight!");
        s1.attack();

    }
}