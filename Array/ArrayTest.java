package Array;


import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] randomNumber=new int[10]; //10 elements //9 index
        randomNumber[0]=20;
        randomNumber[1]=15;
        randomNumber[2]=17;
        randomNumber[3]=14;
        randomNumber[4]=12;
        randomNumber[5]=14;
        randomNumber[6]=6;
        randomNumber[7]=14;
        randomNumber[8]=24;
        randomNumber[9]=18;
        System.out.println(Arrays .toString(randomNumber));
        double average=((double) randomNumber[0]+randomNumber[1]+randomNumber[2]+randomNumber[3]+randomNumber[4]+randomNumber[5]+randomNumber[6]+randomNumber[7]+randomNumber[8]+randomNumber[9])/ randomNumber.length;
        System.out.println("average = " + average);

        int[] someNumber= {234,124,456,236};
        System.out.println(Arrays.toString(someNumber));
        System.out.println("someNumber.length = " + someNumber.length);

        //for multiDemensionArray =Arrays.deepToStrinf();




    }

}
