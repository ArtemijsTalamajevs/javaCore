package object;

import java.util.Random;

public class UtilDemo {
    public static void main(String[] args) {
        Random random=new Random();
        System.out.println("There will be random number int ");
        random.nextInt();
        System.out.println("random.nextInt() = " + random.nextInt());
        System.out.println("Random bound 100");
        System.out.println("random = " + random.nextInt(100));
        int x= random.nextInt(100);
        int b= random.nextInt(50);
        int result=x-b;
        System.out.println("result is : " + result);



        String text="Moonlight";
        System.out.println("text.toLowerCase() = " + text.toLowerCase());
        System.out.println("text.toUpperCase() = " + text.toUpperCase());
        System.out.println("text.charAt(2) = " + text.charAt(2));
        System.out.println("text.isEmpty() = " + text.isEmpty());
        System.out.println("text.replace(\"l\",\"p\") = " + text.replace("l","p"));
    }
}
