package to_Lesson5;

/**
 Напишите статический перегруженный метод для расчета площади фигуры. Расчет площади квадрата – передаем 1 параметр double; круга – 1 параметр int; прямоугольника – 2 параметра double
 */
public class Figura {
   public int radius;
   public Figura()
   {
   radius = 100;
    }
    public Figura (int radius){
       this.radius=radius;
    }
    public  Figura(Figura figure){
        this.radius =figure.radius;
    }



    public double figura(double x){
        return x*x;

    }
    public double figura(int x) {
        return Math.PI * x*x;
    }

        public double figura(double x, double y){
            return x*y;

        }


        public boolean Equals (Figura f){
        if (f.radius == this.radius) return true;
        else return false;

        }


}
