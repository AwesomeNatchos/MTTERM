import java.util.Scanner;

public class MoneyTransfer extends Bank{
    int amount;


    //CONSTRUCTOR
    public MoneyTransfer(String name, String address, int account_number, int balance, int amount) {

        super(name, address, account_number, balance);
        this.amount= amount;

    }

    public MoneyTransfer() {

    }

    public static void transfer(Bank account){
        int balance = account.getBalance();
        System.out.println("Please enter transfer amout: ");
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        balance = balance - amount;
        account.setBalance(balance);
        System.out.println("your new balance is: " + account.getBalance());


    }

}
