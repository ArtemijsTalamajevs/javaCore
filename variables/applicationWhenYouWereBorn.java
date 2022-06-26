package variables;

import java.util.Scanner;

public class applicationWhenYouWereBorn {
    public static void main(String[] args) {
        //simple program that asks for a person's age and outputs their year of birth
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write your age and you will see your year of birth ");
        int ageOfUser= scanner.nextInt();
        int yearOfBirth=2022-ageOfUser;
        System.out.println("You was born in : " + yearOfBirth);

    }
}
