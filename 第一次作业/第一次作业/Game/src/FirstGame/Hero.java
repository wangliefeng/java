package FirstGame;

import java.util.Random;

public class Hero {
    //属性
    String name,equipment;
    int blood,power,defense,hurt;
    //行为
    public Hero(){
    }
    public Hero(String name, int blood, int power, int defense,String equipment){
        this.name=name;
        this.blood=blood;
        this.power=power;
        this.defense=defense;
        this.equipment=equipment;
    }

    public void attack(Hero h){
        Random r=new Random();
        int number1 =r.nextInt(10);
        System.out.println(h.name+"受到的普通攻击伤害为："+number1);
        h.blood=h.blood-number1;
    }
    public void take(Weapon w){
        System.out.println("拾取装备"+w);
    }
    public void UseSkill(){
        System.out.println("使用技能");
    }
}
