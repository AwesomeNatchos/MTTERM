import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    String name;
    String address;
    int account_number;
    int balance = 0;


    //CONSTRUCTOR
    public Bank(String name, String address, int account_number, int balance) {
        this.name = name;
        this.address = address;
        this.account_number = account_number;
        this.balance = balance;
    }

    public Bank() {

    }

    //Open new account
    public static Bank openNewAccount(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scan.nextLine();
        System.out.println("Enter Adress: ");
        String address = scan.nextLine();
        System.out.println("Enter account number (should probably be generated from the bank): ");
        int account_number = scan.nextInt();
        System.out.println("Enter first diposit: ");
        int deposit = scan.nextInt();
        System.out.println("You have now sussesfullly created an account!");


        Bank new_user = new Bank(name,address,account_number, deposit);
        return new_user;

    }

    public static ArrayList<Bank> closeAccount(ArrayList<Bank>allUsers, Bank account){
        allUsers.remove(account);
        System.out.println("You have succesfully removed user!");
        return allUsers;

    }
    //GETTERS
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAccount_number() {
        return account_number;
    }

    public int getBalance() {
        System.out.println("Your balance: " + balance);

        return balance;
    }

    //SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
