public abstract class Vehicle implements Flyable, Swimmable {
    private int id;
    private String brand;
    private String model;
    private int year;
    private boolean isOn;
    private int speed;

    public Vehicle(int id, String brand, String model, int year){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //All methods below should be overridden in consequent subclasses
    public void startEngine(){
        isOn = true;
    }
    public void stopEngine(){
        isOn = false;
    }
    public void accelerate(int speed){
        this.speed = speed;
    }
    public void brake(){
        speed = 0;
    }

    abstract void displayInfo();
}