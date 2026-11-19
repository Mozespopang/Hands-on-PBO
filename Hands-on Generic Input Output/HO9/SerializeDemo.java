
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int age;

    Employee(String n, int a) {
        this.name = n;
        this.age = a;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + "}";
    }
}

public class SerializeDemo {

    public static void serialize(List<Employee> employees, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename))) {

            oos.writeObject(employees);
            System.out.println("Semua objek berhasil di-serialize ke " + filename);

        } catch (IOException ex) {
            System.out.println("Error serialize: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Employee> deserialize(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filename))) {

            return (List<Employee>) ois.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error deserialize: " + ex.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        String filename = "emp.ser";

        List<Employee> listEmp = new ArrayList<>();

        listEmp.add(new Employee("John", 30));
        listEmp.add(new Employee("Budi", 25));
        listEmp.add(new Employee("Siti", 28));

        // Serialization
        serialize(listEmp, filename);

        // Deserialization
        List<Employee> restoredList = deserialize(filename);

        if (restoredList != null) {
            System.out.println("\nHasil Deserialized:");

            for (Employee emp : restoredList) {
                System.out.println(emp);
            }
        }
    }
}
