package to_Lesson11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class Page_274x3 {


    public static void main(String[] args) {


        LinkedList<String> list = new LinkedList<>();
        ArrayList<String> array = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            list.add(String.valueOf(i));
            array.add(String.valueOf(i));
        }


        long startTime2 = System.currentTimeMillis();

        try {
            while (array.size() > 1) {


                Iterator<String> it = array.iterator();

                while (it.hasNext()) {
                    String s = it.next();
                    it.remove();
                    it.next();
                    it.remove();
                    array.add(array.size(), s);

                    break;
                }

            }
        } catch (Exception e) {
            System.out.println(e);

        }
        System.out.println(array);

        System.out.println(System.currentTimeMillis() - startTime2 + " милисекунд");

        long startTime = System.currentTimeMillis();

        try {
            while (list.size() > 1) {


                Iterator<String> it = list.iterator();

                while (it.hasNext()) {
                    String s = it.next();
                    it.remove();
                    it.next();
                    it.remove();
                    list.addLast(s);

                    break;
                }

            }
        } catch (Exception e) {
            System.out.println(e);

        }
        System.out.println(list);

        System.out.println(System.currentTimeMillis() - startTime + " милисекунд");


        long startTime3 = System.currentTimeMillis();


        while (list.size() > 1) {
            Iterator iterator = list.iterator();
            for (int i = 0; iterator.hasNext(); i++, iterator.next()) {
                if (i % 2 == 1) {
                    i = 0;
                    iterator.remove();
                }
            }
        }
        System.out.println(list);
        System.out.println(System.currentTimeMillis() - startTime3 + " милисекунд");


    }
}



