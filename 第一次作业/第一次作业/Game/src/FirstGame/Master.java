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
    public void take(Weapon w){
        System.out.println("法师拾取装备"+w);
    }
    //法师的特殊技能吃口药
    @Override
    public void UseSkill(){
        System.out.println("法师使用技能吃口药");
    }

}
