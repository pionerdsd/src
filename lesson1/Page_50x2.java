package lesson1;

import java.util.Scanner;

/*
 Вывести все числа кратные 5 от 0 до введенного числа и посчитать их количество.
 */
public class Page_50x2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральое  число не более 9223372036854775807 : ");
        if (sc.hasNextLong()) {
            long num = sc.nextLong();
            long max = 9223372036854775807L;
            long count = 0;
            if ((num >= 5)&&(num <= max )) {
                for (long i = 5; i <= num; i += 5) {
                    System.out.println("Число " + i + " кратно 5 и принадлежит числу " +num);
                    count++;
                     }
                System.out.println("Кол-во значений в числе " + num + " кратных 5 = " + count);
            } else System.out.println("Введеное значение не соответствует условиям");
        }else System.out.println("Введеное значение не соответствует условиям");
        System.out.println("End");
    }
}
