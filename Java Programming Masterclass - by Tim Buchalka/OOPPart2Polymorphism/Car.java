public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){

    }
    public void drive(){

    }
    protected void runEngine(){

    }
}

class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }
}
class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }
}
class HybridCar extends Car {

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description) {
        super(description);
    }
}
