package phone;

//        Табельный номер
//        Номер телефона
//        Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//        Добавить метод добавление нового сотрудника в справочник сотрудников

import java.time.LocalDateTime;

public class Employee {
    private static int count = 0;
    private int id;
    private String numberPhone;
    private String name;
    private LocalDateTime experience;

    {
        id = ++count;
    }

    public Employee(String numberPhone, String name, LocalDateTime experience) {
        this.numberPhone = numberPhone;
        this.name = name;
        this.experience = experience;
    }

    public int getExperience() {
        int start = experience.getYear();
        int now = LocalDateTime.now().getYear();
        return now - start;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", numberPhone='" + numberPhone + '\'' +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
