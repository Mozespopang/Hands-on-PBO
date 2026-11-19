
public class Main {
    public static void main(String[] args) {

        System.out.println("Integer (5, 5): " +
                CompareUtil.isEqual(5, 5));

        System.out.println("String (Hello, World): " +
                CompareUtil.isEqual("Hello", "World"));

        System.out.println("Double (3.14, 3.14): " +
                CompareUtil.isEqual(3.14, 3.14));

        System.out.println("Double (2.5, 2.55): " +
                CompareUtil.isEqual(2.5, 2.55));

        System.out.println("Character ('A', 'A'): " +
                CompareUtil.isEqual('A', 'A'));

        System.out.println("Character ('A', 'B'): " +
                CompareUtil.isEqual('A', 'B'));
    }
}
