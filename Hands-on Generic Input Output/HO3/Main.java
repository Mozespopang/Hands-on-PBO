
public class Main {
    public static void main(String[] args) {

        Cell<Integer> intCell = new Cell<>();
        intCell.setValue(100);

        System.out.println("Nilai: " + intCell.getValue());
        intCell.displayType();

        Cell<String> strCell = new Cell<>();
        strCell.setValue("Belajar Java Generics");

        System.out.println("\nNilai: " + strCell.getValue());
        strCell.displayType();
    }
}

