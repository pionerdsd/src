package lesson2;

/*
 * Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.
 Примеры работы программы:
 В числе 208 наибольшая цифра 8
 В числе 774 наибольшая цифра 7
 */
public class Page_71x20 {
    public static void main(String[] args) {
        int n = (int)(Math.random()*1000);
        System.out.println(n);
        int n1 = n % 10;
        //System.out.println(n1);

        int n2 = n / 10 % 10;
        //System.out.println(n2);

        int n3 = n / 100 % 10;
        //System.out.println(n3);
        if(n1>=n2 && n1>=n3) {
            System.out.println("Наибольшая цифра числа " + n + " " + n1);
        }
            else if(n2>n1 && n2>n3) {
                System.out.println("Наибольшая цифра числа " + n + " " + n2);
            }
        else if(n3>n2 && n3>n1) {
            System.out.println("Наибольшая цифра числа " + n + " " + n3);
        }else if (n1==n2 && n1 ==n3){System.out.println("Все цифра числа " + n + " равнозначны");}


    }
}
