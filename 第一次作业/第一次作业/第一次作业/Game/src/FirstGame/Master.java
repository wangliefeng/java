package FirstGame;

import java.util.Random;

public class Master extends Hero {

    private String skill;
    public Master(){}
    public Master(String name, int blood, int power, int defense,String equipment,String skill){
        super(name,blood,power,defense,equipment);
        this.skill=skill;
    }
    public void showyourself(Master m){
        System.out.println(m.name+" 血量:"+m.blood+" 战斗力: "+m.power+" 防御力: "+m.defense+" 装备： "+m.equipment);
    }

    @Override
    public void take(Hero h,Weapon w){
        if(w.id==1){
            Weapon w1 = new Weapon(1,"圣剑",15,10);
            h.equipment= w1.name;
            h.power=h.power+w1.addPower;
            h.defense=h.defense+w1.addDefense;
        }
        if(w.id==2){
            Weapon w2 = new Weapon(2,"权戒",10,20);
            h.equipment=w2.name;
            h.power=h.power+w2.addPower;
            h.defense=h.defense+w2.addDefense;
        }
        if(w.id==3){
            Weapon w3 = new Weapon(3,"魅惑之眼",15,15);
            h.equipment=w3.name;
            h.power=h.power+w3.addPower;
            h.defense=h.defense+w3.addDefense;
        }
        System.out.println("法师拾取装备"+h.equipment);
    }
    //法师的特殊技能破防
    public void UseSkill(Soldier s,Master m) {
        System.out.println("法师使用技能破防");
        s.blood-=m.power;
    }

}
