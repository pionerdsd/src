package to_Lesson7a;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во студентов");
        int NumOfStud = sc.nextInt();
        Students students = new Students();
        students.Students(NumOfStud);
        students.InsertStudens();
        students.Show();
        /*Scanner sc1 = new Scanner(System.in);
        System.out.println("Выберете из списка студента и введите имя студента : ");
        students.Show();

        String name = sc1.nextLine();
        System.out.println("Введите курс студента : ");
        Scanner sc2 = new Scanner(System.in);
        int coures = sc2.nextInt();
        students.selectShow(name,coures);
        students.copy();
        */



        students.divToCourrse();
       // students.insertDivToCourse();
        students.ShowDiv();





    }
}
