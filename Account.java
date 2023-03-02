import java.util.Scanner;

public class Account{


    private int accountNo;
    private String accountHolder;
    private double accountBalance;
    private double amountDep;
    /**
     * @return int return the accountNo
     */
    public int getAccountNo() {
        return accountNo;
    }

    /**
     * @param accountNo the accountNo to set
     */
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * @return String return the accountHolder
     */
    public String getAccountHolder() {
        return accountHolder;
    }

    /**
     * @param accountHolder the accountHolder to set
     */
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    /**
     * @return double return the accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * @param accountBalance the accountBalance to set
     */
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    /**
     * @return double return the amountDep
     */
    public double getAmountDep() {
        return amountDep;
    }

    /**
     * @param amountDep the amountDep to set
     */
    public void setAmountDep(double amountDep) {
        this.amountDep = amountDep;
    }

}
