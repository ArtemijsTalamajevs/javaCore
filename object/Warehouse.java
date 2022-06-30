package object;

public class Warehouse {
    double temperatureDairy;


    public Warehouse(int temperatureDairy) {
        this.temperatureDairy = temperatureDairy;


    }
    double openedDoor(){
        return temperatureDairy+2;
    }
    double decreaseTempUsingFreon(){
        return temperatureDairy-2;
    }
    double cycleNumber(){
        return temperatureDairy*temperatureDairy;
    }

    void increasingTempManually(double byHeatAir){
        temperatureDairy=temperatureDairy+byHeatAir;
    }
    void decreasingTempManually(double byFreon){
        temperatureDairy=temperatureDairy-byFreon;
    }

}
