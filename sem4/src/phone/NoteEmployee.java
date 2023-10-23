package phone;

//Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников -
// каждый сотрудник должен иметь следующие атрибуты:


import java.util.*;

public class NoteEmployee implements List<Employee>{

    private Employee[] employees;
    private int initialCapacity = 10;

    private int index = 0;

    public NoteEmployee() {
        this.employees = new Employee[initialCapacity];
    }

    public NoteEmployee(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        this.employees = new Employee[initialCapacity];
    }

    public Map<String, String> getNumberPhone(String name) {
        Map<String, String> numbersPhone = new HashMap<>();
        for (Employee item : employees) {
            if (item != null && item.getName().equals(name)) {
                numbersPhone.put(name, item.getNumberPhone());
            }
        }
        return numbersPhone;
    }

    public Employee getEmployee(int id) {
        for (Employee item : employees) {
            if (item.getId() == id) {
                return item;
            }
        }
        throw new RuntimeException("Вы ввели неккоретный табельный номер. Сотрудника с таким табельным номером не существует");
    }

    public List<Employee> getEmployeeExperience(int experience) {
        List<Employee> employee = new ArrayList<>();
        for (Employee item : employees) {
            if (item != null && item.getExperience() == experience) {
                employee.add(item);
            }
        }
        return employee;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Employee> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Employee employee) {
        employees[this.index++] = employee;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Employee> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Employee> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Employee get(int index) {
        return null;
    }

    @Override
    public Employee set(int index, Employee element) {
        return null;
    }

    @Override
    public void add(int index, Employee element) {

    }

    @Override
    public Employee remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Employee> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Employee> listIterator(int index) {
        return null;
    }

    @Override
    public List<Employee> subList(int fromIndex, int toIndex) {
        return null;
    }
}
