package FirstGame;

public class Hero {
    //属性
    private String name;
    private int blood;
    private int power;
    private int defense;

    //行为
    public Hero(){
    }
    public Hero(String name, int blood, int power, int defense){
        this.name=name;
        this.blood=blood;
        this.power=power;
        this.defense=defense;
    }
    public void attack(){
        System.out.println("普通攻击");
    }
    public void take(){
        System.out.println("拾取装备");
    }
    public void UseSkill(String skill){
        System.out.println("使用技能");
    }
}
