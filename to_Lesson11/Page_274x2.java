package to_Lesson11;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by dmurashko on 01.12.2017.
 */
public class Page_274x2 {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(-2);
        list.add(-1);
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

    }
}
