import java.util.Scanner;

public class Main{
    int Balance = 300000;
    public static void main(String[] args) {
        Operations objTwo = new Operations();
        System.out.println("Choose operation to perform");
        System.out.println("1 Balance");
        System.out.println("2 Deposit");
        System.out.println("3 Widthdraw");
        System.out.println("4 Exit");
        System.out.println("Type in your number hit ENTER");
        Scanner choice = new Scanner(System.in);
        int Choose = choice.nextInt();
        while(Choose == 4){
            
        }
        if(Choose == 1){
            objTwo.Balance();
        }
        else if(Choose == 2){
            objTwo.Deposit();
        }
        else if(Choose == 3){
            objTwo.Withdraw();
        }
        else if(Choose == 4){
            System.out.println("Thanks for visiting");
        }
        else{
            System.out.println("Select a valid option");
        }
        choice.close();
    }
}