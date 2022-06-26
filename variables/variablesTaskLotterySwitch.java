package variables;

import java.util.Scanner;

public class variablesTaskLotterySwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my lottery ,write any number from 0 to 100 and win random prizes");
        int x = scanner.nextInt();
        switch (x) {
            case 5:
                System.out.println("You win 5 euro!!");
                System.out.println("Contact our manager +371 000 000");
                break;
            case 40:
                System.out.println("You win 20 euro!!");
                System.out.println("Contact our manager +371 000 000");
                break;
            case 60:
                System.out.println("You win laptop!!");
                System.out.println("Contact our manager +371 000 000");
                break;
            case 75:
                System.out.println("You win scooter");
                System.out.println("Contact our manager +371 000 000");
                break;
            case 100:
                System.out.println("You win 1000 euro!!");
                System.out.println("Congratulation!!!");
                System.out.println("Contact our manager +371 000 000");
                break;
            default:
                System.out.println("Sorry,you win nothing,try next time");
                System.out.println("Or buy another ticket  +371 000 000");
                break;


        }
    }
}
