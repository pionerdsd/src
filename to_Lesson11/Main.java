package to_Lesson11;
import java.util.LinkedList;

/**
 * Created by dmurashko on 30.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        Stud st1 = new Stud();

        LinkedList<Stud> studs = new LinkedList<>();
        studs.add(new Stud("Vasya", 1));
        studs.add(new Stud("Masha", 1));
        studs.add(new Stud("Kolya", 2));
        studs.add(new Stud("Tanya", 2));
        studs.add(new Stud("Petya", 3));
        studs.add(new Stud("Nadya", 3));
        studs.add(new Stud("Igor", 4));
        studs.add(new Stud("Lena", 4));
        studs.add(new Stud("Ivan", 5));
        studs.add(new Stud("Katya", 5));

        LinkedList<Stud> studs1 = new LinkedList<>();
        studs1.add(new Stud("Vasya", 1));
        studs1.add(new Stud("Jhon", 1));
        studs1.add(new Stud("Inna", 2));
        studs1.add(new Stud("Nick", 2));
        studs1.add(new Stud("Julia", 3));
        studs1.add(new Stud("Jack", 3));
        studs1.add(new Stud("Igor", 4));
        studs1.add(new Stud("Lena", 4));
        studs1.add(new Stud("Ivan", 5));
        studs1.add(new Stud("Katya", 5));

        System.out.println("LinkedList №1 - " + studs);
        st1.find(studs,1);
        System.out.println("LinkedList №2 - " + studs1);
        System.out.println("Crating new union ..." + st1.union(studs1,studs));
        System.out.println("Crating new intersect ..." + st1.intersect(studs1,studs));
        /*System.out.println("Crating new unintersect ..." + st1.unintersect(studs1,studs));*/
        System.out.println("Sorting by course ..." + st1.sort(studs));



    }


}