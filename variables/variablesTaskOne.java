package variables;

import java.util.Scanner;

public class variablesTaskOne {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write any 2 numbers and results will be sum/minus/div/multip");
        int numberOne= scanner.nextInt();
        int numberTwo= scanner.nextInt();
        int resultOfSumm=numberOne+numberTwo;
        int resultofMinus=numberOne-numberTwo;
        int resultofDiv=numberOne/numberTwo;
        int resultofMulti=numberOne*numberTwo;
        System.out.println("Result of sum is: " + resultOfSumm);
        System.out.println("Result of minus is: " + resultofMinus);
        System.out.println("Result of div is: " + resultofDiv);
        System.out.println("Result of multi is: " + resultofMulti);

    }
}
