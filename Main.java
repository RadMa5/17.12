public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car(01, "Ford", "Focus", 2001, 450);
        v1.refuel(20);
        v1.startEngine();
        v1.accelerate(100);
        v1.brake();
        v1.stopEngine();
        v1.displayInfo();

        Vehicle v2 = new Aircraft(02, "BMW", "Aircraft", 1958, 4000);
        v2.startEngine();
        v2.takeOff();
        v2.land();
        v2.displayInfo();

    }
}
