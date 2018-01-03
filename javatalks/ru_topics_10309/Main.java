package javatalks.ru_topics_10309;

        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;
        import java.util.List;


class Main {

    public static void main(String[] args) {
        List<Program> list = new ArrayList<Program>();
        list.add(new Program(1, "a"));
        list.add(new Program(1, "a"));
        list.add(new Program(0, "b"));
        list.add(new Program(0, "c"));

        // Перемешиваем для теста
        Collections.shuffle(list);
        System.out.println(list);

        Comparator<Program> comp = new Comparator<Program>() {
            @Override
            public int compare(Program o1, Program o2) {
                if (o1.name != o2.name) {
                    if (o1.name != null)
                        return o2.name != null ? o1.name.compareTo(o2.name) : 1;
                    else
                        return o2.name != null ? -1 : 0;
                } else {
                    return 0;
                }
            }
        };

        // Сортируем элементы
        Collections.sort(list, comp);
        System.out.println(list);

        // Ищем элемент идентичный искомому
        int pos = Collections.binarySearch(list, new Program(-1, "b"), comp);
        if (pos >= 0) {
            System.out.println("finded: "+pos);
        } else {
            System.out.println("no such element");
        }
    }

}