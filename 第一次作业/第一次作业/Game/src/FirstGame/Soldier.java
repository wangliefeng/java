package FirstGame;

public class Soldier extends Hero {
    //战士的特殊技能红温
    private String skill;
    public Soldier(){}
    public Soldier(String name, int blood, int power, int defense,String equipment,String skill){
        super(name,blood,power,defense,equipment);
        this.skill=skill;
    }
    public void showyourself(Soldier s){
        System.out.println(s.name+" 血量:"+s.blood+" 战斗力: "+s.power+" 防御力: "+s.defense+" 装备： "+s.equipment);
    }
    @Override
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
        System.out.println("战士拾取装备"+h.equipment);
    }
    @Override
    public void UseSkill(){
        System.out.println("战士使用技能红温");
    }
}
