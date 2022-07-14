package IfAndTest;

import java.util.Scanner;

public class WriteInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write integer number");
        int x=scanner.nextInt();
        if(x>0){
            System.out.println("You wrote positive number");
        }
        else{
            System.out.println("Your wrote negative number");
        }

        System.out.println("Write integer number ,and lets see it will be positive,negative or equal to 0?");
        int a=scanner.nextInt();
        if(a>0){
            System.out.println("This number is positive number");
        }
        else if (a<0) {
            System.out.println("This number is negative");
        }
        else{
            System.out.println("this number is 0");
        }

        System.out.println("Write down number and lets see even or not?");
        int b=scanner.nextInt();
        if(b%2==0){
            System.out.println("This number is even");
        }
        else{
            System.out.println("This is not even number");
        }
    }
}
