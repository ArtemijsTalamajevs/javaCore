package IfAndTest;

 public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest test=new CalculatorTest();
        test.sumTest();//here we start our test
        test.subTest();

    }



    void sumTest(){
        String sumtTestScenario="Sum of 3 and 5 will be 8";
        Calculator subject=new Calculator(); //subject-target-victims-system under test

        int expectedResult=8;
        int actualResult= subject.sum(3,5);
        if(expectedResult==actualResult){
            System.out.println("OK :" +sumtTestScenario);
        }
        else{
            System.out.println("FAIL :" +sumtTestScenario);
        }
    }
    void subTest(){
         String subTestScenario = "Sub of 5-4 will be 1";

         Calculator victims = new Calculator();

         int expectedResult = 1;
         int actualResult = victims.sub(5, 4);


        asserThatEqual(expectedResult,actualResult,subTestScenario);
    }

    void asserThatEqual(int expected,int actual,String subTestScenario){
        if(expected==actual){
            System.out.println("OK :" +subTestScenario);
        }
        else {
            System.out.println("FAILED" +subTestScenario);
        }

    }
}
