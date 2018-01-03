package lesson1;

import java.util.Scanner;

/**
 * Created by dmurashko on 10.11.2017.
 */
public class Page_53x1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите  номер месяца (от 1 до 12) : ");
        if (sc.hasNextLong()) {
             int month = sc.nextInt();
             if (month>=1 && month<=12 ){
                 switch (month){
                     case 12:case 1: case 2:
                         System.out.println("winter");
                         break;
                     case 3:case 4:case 5:
                         System.out.println("Spring");
                         break;
                     case 6:case 7:case 8:
                         System.out.println("Summer");
                         break;
                     case 9:case 10:case 11:
                         System.out.println("Autumn");
                 }
             } else System.out.println("Некорректный номер месяца!");
        }else System.out.println("Введенные данные не соответствуют условиям!");
        System.out.println("End");
    }
}
