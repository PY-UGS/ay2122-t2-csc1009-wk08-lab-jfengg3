import java.util.*;

public class BankDemoTest {

    public static void main(String[] args) {

        double deposit = 0;
        double withdraw = 0;

        CheckAccount ca = new CheckAccount(123, 0);

        try {

            Scanner s = new Scanner(System.in);

            System.out.println("Deposit an amount: ");
            deposit = s.nextDouble();
            ca.deposit(deposit);

            System.out.println("Withdraw an amount: ");
            withdraw = s.nextDouble();
            ca.withdraw(withdraw);

            System.out.println("The balance after withdraw is: $ " + ca.getBalance());

        } catch (Exception e) {
            System.out.print(e);
            System.out.println("Sorry, but your account is short by: $ " + (withdraw - ca.getBalance()));
        }

    }

}
