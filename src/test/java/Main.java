import java.util.ArrayList;
import java.util.Random;

public class Main {
    //Random generator
    private static final Random RANDOM_GENERATOR = new Random(50);

    public static void main(String[] args) {

        ArrayList<Integer> list1= generateListArray(true,10);
        System.out.println(list1);

        //Matrix.indexOfFirstNonZero(list1);

        //TASK 2
        //Ask user for enter info
        ArrayList<Bank> allAccounts = new ArrayList<Bank>();
        Bank user = new Bank("Natcha", "Cool",1223,500);
        Bank user2 = new Bank("Balint", "slovl",223,500);
        allAccounts.add(user);
        //Bank user1= Bank.openNewAccount();
        user.getBalance();

        Bank.closeAccount(allAccounts,user);
        System.out.println(allAccounts);

        //TASK 3.
        //Get balance
        MoneyTransfer.transfer(user);



    }

    //FUCNTIONS BELOW

    //GENERATE LIST ARRAY
    public static ArrayList<Integer> generateListArray(boolean random, int length) {
        ArrayList<Integer> list = new ArrayList<>(); //creat new list object

        if(random)
            for(int i= 0; i< length; i++){
                list.add(RANDOM_GENERATOR.nextInt(100)-50); //Random number in range og 100

            }
        else{
            for(int i=0; i< length; i++){
                list.add(1+i);
            }
        }
        return list;
    }


        //PRINT ARRAY
    public static void print_array(int[] array){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    // i=row j=colomn
    public static void print_2DArray(int[][] array){
        for(int i=0; i<array.length; i++){
            System.out.println((i+1) + " row: ");
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]);
                System.out.print(" ");
            }

        }

    }

}
