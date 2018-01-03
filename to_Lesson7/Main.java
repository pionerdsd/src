package to_Lesson7;

import java.util.Scanner;

/**
 * Created by dmurashko on 20.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Str str = new Str();


        System.out.println("Введите кол-во строк: ");
        int count = sc.nextInt();

        str.strCreate(count);
        str.Show();
        str.strSort();
        str.Show();
        str.equals();
        str.last2Smb();
        str.toUpperCase();
        str.strToWord();
        str.isNum();

    }
}
