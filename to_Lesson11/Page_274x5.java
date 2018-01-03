package to_Lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by dmurashko on 01.12.2017.
 */
public class Page_274x5 {
    public static void main(String[] args) {


        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i < 10; i++) {
            list.add(i);

        }
        System.out.println(list);
while (list.size()>1){
            int i = 0;
            while (i<list.size()-1){
                list.set(i,list.get(i)+list.get(i+1));
                i++;


            }
    list.removeLast();
    System.out.println(list);

}





    }
}