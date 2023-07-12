package demo2;

public class User {
    private String username;
    private String email;
    private String gender;
    private int age;

    public User(){}
    public User(String username, String email,String gender,int age){
        this.username=username;
        this.email=email;
        this.gender=gender;
        this.age=age;
    }

    public String getUsername(String username){
        return username;
    }
}
//快捷键
//alt + Fn + insert