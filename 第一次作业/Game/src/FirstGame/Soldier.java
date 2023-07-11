package FirstGame;

public class Soldier extends Hero {
    //战士的特殊技能红温
    private String skill;
    public Soldier(){}
    public Soldier(String name, int blood, int power, int defense,String equipment){
        super(name,blood,power,defense,equipment);
        this.skill=skill;
    }
    @Override
    public void take(Weapon w){
        System.out.println("战士拾取装备"+w);
    }
    @Override
    public void UseSkill(){
        System.out.println("战士使用技能红温");
    }
}
