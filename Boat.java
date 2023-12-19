public class Boat extends Vehicle {
    protected int maxSpeed;
    protected boolean isSailing;

    public Boat(int id, String brand, String model, int year, int maxSpeed){
        super(id, brand, model, year);
        this.maxSpeed = maxSpeed;
    }

    public void startSwimming(){
        if (!(isOn)){
            System.out.println("Engine is off");
        } else {
            isSailing = true;
            System.out.println("The boat is swimming");
        }
    }
    public void stopSwimming(){
        isSailing = false;
        System.out.println("The boat is not swimming");
    }

    @Override
    public void accelerate(int speed){
        if (isOn){
            if (speed > maxSpeed){
                speed = maxSpeed;
                System.out.println("Exceeded maximum speed. Speed is changed to " + maxSpeed);
            } else {
                this.speed = speed;
            }
        } else {
            System.out.println("Engine is turned off");
        }
    }

    public void displayInfo(){
        System.out.println(brand + " " + model + "(" + year + "). Unique ID is " + id + ". Maximum speed is " + maxSpeed);
    }

    public void takeOff(){

    }
    public void land(){

    }
}
