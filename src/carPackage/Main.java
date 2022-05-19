package carPackage;

public class Main {
    public static void main(String[] args) {
        Car gtr = new GTR();
        gtr.setSeats(2);
        gtr.setWheels(4);
        gtr.setWeight(1500.00);
        gtr.setTopSpeed(150.00);
        System.out.println("Gtr has this many seats: "+ gtr.getSeats());
        System.out.println("Gtr has this many wheels: " + gtr.getWheels());
        System.out.println("Gtr weighs this much: " + gtr.getWeight());
        System.out.println("Gtr's highest speed is: " + gtr.getTopSpeed());
        gtr.move();


        Car mustang = new Mustang();
        mustang.setSeats(4);
        mustang.setWheels(4);
        mustang.setWeight(1800.00);
        mustang.setTopSpeed(130.00);
        System.out.println("\nMustang has this many seats: "+ mustang.getSeats());
        System.out.println("Mustang has this many wheels: " + mustang.getWheels());
        System.out.println("Mustang weighs this much: " + mustang.getWeight());
        System.out.println("Mustang's highest speed is: " + mustang.getTopSpeed());
        mustang.move();
    }
}
