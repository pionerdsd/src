package to_Lesson8;

/**
 * Created by dmurashko on 22.11.2017.
 */
public class Animals {

    private int weight;
    private  int age;
    private  String name;
    public Animals (){}

    public Animals(int weight, int age, String name){
        System.out.println("Animals");
        this.weight = weight;
        this.age = age;
        this.name = name;

    }

    public void showFields (){
        System.out.print("weight : " + weight + " age : " +age + " name : " +name);
    }
}
