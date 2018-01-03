package Lesson3;

/**
 * Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9].
 * Вывести массив на экран.
 * Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент.
 * При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки.
 * Порядок остальных элементов строки не важен (т.е. можно соврешить только одну перестановку, а можно отсортировать по убыванию каждую строку).
 * Вывести преобразованный массив на экран.
 */
public class Page_74x32 {

    public static void main(String[] args) {
        int table[][] = new int[6][7];
        int min = 0;
        int max = 9;


        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (int) (Math.random() * (max - min + 2) + min - 1);
            }
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < table.length; i++) {
            int temp = 0;
            for (int j = 0; j < table[i].length; j++) {
                for (int k = j + 1; k < table[i].length; k++) {
                    temp = table[i][j];
                    if (temp < table[i][k]) {
                        temp = table[i][k];
                    }
                    //System.out.println(temp);
                }


            }

            //System.out.println(temp);

        }


    }
}