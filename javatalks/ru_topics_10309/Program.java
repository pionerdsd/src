package javatalks.ru_topics_10309;

class Program implements Comparable<Program> {
    public int size;
    public String name;

    public Program(int size, String name) {
        this.size = size;
        this.name = name;
    }

    // Описываем "натуральный порядок" для объектов данного класса
    @Override
    public int compareTo(Program p) {
        if (p == null)
            throw new NullPointerException();
        if (name != p.name) {
            if (name != null)
                return p.name != null ? name.compareTo(p.name) : 1;
            else
                return p.name != null ? -1 : 0;
        } else {
            return size > p.size ? 1 : size == p.size ? 0 : -1;
        }
    }

    @Override
    public String toString() {
        return name+";"+size;
    }
}