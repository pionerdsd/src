package to_Lesson11;

import java.util.*;

/**
 * Created by dmurashko on 30.11.2017.
 */
public class Stud implements Comparable<Stud> {
    String name;
    int course;

    public Stud() {
    }

    public Stud(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


    public void find(LinkedList<Stud> list, int cours) {

        for (Stud s : list) {
            if (s.course == cours) {
                System.out.println(s.getCourse() + " " + s.getName());
            }
        }
    }

    public LinkedList union(LinkedList<Stud> set1, LinkedList<Stud> set2) {
        LinkedList<Stud> list = new LinkedList<>(set1);
        list.addAll(set2);
        return list;


    }
    public LinkedList<Stud> intersect(LinkedList<Stud> set1, LinkedList<Stud> set2) {
        LinkedList<Stud> list = new LinkedList<>();
        for (Stud s:set1){
            for (Stud s2:set2){
                if((s.course==s2.course)&&(s.name.equals(s2.name))){
                    list.add(s);
                }
            }
        }

    return list;
    }

    public TreeSet<Stud> sort(LinkedList list){
        TreeSet<Stud> set = new TreeSet<>(list);

        return set;
    }

/*
    // Метод создает TreeSet без дубликатов. Прошу пояснить как работает compareTo (писал не сам)

    public TreeSet unintersect(LinkedList<Stud> set1, LinkedList<Stud> set2) {
        TreeSet<Stud> set = new TreeSet<>(set1);
        set.addAll(set2);
        return set;


    }



    public int compareTo(Stud p) {
        if (p == null)
            throw new NullPointerException();
        if (name != p.name) {
            if (name != null)
                return p.name != null ? name.compareTo(p.name) : 1;
            else
                return p.name != null ? -1 : 0;
        } else {
            return course > p.course ? 1 : course == p.course ? 0 : -1;
        }
    }
*/



    @Override
    public int compareTo(Stud o) {
        if(this.course>o.course){
                 return 1;
            }
        if(this.course<o.course){
            return -1;
        }
        else return 1;





    }
    @Override
    public String toString() {
        return  name + " : " + course;
    }
}
