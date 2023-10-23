import java.util.Iterator;

public class ParamCollection<T> implements Iterable<T>{
    private T[] array;
    private int index = 0;
    private int size;

    public ParamCollection(T[] array) {
        this.array = array;
        this.size = array.length;
    }

    public void add(T item) {
        if (index < size) {
            array[index] = item;
            index++;
        } else {
            throw new RuntimeException("Array is full!");
        }
    }

    public void delete(int index) {
        if (index < size) {
            array[index] = null;
        } else {
            throw new RuntimeException("Переданный индекс не существует");
        }
    }

    public void print() {
        for (T t : array) {
            System.out.printf(t + " ");
        }
    }

    public int getSize() {
        return size;
    }

    public T getByIndex(int index) {
        return array[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ParamIterator<>(this);
    }
}
