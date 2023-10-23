import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Алексей");
        names.add("Иван");
        names.add("Олег");
        names.add("Максим");
        names.add("Анна");
        names.add("Ольга");
        names.add("Ксения");
        names.add("Анастасия");
        names.add("Светлана");
        names.sort(String::compareTo);
        System.out.println(names);
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) { //Если тут поставить <
                    return 1;
                } else if (o1.length() < o2.length()) { // а тут >, то будет по убыванию длины
                    return -1;
                }
                return 0;
            }
        };
        names.sort(comparator);
        System.out.println(names);
        names.sort(Comparator.reverseOrder());
        System.out.println(names);
        Set<String> setStr = new HashSet<>(names);
        System.out.println(setStr);
        names.sort(String::compareTo);
        System.out.println(names.get(0));
        List<String> namesList = new ArrayList<>();
        for (String n : names) {
            if (!n.contains("а") && !n.contains("А")) {
                namesList.add(n);
            }
        }
        System.out.println(namesList);
    }

}