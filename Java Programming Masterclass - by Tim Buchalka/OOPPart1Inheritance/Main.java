public class Main {

    public static void main(String[] args) {

        Car car = new Car();
//        car.describeCar();

        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setColor("Black");
        car.setDoors(2);
        car.setConvertible(true);

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setColor("red");
        targa.setDoors(2);
        targa.setConvertible(false);

        System.out.println("make = " + targa.getMake());
        System.out.println("model = " + targa.getModel());
        targa.describeCar();
    }
}
