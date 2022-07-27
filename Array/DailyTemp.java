package Array;

import java.util.Arrays;
import java.util.Random;

public class DailyTemp {
    public static void main(String[] args) {
        Random random = new Random();
        int[] hourlyTemp = new int[10];

        for (int i = 0; i < hourlyTemp.length; i++) {
            hourlyTemp[i] = random.nextInt(8);

        }
            }
}
       // int sum=0;
        //for (int i = 0; i < hourlyTemp.length; i++) {
           // sum = sum + hourlyTemp[i];

       //double average=(double) sum/ hourlyTemp.length;
       // System.out.println("average = " + average);
        // System.out.println(Arrays.toString(hourlyTemp));


