package toLesson10;

/**
 * Created by dmurashko on 29.11.2017.
 */
public class Products extends Deals {

    String name;
    String type;

    public Products(String name, String type) {
        super();
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
