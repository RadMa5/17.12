public class Car extends Vehicle {
    private int fuelCapacity;
    private int currentFuelLevel = 0;

    public Car(int id, String brand, String model, int year, int fuelCapacity){
        super(id, brand, model, year);
        this.fuelCapacity = fuelCapacity;
    }

    public void refuel(int liters){
        if (currentFuelLevel + liters > fuelCapacity){
            currentFuelLevel = fuelCapacity;
            System.out.println("You spilled excessive fuel");
        } else {
            currentFuelLevel += liters;
            System.out.println("Amount of fuel in the tank is " + currentFuelLevel);
        }
    }

    public void displayInfo(){
        System.out.println(brand + " " + model + "(" + year + "). Unique ID is " + id + ". Current fuel level is " + currentFuelLevel);
    }

}
