package IfAndTest;

import java.util.Scanner;

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter enter initial amount");
        int initialBalance=scanner.nextInt();
        System.out.println("Please select deposit operation(1-deposit,2-withdraw)");
        int operation=scanner.nextInt();
        System.out.println("Please enter operation amount");
        int amount=scanner.nextInt();

        BankAccount myAccount=new BankAccount(initialBalance);
       if(operation==1){
           myAccount.deposit(amount);
       }
       else if(operation==2){
           myAccount.withdraw(amount);
       }
       else{
           System.out.println("Unknown command");
       }
        System.out.println("myAccount.balance = " + myAccount.balance);
    }

}
