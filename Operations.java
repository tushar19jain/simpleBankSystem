import java.util.Scanner;

public class Operations {
    Main obj = new Main();
    public void Balance(){
        System.out.println("Your current balance:" + " " + obj.Balance);
    }
    public void Deposit(){
        Scanner inputOne = new Scanner(System.in);
        System.out.println("Enter the amount your want to deposite : ");
        int depositMoney = inputOne.nextInt();
        obj.Balance += depositMoney;
        System.out.println("Your new balance:" + " " + obj.Balance);
        inputOne.close();
    }
    public void Withdraw(){
        Scanner inputTwo = new Scanner(System.in);
        System.out.println("Enter the amount your want to withdraw : ");
        int withdrawMoney = inputTwo.nextInt();
        obj.Balance -= withdrawMoney;
        System.out.println("Your new updated:" + " " + obj.Balance);
        inputTwo.close();
    }
}
