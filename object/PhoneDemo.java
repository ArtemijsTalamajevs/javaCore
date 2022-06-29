package object;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone samsung =new Phone("Samsung","GalaxyS12","Black","1440 x 3040 pixels, 19:9 ratio",true,true,550,6.4,950);
        System.out.println("samsung.model = " + samsung.model);
        System.out.println("samsung.countyName = " + samsung.countyName);
        System.out.println("samsung.colour = " + samsung.colour);
        System.out.println("samsung.resolution = " + samsung.resolution);
        System.out.println("samsung.gps = " + samsung.gps);
        System.out.println("samsung.bluetooth = " + samsung.bluetooth);
        System.out.println("samsung.ppi = " + samsung.ppi);
        System.out.println("samsung = " + samsung.size);
        System.out.println("samsung.priceUsd = " + samsung.priceUsd);

        //Object.method name

        samsung.printSomething();

        //Object.method name + type variables into () ,for simpliest way to initializeting it

        samsung.printThis("Samsung");

    }

}
