

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * bank account type.
     */
    public enum BankAccountType {
        /**
         * checking.
         */
        CHECKINGS,
        /**
         * savings.
         */
        SAVINGS,
        /**
         * student.
         */
        STUDENT,
        /**
         * workplace.
         */
        WORKPLACE
    }

    /**
     * account number.
     */
    private int accountNumber;
    /**
     * accountType.
     */
    private BankAccountType accountType;
    /**
     * accountBalance.
     */
    private double accountBalance;
    /**
     * owner name.
     */
    private String ownerName;
    /**
     * interest rate.
     */
    private double interestRate;
    /**
     * interest earned.
     */
    private double interestEarned;

    /**
     * bank account class.
     * @param accountCategory final
     * @param name the String you are assigning
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
    }

    /**
     * method to access account number.
     * @return the account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * method to access the owner name.
     * @return the owner name
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * method to change the owner name.
     * @param newName final
     */
    public void setOwnerName(final String newName) {
        ownerName = newName;
    }

    /**
     * method to access the balance.
     * @return the account balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * method to set the balance.
     * @param newBalance final
     */
    public void setAccountBalance(final double newBalance) {
        accountBalance = newBalance;
    }

    /**
     * method to access the interest earned.
     * @return the interest earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * method to access the account type.
     * @return the account type
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * method to access the account type.
     * @return the account type
     */
    public double getInterestRate() {
        return interestRate;
    }

}
