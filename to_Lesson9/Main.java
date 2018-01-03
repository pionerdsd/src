package to_Lesson9;


public class Main {

    public static void main(String[] args) {


        //Arr arr = new Arr();
        Arr ay = new Arr();
        ay.mass = Arr.crateMass();
        Arr.ShowMass(ay.mass);
        Arr ax = new Arr();
        ax.mass = Arr.crateMass();
        Arr.ShowMass(ax.mass);

        if (ay.eq(ax, ay)) {
            ay = (Arr) ay.sum(ax, ay);
            Arr.ShowMass(ay.mass);
        } else {
            ay = (Arr) ay.sum(ay, ax);
            Arr.ShowMass(ay.mass);
        }


        //Strng strng = new Strng();
        Strng y = new Strng();
        y.ch = Strng.createCharArray();
        Strng.showChars(y.ch);
        Strng x = new Strng();
        x.ch = Strng.createCharArray();
        Strng.showChars(x.ch);
        System.out.println("Summing has been staring...");
        y = (Strng) y.sum(x, y);
        Strng.showChars(y.ch);
        String s1 = new String(x.ch);
        String s2 = new String(y.ch);
        if (y.eq(x, y)) {
            System.out.println(s1 + " эквивалентен " + s2);
        } else {
            System.out.println(s1 + " не эквивалентен " + s2);
        }
    }

}


