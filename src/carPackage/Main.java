package carPackage;

public class Main {
    public static void main(String[] args) {
        Car myNewCar = new Car();
        myNewCar.setSeats(4);
        myNewCar.setWheels(4);
        myNewCar.setWeight(1000.00);
        myNewCar.setTopSpeed(120.00);
        System.out.println("The car has this many seats: "+ myNewCar.getSeats());
        System.out.println("The car has this many wheels: " + myNewCar.getWheels());
        System.out.println("The car weighs this much: " + myNewCar.getWeight());
        System.out.println("The car's highest speed is: " + myNewCar.getTopSpeed());

        Car anotherCar  =new Car(2000);
        anotherCar.setWeight(950);
        System.out.println(myNewCar.isHeaverThan(anotherCar));
    }
}
