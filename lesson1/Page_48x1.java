package lesson1;

/*
С помощью цикла while и оператора if определяйте четность чисел и выводите их (числа от 1 до 10).
1-нечетное
2-четное
И т.д
 */
public class Page_48x1 {
    public static void main(String[] args) {
        int i = 1;
        while (i != 11) {
            if (i % 2 == 0) {
                System.out.println(i + " четное");
            } else {
                System.out.println(i + " нечетное");
            }
            i++;
        }
        System.out.println("End");
    }
}
