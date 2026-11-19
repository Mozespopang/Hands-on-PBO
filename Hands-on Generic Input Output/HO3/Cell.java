
public class Cell<T> {
    private T data;

    public void setValue(T data) {
        this.data = data;
    }

    public T getValue() {
        return data;
    }

    public void displayType() {
        if (data != null) {
            System.out.println("Tipe data tersimpan: " + data.getClass().getName());
        } else {
            System.out.println("Data masih kosong (null).");
        }
    }
}
