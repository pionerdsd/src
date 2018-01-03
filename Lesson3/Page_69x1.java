package Lesson3;

/**
 *
 * Убил пол дня!!!! на пункт 4!
 Задание:
 1. Нужно создать нерегулярный массив, подобный table:
 int table[ ] [ ] = new int[ 4] [ ];
 table[0] = new int[7];
 table[1] = new int[3];
 table[2] = new int[5];
 table[3] = new int[1];
 Количество строк вводится, а количество элементов в каждой строке задается случайным образом в диапазоне от 1 до 10.
 2. Заполнить его какими-нибудь элементами.
 3. Вывести массив красиво (чтоб он выглядел как массив, а не строка или столбец ).
 4. Необходимо переставить строки массива, чтобы их размер возрастал (или убывал).
 5. Вывести получившийся массив.

 */


public class Page_69x1 {
    public static void main(String[] args) {
        int table[][] = new int[4][];
        int tableNew[][] = new int[4][];
        int min = 1;
        int max = 10;


        table[0] = new int[(int) (Math.random() * (max - min + 1) + min)];
        table[1] = new int[(int) (Math.random() * (max - min + 1) + min)];
        table[2] = new int[(int) (Math.random() * (max - min + 1) + min)];
        table[3] = new int[(int) (Math.random() * (max - min + 1) + min)];
        for (int i = 0; i < table.length; i++) {
            //System.out.println("Размер строки" + i + " массива table = " + table[i].length);
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


//Промежуточный массив соответствие индекса строк и длин строк массива tabel.
        int indexTable[][] = new int[2][table.length];
        for (int i = 0; i < table.length; i++) {
            indexTable[0][i] = i;
            indexTable[1][i] = table[i].length;

        }
/*
        for (int i = 0; i < indexTable.length; i++) {
            for (int j = 0; j < indexTable[i].length; j++) {
                System.out.print(indexTable[i][j] + "\t");
            }
            System.out.println();

        }
*/

//Сортировка промежуточного массива  по  длинне строк массива table.
        for (int i = 0; i < indexTable[1].length; i++ ) {

            for (int j = i + 1; j < indexTable[1].length; j++) {
                //System.out.print("Сравнение" + indexTable[1][i] + " и " + indexTable[1][j]);
                if (indexTable[1][j] > indexTable[1][i]) {

                    int tempLength = indexTable[1][j];
                    indexTable[1][j] = indexTable[1][i];
                    indexTable[1][i] = tempLength;
                    //System.out.print(indexTable[i][j] + "\t");
                    int tempIndex = indexTable[0][j];
                    indexTable[0][j] = indexTable[0][i];
                    indexTable[0][i] = tempIndex;


                }
            }
        }

/*
            for (int i = 0; i < indexTable.length; i++) {
                for (int j = 0; j < indexTable[i].length; j++) {
                    System.out.print(indexTable[i][j] + "\t");
                }
                System.out.println();

            }
*/



//Cоздание нового отсортированного по длинне строк массива tableNew на основе массива table .

        for (int i = 0; i < table.length; i++) {
            tableNew [i] = new int[indexTable[1][i]];
            for (int j = 0; j < indexTable[1][i]; j++) {

                tableNew [i][j] = table[indexTable[0][i]][j];

                //System.out.print(tableNew[i][j] + "\t");

                //System.out.print(table[indexTable[0][i]][j] + "\t");
            }
            System.out.println();
        }


       for (int i = 0; i < tableNew.length; i++) {
            for (int j = 0; j < tableNew[i].length; j++) {
                System.out.print(tableNew[i][j] + "\t");
            }
            System.out.println();
        }

            }
        }








