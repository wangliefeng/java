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
    public void take(Hero h,Weapon w){
        if(w.id==1){
            Weapon w1 = new Weapon(1,"圣剑",30,10);
            h.equipment= w1.name;
            h.power=h.power+w1.addPower;
            h.defense=h.defense+w1.addDefense;
        }
        if(w.id==2){
            Weapon w2 = new Weapon(2,"权戒",20,20);
            h.equipment=w2.name;
            h.power=h.power+w2.addPower;
            h.defense=h.defense+w2.addDefense;
        }
        if(w.id==3){
            Weapon w3 = new Weapon(3,"魅惑之眼",30,30);
            h.equipment=w3.name;
            h.power=h.power+w3.addPower;
            h.defense=h.defense+w3.addDefense;
        }

    }
    public void UseSkill(){
        System.out.println("使用技能");
    }
}
