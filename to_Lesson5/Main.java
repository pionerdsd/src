package to_Lesson5;

/**
 * Created by dmurashko on 17.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student();
        ivanov.nameStudent = "Ivanov";
        ivanov.numberCourse = 1;
        System.out.println(ivanov.nameStudent + " " + ivanov.numberCourse);
        Student petrov = new Student();
        petrov.nameStudent = "Petrov";
        petrov.numberCourse = 2;
        System.out.println(petrov.nameStudent + " " + petrov.numberCourse);

        petrov = ivanov;
        System.out.println(ivanov.nameStudent + " " + ivanov.numberCourse);
        System.out.println(petrov.nameStudent + " " + petrov.numberCourse);
        ivanov.numberCourse = 3;
        ivanov.nameStudent = "New Ivanov";
        System.out.println(ivanov.nameStudent + " " + ivanov.numberCourse);
        System.out.println(petrov.nameStudent + " " + petrov.numberCourse);

        ivanov.show();
        petrov.show();
        System.out.println(ivanov.Ball());
        System.out.println(petrov.Ball(new int[]{5, 4, 3, 2, 1}));
        Student vasilev = new Student();
        System.out.println(vasilev.nameStudent + " " + vasilev.numberCourse);
        Student egorov = new Student("Egor", 3);
        System.out.println(egorov.nameStudent + " " + egorov.numberCourse);
        Figura figura = new Figura();
        Figura figura1 = new Figura(50);
        Figura figura2 = new Figura(figura1);


        System.out.println("Площадь квадрата со стророной 5 = " + figura.figura(5.0));
        System.out.println("Площадь круга с радиусом  5 = " + figura.figura(5));
        System.out.println("Площадь прямоугольника со стророной 5 и 6 = " + figura.figura(5, 6));
        /*
        System.out.println(figura.equals(figura));
        System.out.println(figura.equals(figura1));
        System.out.println(figura2.Equals(figura));
        System.out.println(figura2.Equals(figura1));
        System.out.println(figura2.Equals(figura2));
        */
        Student petya = new Student("Petya", 5);
        Student clonPetya = new Student(petya);
        System.out.println(petya.nameStudent + " " + petya.numberCourse);
        System.out.println(clonPetya.nameStudent + " " + clonPetya.numberCourse);

        Student test = new Student();




    }
}
