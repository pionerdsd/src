package lesson1;

/*
Вывести все четные числа от -50 до 50.
 */
public class Page_50x1 {
    public static void main(String[] args) {
           for (int i = -50; i <= 50; i++) {
               if ((i%2==0)&&(i!=0)) {
                   System.out.print(i + " ");
               }

           }
        System.out.println(" ");
        System.out.println("End");
    }
}
