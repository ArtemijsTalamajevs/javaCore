package variables;

import java.util.Scanner;

public class variablesTaskThree {
    public static void main(String[] args) {
        //Write a program that asks the user
        //radius of the circle (real number) and prints to the console
        //perimeter and area of a circle.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Type any real number and results will be perimeter and area of a circle  ");
        double  radius= scanner.nextDouble();
        double perimeter=Math.PI*2 *radius;
        double area=Math.PI*(radius*radius);
        System.out.println("Perimeter is :" + perimeter);
        System.out.println("Area is : " +area);

        }

    }

