package FirstGame;

public class Weapon {
    //属性
    private int id;
    private int addPower;
    private int addDefense;
    private String name;
    //行为
    public Weapon(){
    }
    public Weapon(int id,String name,int addPower,int addDefense){
        this.id=id;
        this.name=name;
        this.addPower=addPower;
        this.addDefense=addDefense;
    }
}
