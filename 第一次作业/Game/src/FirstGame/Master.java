package FirstGame;

public class Master extends Hero {

    private String skill;
    public Master(){}
    public Master(String name, int blood, int power, int defense,String equipment){
        this.skill=skill;
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
