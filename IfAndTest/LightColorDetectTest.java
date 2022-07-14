package IfAndTest;

public class LightColorDetectTest {
    public static void main(String[] args) {
        LightColorDetectTest lightColorDetectTest = new LightColorDetectTest();
        lightColorDetectTest.detectTest1();
        lightColorDetectTest.detectTest2();
        lightColorDetectTest.detectTest3();
        lightColorDetectTest.detectTest4();
        lightColorDetectTest.detectTest5();
        lightColorDetectTest.detectTest6();
        lightColorDetectTest.detectTest7();
    }

    void detectTest1() {
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(400);
        if (realResult.equals(expectedResult)) {
            System.out.println("[OK] " + expectedResult);
        } else {
            System.out.println("[ERROR] Wrong wave frequency");
        }
    }

    void detectTest2() {
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(475);
        if (realResult.equals(expectedResult)) {
            System.out.println("[OK] " + expectedResult);
        } else {
            System.out.println("[ERROR] Wrong wave frequency");
        }
    }

    void detectTest3() {
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(500);
        if (realResult.equals(expectedResult)) {
            System.out.println("[OK] " + expectedResult);
        } else {
            System.out.println("[ERROR] Wrong wave frequency");
        }
    }

    void detectTest4() {
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(575);
        if (realResult.equals(expectedResult)) {
            System.out.println("[OK] " + expectedResult);
        } else {
            System.out.println("[ERROR] Wrong wave frequency");
        }
    }

    void detectTest5() {
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(600);
        if (realResult.equals(expectedResult)) {
            System.out.println("[OK] " + expectedResult);
        } else {
            System.out.println("[ERROR] Wrong wave frequency");
        }
    }

    void detectTest6() {
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(650);
        if (realResult.equals(expectedResult)) {
            System.out.println("[OK] " + expectedResult);
        } else {
            System.out.println("[ERROR] Wrong wave frequency");
        }
    }

    void detectTest7() {
        String expectedResult = "Invisible light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(999);
        if (realResult.equals(expectedResult)) {
            System.out.println("[OK] " + expectedResult);
        } else {
            System.out.println("[ERROR] Somethings wrong");
        }
    }
}
