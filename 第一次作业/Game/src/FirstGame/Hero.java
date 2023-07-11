package FirstGame;

import java.util.Random;

public class Hero {
    //属性
    String name;
    int blood;
    int power;
    int defense;
    String equipment;
    //行为
    public Hero(){
    }
    public Hero(String name, int blood, int power, int defense,String equipment){
        this.name=name;
        this.blood=blood;
        this.power=power;
        this.defense=defense;
    }
    public void attack(){
        Random r=new Random();
        int number1 =r.nextInt(10);
        System.out.println("普通攻击伤害为："+number1);
    }
    public void take(Weapon w){
        System.out.println("拾取装备"+w);
    }
    public void UseSkill(){
        System.out.println("使用技能");
    }
}
