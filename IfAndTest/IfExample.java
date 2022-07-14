package IfAndTest;


public class IfExample {

    public static void main(String[] args) {
        System.out.println("Program start here!!");

        int x=5;
        if(x<7){
            System.out.println("START THIS because less than 5");
        }
        else{
            System.out.println("START THIS because more than 5");
        }

        boolean todayIsMonday=true;
        boolean todayIsFriday=false;
        boolean todayIsSunday=false;

        if(todayIsMonday){
            System.out.println("Today is monday we must work HARD");
        }
        else if (todayIsFriday){
            System.out.println("Today is friday lets party");
        } else if (todayIsSunday) {
            System.out.println("Today is the greatest day for party");
        }
        else{
            System.out.println("Keep work hard");
        }

    }

    }

