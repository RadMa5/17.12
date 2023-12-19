public abstract class Vehicle{
    protected int id;
    protected String brand;
    protected String model;
    protected int year;
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
}