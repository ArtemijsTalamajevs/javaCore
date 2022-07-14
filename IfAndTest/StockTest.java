package IfAndTest;

public class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.stockTest1();
        stockTest.stockTest2();
        stockTest.stockTest3();
        stockTest.stockTest4();
    }


    void stockTest1() {
        Stock stock = new Stock("Elephant", 15);
        stock.updatePrice(12);
        stock.updatePrice(11);
        stock.updatePrice(23);
        String actualResult = stock.getStockInformation();
        String expectedResult = "Company = Apple, current price = 23, min price = 11, max price = 23";
        if (actualResult.equals(expectedResult)) {
            System.out.println("1[OK]");
        } else {
            System.out.println("1[ERROR]");
        }
    }

    void stockTest2() {
        Stock stock = new Stock("Panasonic", 88);
        stock.updatePrice(77);
        stock.updatePrice(66);
        stock.updatePrice(55);
        String actualResult = stock.getStockInformation();
        String expectedResult = "Company = Samsung, current price = 55, min price = 55, max price = 88";
        if (actualResult.equals(expectedResult)) {
            System.out.println("2[OK]");
        } else {
            System.out.println("2[ERROR]");
        }
    }

    void stockTest3() {
        Stock stock = new Stock("Itable", 9);
        stock.updatePrice(11);
        stock.updatePrice(22);
        stock.updatePrice(-1);
        String actualResult = stock.getStockInformation();
        String expectedResult = "Company = Google, current price = -1, min price = -1, max price = 22";
        if (actualResult.equals(expectedResult)) {
            System.out.println("3[OK]");
        } else {
            System.out.println("3[ERROR]");
        }
    }

    void stockTest4() {
        Stock stock = new Stock("Seetr", 100);
        stock.updatePrice(100);
        stock.updatePrice(100);
        stock.updatePrice(100);
        String actualResult = stock.getStockInformation();
        String expectedResult = "Company = Razer, current price = 100, min price = 100, max price = 100";
        if (actualResult.equals(expectedResult)) {
            System.out.println("4[OK]");
        } else {
            System.out.println("4[ERROR]");
        }
    }
}
