
public class EnumConstructorDemo {
    public static void main(String[] args) {

        for (AccountTypeWithRate type : AccountTypeWithRate.values()) {
            System.out.printf(
                "Nama: %-8s | Kode: %s | Suku Bunga: %.1f%%%n",
                type.name(),
                type.getCode(),
                type.getInterestRate() * 100
            );
        }
    }
}
