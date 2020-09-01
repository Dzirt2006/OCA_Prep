package inheriance.Polimorphism;

public class BankAccount {
    double serviceCharge;
    double balance;
    private double interest;

    {
        balance = 0;
    }

    protected BankAccount(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    protected BankAccount() {
    }

    protected void withdraw(double amount) {
//        if (balance < amount) throw new IllegalArgumentException("Amount of withdraw greater than balance.");
        balance = -amount;
    }

    protected void calcInterest() {
        double Monthly_Int_rate;
        double Monthly_Interest;
        Monthly_Int_rate = (interest / 12);
        Monthly_Interest = balance * Monthly_Int_rate;
        System.out.println("You interest savings is: " + Monthly_Interest + '.');
        balance += Monthly_Interest;
    }

    public String getBalance() {
        return String.valueOf(balance);
    }

    public double getServiceCharge() {
        return serviceCharge;
    }
}

class CheckingAccount extends BankAccount {
     {
        serviceCharge = 15;
    }

    protected CheckingAccount(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    public void withdraw(double amount) {
        if ((balance - amount) < 0) serviceCharge += 15;
        super.withdraw(amount);
    }

    public String getBalance() {
        return ("Yor balance is " + new String(String.valueOf(balance)));
    }
}
