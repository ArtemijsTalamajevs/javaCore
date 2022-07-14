package IfAndTest;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write first number");
        int firstNumber=scanner.nextInt();
        System.out.println("Write second number");
        int secondNumber=scanner.nextInt();
        System.out.println("Write third number");
        int thirdNumber=scanner.nextInt();
        if(firstNumber>secondNumber & firstNumber>thirdNumber){
            System.out.println("First number is biggest");
        } else if (secondNumber>thirdNumber &secondNumber>firstNumber) {
            System.out.println("Second number is the biggest");
        }
        else if(thirdNumber>firstNumber &thirdNumber>secondNumber){
            System.out.println("Third number is biggest");
        }
    }
}
