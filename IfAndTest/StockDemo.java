package IfAndTest;

public class StockDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("GoogleesS", 500);
        String stockInformation = stock.getStockInformation();
        stock.getStockInformation();
        stock.updatePrice(19);
        stock.updatePrice(22);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        System.out.println(stockInformation);


    }
}
