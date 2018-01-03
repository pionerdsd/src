package to_Lesson8;

/**
 * Created by dmurashko on 22.11.2017.
 */
public class Kitten extends Cat {
    public String EatTime;
    public Kitten (int weight, int age, String name, int kills, String EatTime) {
        super(weight,age,name,kills);
        System.out.println("Kitten");
        this.EatTime = EatTime;
    }

}
