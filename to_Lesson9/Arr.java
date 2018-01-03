package to_Lesson9;
import java.util.Scanner;

public class Arr implements Arif {

    int[][] mass;

    @Override
    public Arif sum(Arif x, Arif y) {

        Arr tempx = (Arr) x;
        Arr tempy = (Arr) y;
        Arr tempz = new Arr();

        tempz.mass = tempx.mass;
        for (int i = 0; i < tempy.mass.length; i++) {
            for (int j = 0; j < tempy.mass.length; j++) {
                tempz.mass[i][j] = tempx.mass[i][j] + tempy.mass[i][j];
            }


        }


        return tempz;
    }


    @Override
    public boolean eq(Arif x, Arif y) {
        Arr tempx = (Arr) x;
        Arr tempy = (Arr) y;
        if (tempx.mass.length > tempy.mass.length) {
            return true;
        } else return false;

    }


    public static int[][] crateMass() {
        int[][] mas = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы :");
        if (scanner.hasNextInt()) {
            int len = scanner.nextInt();
            mas = new int[len][len];
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    mas[i][j] = (int) (Math.random() * 11);

                }
            }


        } else System.out.println("Не верны вводные данные!");
        return mas;
    }

    public static void ShowMass(int[][] mas) {
        System.out.println("Вывожу  матрицу  :");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {

                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
