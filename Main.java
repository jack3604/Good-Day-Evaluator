import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        GoodDay day = new GoodDay();

        System.out.println("Setters and Getters");
        day.SetTemperature(rand.nextInt(70,80));
        System.out.println(day.GetTemperature());
        day.SetHumidity(rand.nextInt(70,80));
        System.out.println(day.GetHumidity());
        day.SetIsHomework(rand.nextBoolean());
        System.out.println(day.IsHomeworkDone());
        day.SetDinnerMeal("Pepperoni Pizza");
        System.out.println(day.GetDinnerMeal() + "\n");

        System.out.println(day.ToString());

        // Relies on the coin flip
        day = new GoodDay(60, 60.0, true, "pizza");
        System.out.println(day.ToString());

        // Always returns false
        day = new GoodDay(90, 75.0, true, "not p1zza");
        System.out.println(day.ToString());

    }
}
