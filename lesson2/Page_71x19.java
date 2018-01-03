package lesson2;

/*
 Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155] целое число в интервал (25;100) и сообщать результат на экран.
 */
public class Page_71x19 {
    public static void main(String[] args) {
        int min = 5, max = 155;
        int num = (int)(Math.random()*(max-min+1)+min);

        if(num > 25 && num < 100){
            System.out.println("Число " + num + " содержится в интервале (25,100)");
        } else {
            System.out.println("Число " + num + " не содержится в интервале (25,100)");
        }

    }

}
