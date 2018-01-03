package toLesson10;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by dmurashko on 28.11.2017.
 */
public class Main {
    public static void main(String[] args) {
      /*  Test<Integer> test = new Test<Integer>(4);
        Test<Double> test2 = new Test<Double>(6.0);

        System.out.println(test.sum(test,test2));

        //test.setObS("Paradise");
        */
        Products p = new Products("Mouse","Logitech");
        Products p1 = new Products("Keyboard","Lenovo");
        Products p2 = new Products("Monitor","LG");
        Products p3 = new Products("Printer","Canon");


        Collection<Products> products;
        products = new LinkedList<Products>();
        products.add(p);
        products.add(p1);
        products.add(p2);
        products.add(p3);
       // System.out.println(products.toString());
        Iterator it = products.iterator();

while (it.hasNext()){
    System.out.println(  products.toString());
    it.next();
}









    }
}
