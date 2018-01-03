package lesson1;

/*
Напишите цикл while выводящий числа последовательности 1, 4, 7, 10… до тех пор,
пока их произведение не превысит 300 или сумма 200.
Выведите количество этих чисел.
 */
public class Page_48x2 {
    public static void main(String[] args) {
        int sum =0, mult= 1, count =1, num =1;
        while (mult < 300 && sum < 200 ){

            num += 3;
            mult *=num;
            sum +=num;
            count++;
            //System.out.println("число = " + num);
           // System.out.println("умножение = " + mult);
            //System.out.println("сложение = " + sum);


        }
        System.out.println("кол-во = " + count);
        System.out.println("End");
    }

}
