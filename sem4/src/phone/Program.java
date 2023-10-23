package phone;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        NoteEmployee note = new NoteEmployee(10);
        Employee employee1 = new Employee("111", "name1", LocalDateTime.of(2018, Month.APRIL, 5, 5, 5));
        Employee employee2 = new Employee("112", "name2", LocalDateTime.of(2020, Month.APRIL, 5, 5, 5));
        Employee employee3 = new Employee("113", "name3", LocalDateTime.of(2020, Month.APRIL, 5, 5, 5));
        Employee employee4 = new Employee("114", "name3", LocalDateTime.of(2021, Month.APRIL, 5, 5, 5));
        Employee employee5 = new Employee("115", "name5", LocalDateTime.of(2022, Month.APRIL, 5, 5, 5));
        note.add(employee1);
        note.add(employee2);
        note.add(employee3);
        note.add(employee4);
        note.add(employee5);

        System.out.println(note.getEmployeeExperience(3));
        System.out.println(note.getNumberPhone("name3"));
        System.out.println(note.getEmployee(2));


//        Map<String, String> phoneBook = new HashMap<>();
//        phoneBook.put("1235", "User1");
//        phoneBook.put("1234", "Aser2");
//        phoneBook.put("1236", "User3");
//        phoneBook.put("1237", "User4");
//        phoneBook.put("1238", "User5");
//        phoneBook.put("1239", "User6");
//
//        int numMax = 0;
//
//        for (String s : phoneBook.keySet()) {
//            if (Integer.parseInt(s) > numMax) {
//                numMax = Integer.parseInt(s);
//            }
//        }
//        System.out.println(numMax);
//
//        List<Map.Entry<String, String>> value = new ArrayList<>(phoneBook.entrySet());
//        value.sort(Map.Entry.comparingByValue());
//        System.out.println(value);
    }
}
