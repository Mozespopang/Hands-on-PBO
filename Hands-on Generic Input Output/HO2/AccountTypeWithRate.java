
enum AccountTypeWithRate {
    SAVINGS("SA", 0.02),
    CREDIT("CR", 0.15),
    DEPOSIT("DP", 0.05);

    private final String code;
    private final double interestRate;

    private AccountTypeWithRate(String code, double interestRate) {
        this.code = code;
        this.interestRate = interestRate;
    }

    public String getCode() {
        return code;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

