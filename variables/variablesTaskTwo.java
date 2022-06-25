package variables;

import java.util.Scanner;

public class variablesTaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program that prompts the user for an integer
        //and prints to the console the multiplication table for that number up to 10
        System.out.println("Write any number for multiplication table for that number up to 10");
        int multiplicationTable = scanner.nextInt();
        int result1 = multiplicationTable * 1;
        int result2 = multiplicationTable * 2;
        int result3 = multiplicationTable * 3;
        int result4 = multiplicationTable * 4;
        int result5 = multiplicationTable * 5;
        int result6 = multiplicationTable * 6;
        int result7 = multiplicationTable * 7;
        int result8 = multiplicationTable * 8;
        int result9 = multiplicationTable * 9;
        int result10 = multiplicationTable * 10;
        System.out.println("Expected Output :" + multiplicationTable + " x 1 =" + result1);
        System.out.println("Expected Output :" + multiplicationTable + " x 2 =" + result2);
        System.out.println("Expected Output :" + multiplicationTable + " x 3 =" + result3);
        System.out.println("Expected Output :" + multiplicationTable + " x 4 =" + result4);
        System.out.println("Expected Output :" + multiplicationTable + " x 5 =" + result5);
        System.out.println("Expected Output :" + multiplicationTable + " x 6 =" + result6);
        System.out.println("Expected Output :" + multiplicationTable + " x 7 =" + result7);
        System.out.println("Expected Output :" + multiplicationTable + " x 8 =" + result8);
        System.out.println("Expected Output :" + multiplicationTable + " x 9 =" + result9);
        System.out.println("Expected Output :" + multiplicationTable + " x 10 =" + result10);

    }
}
