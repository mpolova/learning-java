// Create a POJO for transporting savings account data in a Java application.
class Test {
    public static void main (String[] args){
        SavingsAccount account = new SavingsAccount();
        account.setAccountNo("12345");
        account.setBalance(50000.00);
        System.out.println("Account " + account.getAccountNo() + " has balance of: " + account.getBalance());
    }
}

public class SavingsAccount {
    private String accountNo;
    private double balance;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

