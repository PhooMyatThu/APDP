package week2;

public class OCPTest {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(120,"Car");
        Vehicle vehicle2 = new Car(100,"Bus");
        double carSpeed = vehicle1.calculateALlowedSpeed();
        double busSpeed = vehicle2.calculateALlowedSpeed();
        System.out.printf("Car speed = %4.2f \nBus speed = %4.2f", carSpeed,busSpeed);
    }
}
