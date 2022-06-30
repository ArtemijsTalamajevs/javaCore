package object;


public class WarehouseDemo {
    public static void main(String[] args) {
        Warehouse dairyWarehouse=new Warehouse(4);
        System.out.println("dairyWarehouse.temperatureDairy = " + dairyWarehouse.temperatureDairy);
        System.out.println("dairyWarehouse.openedDoor() = " + dairyWarehouse.openedDoor());
        System.out.println("dairyWarehouse.decreaseTempUsingFreon() = " + dairyWarehouse.decreaseTempUsingFreon());
        System.out.println("dairyWarehouse.cycleNumber() = " + dairyWarehouse.cycleNumber());
        System.out.println();
        dairyWarehouse.increasingTempManually(3);
        System.out.println("dairyWarehouse.temperatureDairy = " + dairyWarehouse.temperatureDairy);
        System.out.println("dairyWarehouse.openedDoor() = " + dairyWarehouse.openedDoor());
        System.out.println("dairyWarehouse.cycleNumber() = " + dairyWarehouse.cycleNumber());
        System.out.println();
        dairyWarehouse.decreasingTempManually(2);
        System.out.println("dairyWarehouse.temperatureDairy = " + dairyWarehouse.temperatureDairy);
        System.out.println("dairyWarehouse.openedDoor() = " + dairyWarehouse.openedDoor());
        System.out.println("dairyWarehouse.cycleNumber() = " + dairyWarehouse.cycleNumber());
        

    }
}
