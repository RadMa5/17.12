public abstract class Vehicle implements Flyable, Swimmable{
    protected int id;
    protected String brand;
    protected String model;
    protected int year;
    protected boolean isOn;
    protected int speed;

    public Vehicle(int id, String brand, String model, int year){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //All methods below should be overridden in consequent subclasses
    public void startEngine(){
        isOn = true;
        System.out.println("The engine is on");

    }
    public void stopEngine(){
        isOn = false;
        System.out.println("The engine is off");
    }
    public void accelerate(int speed){
        if (isOn){
            this.speed = speed;
        } else {
            System.out.println("Engine is turned off");
        }
    }
    public void brake(){
        speed = 0;
    }

    abstract void displayInfo();

    public void refuel(int fuel){

    }
}