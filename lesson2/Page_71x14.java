package lesson2;

import java.util.Scanner;

/*
  Проверьте, является ли введённое пользователем с клавиатуры натуральное число – простым.
  Постарайтесь не выполнять лишних действий (например, после того, как вы нашли хотя бы один нетривиальный делитель уже ясно, что число составное и проверку продолжать не нужно).
  Также учтите, что наименьший делитель натурального числа n, если он вообще имеется, обязательно располагается в отрезке [2; √n].
  Если число не простое – выведите все его простые делители.
 */
public class Page_71x14 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        if (sc.hasNextLong()) {
            long num = sc.nextLong();


            int Dev = 2;

            do {

                if (num % Dev == 0) {
                    System.out.print("Число составное");
                    break;
                }
                Dev++;
                if (Dev >= Math.sqrt(num)) {
                    System.out.print("Число простое ");
                }

            }
            while (Dev < Math.sqrt(num));
        } else {
            System.out.println("Введенные данные не соответствуют условиям!");
        }

        System.out.println(" ");
        System.out.println("End");

    }
}


