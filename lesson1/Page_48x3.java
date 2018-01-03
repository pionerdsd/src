package lesson1;

import java.util.Scanner;
/*
Организуйте бесконечный цикл вычисляющий факториал числа введенного с клавиатуры. Выход из цикла с помощью break.
 */
public class Page_48x3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 0 до 49: ");
        long i = 1;
        long f = 1;
        // if (sc.hasNextInt()&& sc.nextInt()>=0&& sc.nextInt()<50){ //не смог сделать так, чтобы не вводить число 3 раза

        if (sc.hasNextLong()){
            long num = sc.nextLong();
            if (num >= 0 && num < 50) {
                while (true) {
                    if (i <= num) {
                        f = f * i;
                        i++;
                    } else
                        break;
                }
                System.out.println("Факториал чилса " + num + " = " + f);
            } else System.out.println("Введенные данные не соответствуют условиям!");
        }else System.out.println("Введенные данные не соответствуют условиям!");
        System.out.println("End");



    }
}
