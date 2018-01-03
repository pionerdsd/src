package to_Lesson9;

import java.util.Scanner;

public class Strng implements Arif {
    char[] ch;


    @Override
    public Arif sum(Arif x, Arif y) {
        Strng tempx = (Strng) x;
        Strng tempy = (Strng) y;
        Strng temp = new Strng();
        String z = new String(tempy.ch) + new String(tempx.ch);
        temp.ch = z.toCharArray();
        return temp;
    }

    @Override
    public boolean eq(Arif x, Arif y) {
        Strng tempx = (Strng) x;
        Strng tempy = (Strng) y;
        String s1 = new String(tempx.ch);
        String s2 = new String(tempy.ch);
        if (s1.equals(s2)) {

            return true;
        } else return false;

    }


    public static char[] createCharArray() {
        System.out.println("Input a string!");
        String st;
        Scanner scanner = new Scanner(System.in);
        st = scanner.nextLine();
        char[] chr = st.toCharArray();

       /*char [] chr = new char[st.length()];
        for (int i=0; i<st.length(); i++){
            chr[i] = st.charAt(i);
        }*/

        System.out.println("The arrays of char has been crating");


        return chr;
    }

    public static void showChar(char[] x) {
        System.out.println("Введите индекс от 0 до " + x.length);
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i < x.length) {
            System.out.println("Сивол с индексом " + i + " строки " + x + " = " + x[i]);
        } else System.out.println("Введен некорректный индекс!");
    }

    public static void showChars(char[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
        }
        System.out.println();
    }


}

