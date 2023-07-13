package FirstGame;

public class Weapon {
    //属性
    public int id;
    int addPower;
    int addDefense;
    public String name;
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
