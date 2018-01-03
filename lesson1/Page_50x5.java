package lesson1;

/**
 Выведите все простые числа до 100.
 */
public class Page_50x5 {


    public static void main(String[] args) {
        int Num, Dev;
        for (Num = 2; Num < 100; Num++) {

             for (Dev = 2; Dev < Num; Dev++) {
                if (Num%Dev == 0) {
                      break;
                }
                }
                if (Num==Dev){
                    System.out.println(Num);
            }

        }
        System.out.println("End");
    }

}