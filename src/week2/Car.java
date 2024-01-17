package week2;

public class Car extends Vehicle{

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }
    public double calculateALlowedSpeed()
    {
        return maxSpeed * 0.8;
    }
}
