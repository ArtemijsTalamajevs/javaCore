package object;

import java.sql.SQLOutput;

public class Phone {
    //Example with constructor
    String model;
    String countyName;
    String colour;
    String resolution;
    boolean gps;
    boolean bluetooth;
    int ppi;
    double size;
    int priceUsd;

    public Phone(String model, String countyName, String colour, String resolution, boolean gps, boolean bluetooth, int ppi, double size, int priceUsd) {
        this.model = model;
        this.countyName = countyName;
        this.colour = colour;
        this.resolution = resolution;
        this.gps = gps;
        this.bluetooth = bluetooth;
        this.ppi = ppi;
        this.size = size;
        this.priceUsd = priceUsd;

    }
    //Simple method ,wich return nothing
    void printSomething(){
        System.out.println("Name of model : " +model + "Desired colour is : " + countyName);
    }
    //Simple method input variables into ()
    void printThis(String model){
        System.out.println(model+" is one of the best mobile phone");

    }
}

