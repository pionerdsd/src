package toLesson10;

/**
 * Напишите параметризированный класс с двумя параметрами, ограниченными классом Number и разработайте метод вычисления суммы двух чисел, любых типов,
 * метод сравнивающий поэлементно два массива разных типов, метод определяющий наибольший и наименьший элементы в массивах.
 */
public class Test<T extends Number> {
    private T obS;

    public Test(T obS) {
        this.obS = obS;

    }

    public void setObS(T obS) {
        this.obS = obS;
    }

    public T getObS() {
        return obS;
    }
    public Number sum(Test ob, Test ob1){
         return ob.obS.doubleValue() + ob1.obS.doubleValue();

    }

    public void meth() {
        System.out.println(obS + " " + obS.getClass().getName());


    }
}
