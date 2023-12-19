public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car(01, "Ford", "Focus", 2001, 450);
        v1.startEngine();
        v1.accelerate(100);
        v1.brake();
        v1.stopEngine();
        v1.displayInfo();
    }
}
