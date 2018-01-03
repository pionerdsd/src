package Test_Lesson5;

/**
 * Created by dmurashko on 20.11.2017.
 */
public class Test {
public int a;

public static Test [] creatMas(int n){
    Test[] mas = new Test[n];
    for (int i=0; i<mas.length; i++) {
        mas[i] = new Test();
        mas[i].create();
    }
    return mas;
    }
    public void create() {
        int a1 = 5;
    }

    public static void showMas(Test[] mas){
    for(int i=0; i<mas.length; i++){
        System.out.println(mas[i].a);
    }

}
}
