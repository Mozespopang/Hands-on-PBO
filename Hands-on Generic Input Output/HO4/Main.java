
public class Main {
    public static void main(String[] args) {

        Pair<Integer, String> pair1 = new Pair<>(1, "Faudzan");

        System.out.println("Sebelum swap: " + pair1);
        pair1.showTypes();

        Pair<String, Integer> swappedPair1 = pair1.swap();

        System.out.println("Sesudah swap: " + swappedPair1);
        swappedPair1.showTypes();

        System.out.println("---");

        Pair<Double, Boolean> pair2 = new Pair<>(98.5, true);

        System.out.println("Sebelum swap: " + pair2);

        Pair<Boolean, Double> swappedPair2 = pair2.swap();

        System.out.println("Sesudah swap: " + swappedPair2);
        swappedPair2.showTypes();
    }
}
