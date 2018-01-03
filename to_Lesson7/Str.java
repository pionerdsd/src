package to_Lesson7;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.isDigit;

/**
 * Написать класс, в котором как поле объявлен массив строк.
 * Вводим количество строк с консоли. Организовать ввод строк с консоли до тех пор, пока в какой-то строке не встретится слово end, остальные строки заполняются цифрами = номер строки.
 * Отсортируйте строки по длине. Определите, есть ли среди строк одинаковые. Выведите 3 последних элемента самой длинной строки. Преобразуйте 2 строку к верхнему регистру.
 * Разделите самую длинную строку на слова. Определить является ли второй символ самой короткой строки цифрой.
 */
public class Str {
    String[] mass;


    public void strCreate(int count) {

        Scanner sc = new Scanner(System.in);
        mass = new String[count];
        int i = 0;
        System.out.println("Введите " + count + " строк");
        while (i < mass.length) {

            mass[i] = sc.nextLine();

            if (mass[i].contains("end")) {
                i++;
                while (i < mass.length) {
                    mass[i] = Integer.toString(i);
                    i++;
                }
            }
            i++;

        }
    }

    public void strSort() {
        System.out.println("Выполняется сортировку по длине");
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i].length() < mass[j].length()) {
                    String temp2 = mass[i];
                    mass[i] = mass[j];
                    mass[j] = temp2;

                }
            }

        }
    }

    public void equals() {
        System.out.println("Определяем, есть ли среди строк одинаковые");
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i].equals(mass[j])) {
                    System.out.println("Строка № " + i + " Эквивалентна строке № " + j);


                }
            }
        }
    }


    public int maxStrIndex() {

        int maxStrIndex = 0;

        int maxStr = mass[0].length();
        for (int i = 1; i < mass.length; i++) {
            {
                if (maxStr < mass[i].length()) {
                    maxStr = mass[i].length();
                    maxStrIndex = i;
                }
            }
        }
        return maxStrIndex;
    }

    public int minStrIndex() {

        int minStrIndex = 0;

        int maxStr = mass[0].length();
        for (int i = 1; i < mass.length; i++) {
            {
                if (maxStr > mass[i].length()) {
                    maxStr = mass[i].length();
                    minStrIndex = i;
                }
            }
        }
        return minStrIndex;
    }

    public void last2Smb() {
        System.out.println("Выводим 3 последних элемента самой длинной строки.");

        if (mass[maxStrIndex()].length() > 3) {

            System.out.println(mass[maxStrIndex()].substring(mass[maxStrIndex()].length() - 3, mass[maxStrIndex()].length()) + mass[maxStrIndex()].substring(mass[maxStrIndex()].length()));

        }
    }

    public void toUpperCase() {
        System.out.println("Преобразуем 2 строку к верхнему регистру");
        System.out.println(mass[1].toUpperCase());

    }


    public void Show(String[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.println(i + " " + mass[i]);
        }
    }

    public void Show() {
        for (int i = 0; i < mass.length; i++) {
            System.out.println(i + " " + mass[i]);
        }
    }

    public void strToWord() {
        System.out.println("Разделяем самую длинную строку на слова");
        String[] parts = (mass[maxStrIndex()] + " ").split("\\p{P}?[ \\t\\n\\r]+");
        //System.out.println(Arrays.toString(parts));
        Show(parts);

    }

    public void isNum(){

        if (mass[minStrIndex()].length() > 2) {
            char c = mass[minStrIndex()].charAt(1);
            if (isDigit(mass[minStrIndex()].charAt(1))) {
                System.out.println("Второй элемент " + mass[minStrIndex()] + " строки цифра");
            }
        }

    }


}



