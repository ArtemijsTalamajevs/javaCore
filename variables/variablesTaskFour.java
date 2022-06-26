package variables;

import java.util.Scanner;

public class variablesTaskFour {
    public static void main(String[] args) {
        //Write a program that asks the user
        //three integers and prints their arithmetic mean
        //(adds all the numbers and divides by their number).
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write 3 numbers and program will print their arithmetic");
        double firstNumber= scanner.nextByte();
        double secondNumber= scanner.nextDouble();
        double thirdNumber= scanner.nextDouble();
        double result=(firstNumber+secondNumber+thirdNumber/3);
        System.out.println("Your results of 3 numbers is: " + result);
        }
    }

