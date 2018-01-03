package to_Lesson7a;

import to_Lesson7.Str;

import java.util.Scanner;

public class Students {
    public String name;
    public int coures;
    public int[] grades;
    public static Students[] studentsMass;
    public Students[] strudents;
    public double ball;
    public static double maxBall = 0;
    public static int indexStudentmaxBall = 0;
    public String mass[][];
    String[] NAMES = {"Вася", "Коля", "Ира ", "Петя", "Володя", "Катя", "Аня", "Иван", "Надя", "Таня"};

    public void Students(int n) {

        strudents = new Students[n];
        for (int i = 0; i < strudents.length; i++) {
            strudents[i] = new Students();
        }
        studentsMass = strudents;


    }

    public void InsertStudens() {
        for (int i = 0; i < strudents.length; i++) {
            strudents[i].coures = (int) ((Math.random() * 5) + 1);
            int temp = (int) ((Math.random() * 11) + 5);
            strudents[i].grades = Grades(temp);
            strudents[i].name = NAMES[(int) (Math.random() * 10)];
        }
    }

    public int[] Grades(int temp) {
        int[] tempMass = new int[temp];
        for (int i = 0; i < temp; i++) {
            tempMass[i] = (int) ((Math.random() * 10) + 1);
        }
        return tempMass;

    }


    public void Show() {
        for (int i = 0; i < strudents.length; i++) {
            System.out.println(strudents[i].name + " - студент " + strudents[i].coures + "-ого курсa");
            System.out.println();
        }

    }

    public void Ball() {


        int j;
        for (int i = 0; i < strudents.length; i++) {
            double x = 0;
            for (j = 0; j < strudents[i].grades.length; j++) {
                x += strudents[i].grades[j];

            }
            strudents[i].ball = Math.rint(x / j);
            if (maxBall < strudents[i].ball) {
                maxBall = strudents[i].ball;
                indexStudentmaxBall = i;


            }

        }

    }


    public void selectShow(String name, int coures) {


        for (int i = 0; i < strudents.length; i++) {
            if (strudents[i].name.equals(name) && strudents[i].coures == coures) {
                System.out.println(strudents[i].name + " - студент " + strudents[i].coures + "-ого курсa");
                System.out.print("Оценки студента " + strudents[i].name + " ");
                System.out.println();
                for (int j = 0; j < strudents[i].grades.length; j++) {

                    System.out.print(strudents[i].grades[j] + "\t");
                }
                System.out.println();
                Ball();
                System.out.print("Средний бал " + strudents[i].name + " " + strudents[i].ball);
                System.out.println();
                System.out.println("Студент - " + strudents[indexStudentmaxBall].name + " , " + strudents[indexStudentmaxBall].coures + " курса, с наивысшим средним боллом - " + maxBall);
                System.out.print("Оценки студента " + strudents[indexStudentmaxBall].name + " ");
                System.out.println();
                for (int j = 0; j < strudents[indexStudentmaxBall].grades.length; j++) {

                    System.out.print(strudents[indexStudentmaxBall].grades[j] + "\t");
                }

            }
        }
    }

    public void copy() {
        System.out.println("Выполняем замену данных  студентов  ");
        System.out.println("Введите имя студента с которого снимаем копию");
        Scanner sc = new Scanner(System.in);
        String nameFrom = sc.nextLine();
        System.out.println("Введите курс студента с которого снимаем копию");
        Scanner sc2 = new Scanner(System.in);
        int courseFrom = sc2.nextInt();


        System.out.println("Введите имя студента в которого передаем копию");
        Scanner sc1 = new Scanner(System.in);
        String nameTo = sc1.nextLine();
        System.out.println("Введите курс студента с которого снимаем копию");
        Scanner sc4 = new Scanner(System.in);
        int courseTo = sc4.nextInt();
        int ifrom = -1;
        int ito = -1;
        for (int i = 0; i < strudents.length; i++) {
            if (strudents[i].name.equals(nameFrom) && strudents[i].coures == courseFrom) {
                ifrom = i;
            }
            if (strudents[i].name.equals(nameTo) && strudents[i].coures == courseTo) {
                ito = i;
            }
            if (ifrom >= 0 && ito >= 0) {
                break;
            }

        }
        if (ifrom < 0 || ito < 0) {
            System.out.println("Не корректный ввод!!!");
        } else {

            System.out.println("Копирую иформацию о " + strudents[ifrom].name + " в " + strudents[ito].name);
            strudents[ito] = strudents[ifrom];
            Show();
        }


    }


    public int couresCount(int n) {
        int count = 0;
        for (int i = 0; i < strudents.length; i++) {
            if (strudents[i].coures == n) {
                count++;
            }
        }
        return count;
    }

    public void divToCourrse() {
        mass = new String[5][];

        for (int j = 0; j < mass.length; j++) {
            int k=0;
            mass[j] = new String[couresCount(j+1)];
            for (int i =0; i<strudents.length; i++){
                if(strudents[i].coures==j+1){
                    mass[j][k] = strudents[i].name;
                    k++;
                }
            }


        }
    }


    public void ShowDiv() {

        for (int i = 0; i < mass.length; i++) {
            System.out.print ("Cтуденты " + (i+1) + " курса :");
            for (int j = 0; j < mass[i].length; j++) {

              System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }

    }





}



