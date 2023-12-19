public class Aircraft extends Vehicle implements Flyable{
    private int maxAltitude;
    protected boolean isFlying;
    
    public Aircraft(int id, String brand, String model, int year, int maxAltitude){
        super(id, brand, model, year);
        this.maxAltitude = maxAltitude;
    }

    public void takeOff(){
        if (!(isOn)){
            System.out.println("Engine is off");
        } else if (isFlying) {
            System.out.println("Already mid-flight");
        } else {
            isFlying = true;
            System.out.println("You successfully took off");
        }
    }
    public void land(){
        if (!(isFlying)) {
            System.out.println("Already landed");
        } else {
            isFlying = false;
            System.out.println("Landed successfully");
        }
    }

    public void displayInfo(){
        System.out.println(brand + " " + model + "(" + year + "). Unique ID is " + id + ". Maximum altitude is " + maxAltitude);
    }
}
