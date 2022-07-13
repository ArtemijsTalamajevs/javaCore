package IfAndTest;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccountTest test = new BankAccountTest();
        test.testBankAccountDeposit();
        test.testBankAccountWithdraw();

    }

    void testBankAccountDeposit() {
        String scenarioDescription = "Should deposit 400 ,initial is 0 and after deposit it will be 400  ";
        BankAccount subject = new BankAccount(0);
        subject.deposit(400);
        int expectedResult = 400;
        int actualResult = subject.balance;
        asserThatEqual(expectedResult,actualResult,scenarioDescription );

    }

    void testBankAccountWithdraw(){
        String scenarioDescription = "Initial amount is 500 ,withdraw is 100 ,and expected result is 400  ";
        BankAccount subject = new BankAccount(500);
        subject.withdraw(100);
        int expectedResult = 400;
        int actualResult = subject.balance;
        asserThatEqual(expectedResult,actualResult,scenarioDescription );


    }

    void asserThatEqual(int expected, int actual, String scenarioDescription ) {
        if (expected == actual) {
            System.out.println("OK :" + scenarioDescription );
        } else {
            System.out.println("FAILED : " + scenarioDescription );
        }
    }
}
