enum AccountType {
    SAVINGS("Akun Tabungan Reguler"),
    CREDIT("Akun Fasilitas Kredit"),
    DEPOSIT("Akun Deposito Berjangka");

    private final String description;

    AccountType(String description) {
        this.description = description;
    }

    public String toString() {
        return this.name() + " - " + this.description;
    }
}

public class Account {
    private AccountType type;

    public Account(AccountType type) {
        this.type = type;
    }

    public AccountType getType() {
        return type;
    }

    public static void main(String[] args) {
        System.out.println("Daftar Semua Tipe Akun:");
        for (AccountType t : AccountType.values()) {
            System.out.println(t); 
        }

        Account myAccount = new Account(AccountType.DEPOSIT);
        System.out.println("\nAkun terpilih: " + myAccount.getType());
    }
}