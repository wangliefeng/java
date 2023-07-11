package FirstGame;

public class Soldier extends Hero {
    //战士的特殊技能红温
    private String skill;
    public Soldier(){}
    public void UseSkill(String skill){
        System.out.println("使用技能");
    }
}
