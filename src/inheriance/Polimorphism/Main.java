package inheriance.Polimorphism;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount= new CheckingAccount(100,5);
        CheckingAccount checkingAccount=new CheckingAccount(100,10);
        bankAccount.withdraw(1001);
        System.out.println("bank->check  " +bankAccount.getBalance());
        System.out.println("bank->check  "+bankAccount.getServiceCharge());
        checkingAccount.withdraw(101);
        checkingAccount.calcInterest();
        System.out.println(checkingAccount.getBalance());
        System.out.println(checkingAccount.getServiceCharge());
        System.out.println("bank->check  " +bankAccount.getBalance());
        System.out.println("bank->check  "+bankAccount.getServiceCharge());
    }
}
