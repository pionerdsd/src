package lesson1;

import java.util.Scanner;

/**
 Вывести все делители введенного числа.
 */
public class Page_50x4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое  число от -9223372036854775807 до -9223372036854775808 : ");
        if (sc.hasNextLong()) {
            long num = sc.nextLong();
            long max = 9223372036854775807L;
            long min = -9223372036854775808L;
            long div = 0;
            if ((num <= max) && (num != 0)) {
                for (long i = 1; i < max; i++) {
                    if (num % i == 0) {
                        System.out.println(i + " Является делителем чсила " + num);
                    }
                }
            } else if ((num >= min) && (num != 0)) {
                for (long i = -1; i > min; i--) {
                    if (num % i == 0) {
                        System.out.println(i + " Является делителем чсила " + num);

                    }

                }

            }else System.out.println("Введеное значение не имеет делителей");
        }else System.out.println("Введеное значение не соответствует условиям");
        System.out.println("End");
    }
}
