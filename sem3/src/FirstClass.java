import java.io.DataInput;
import java.io.InputStream;
import java.io.Serializable;

public class FirstClass <T extends Comparable, V extends DataInput, K extends Number> {
    T comparableItem;
    V dataItem;
    K numberItem;

    public FirstClass(T comparableItem, V dataItem, K numberItem) {
        this.comparableItem = comparableItem;
        this.dataItem = dataItem;
        this.numberItem = numberItem;
    }

    void getNamesClass() {
        System.out.println(comparableItem.getClass().getName());
        System.out.println(dataItem.getClass().getName());
        System.out.println(numberItem.getClass().getName());
    }
}
