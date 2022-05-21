package carPackage;

interface Drivable {
    public default void drive(){
        System.out.println("Driving");
    }
}
