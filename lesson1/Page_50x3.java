package lesson1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
/**
 С помощью цикла for подсчитайте сумму всех четных чисел в диапазоне от -20 до 20.
 */

public class Page_50x3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = -20; i <= 20; i++) {
            if ((i%2==0)&&(i!=0)) {
                sum = sum + i;
                //System.out.print(sum + " ");
            }


        }
        //System.out.println(" ");
        System.out.println("Cумма всех четных чисел в диапазоне от -20 до 20 = " + sum);
        System.out.println("End");
    }

}
