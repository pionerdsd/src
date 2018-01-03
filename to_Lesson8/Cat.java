package to_Lesson8;

/**
 * Created by dmurashko on 22.11.2017.
 */
public class Cat extends Animals {
    public int kills;
    public Cat(){
        super();
    }
        public Cat (int weight, int age, String name,int kills){

        super(weight,age,name);
            System.out.println("Cat");
        this.kills =kills;

    }

    @Override
    public void showFields() {
        System.out.println();
        super.showFields();
        System.out.println(" kills : " + kills);
    }
}
