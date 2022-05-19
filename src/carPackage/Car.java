package carPackage;

abstract class Car {
    private int seats;
    private int wheels;
    private double weight;
    private double topSpeed;

    protected void setSeats(int seats){
        this.seats = seats;
    }
    protected void setWheels(int wheels){
        this.wheels = wheels;
    }
    protected void setWeight(double weight){
        this.weight = weight;
    }
    protected void setTopSpeed(double topSpeed){
        this.topSpeed = topSpeed;
    }

    protected int getSeats(){
        return this.seats;
    }
    protected int getWheels(){
        return this.wheels;
    }
    protected double getWeight(){
        return this.weight;
    }
    protected double getTopSpeed(){
        return this.topSpeed;
    }

    Car(){
        setSeats(4);
        setWheels(4);
        setTopSpeed(100.00);
        setWeight(1000);
    }

    Car(int weight){
        this();
        this.weight = weight;
    }

    abstract public void move();
    boolean isHeaverThan(Car c){
        return this.weight < c.weight;
    }
}
