package to_Lesson5;

import java.util.Scanner;

/**
 * Created by dmurashko on 17.11.2017.
 */
public class Student {
    public String nameStudent;
    public int numberCourse;

    public Student(){
        nameStudent = "Vasya";
        numberCourse = 1;
    }
    public Student(String nameStudent, int numberCourse){
        this.nameStudent = nameStudent;
        this.numberCourse = numberCourse;
    }
    public Student(Student student){
        this.nameStudent = student.nameStudent;
        this.numberCourse = student.numberCourse;
    }


    public void show() {
        System.out.println(nameStudent + " " + numberCourse);
    }

    public double Ball() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 5 оценок  ученика , : ");
        double num = 0;
        double count = 0;
        do {
            num += sc.nextInt();
            count++;

        } while (count != 5);

        return (num / count);
    }


    public double Ball(int [] mass){
        double sreniyBall=0;
        int i;
        for ( i =0; i<mass.length; i++){

            sreniyBall += mass[i];
        }
        return sreniyBall/i;
    }

}
