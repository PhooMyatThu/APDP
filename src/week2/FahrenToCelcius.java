package week2;

public class FahrenToCelcius {
    public float FahrenToCelcius(float fahren)
    {
        float centigrade = 5/2 * (fahren-32.0f);
                return  centigrade;
    }

    public static void main(String[] args) {
        FahrenToCelcius fahrenToCelcius = new FahrenToCelcius();
        System.out.println(fahrenToCelcius.FahrenToCelcius(98.6f));
        float centi = fahrenToCelcius.FahrenToCelcius(100.6f);
        System.out.println("Centigrade is "+centi);
    }
}
