/**
 * GoodDay class for Module 5
 *
 *
 * @author Adisson Buchanan
 */
import java.util.Random;

public class GoodDay {
    private int Temperature;
    private double Humidity;
    private boolean IsHomeworkDone;
    private String DinnerMeal;
    private Random rand = new Random();

    GoodDay() {
        Temperature = 0;
        Humidity = 0.0;
        IsHomeworkDone = false;
        DinnerMeal = "";
    }

    GoodDay(int temperature, double humidity, boolean isHomework, String dinnerMeal) {
        Temperature = temperature;
        Humidity = humidity;
        IsHomeworkDone = isHomework;
        DinnerMeal = dinnerMeal;
    }

    public int GetTemperature() { return this.Temperature; }

    public void SetTemperature(int temperature) { this.Temperature = temperature; }

    public double GetHumidity() { return this.Humidity; }

    public void SetHumidity(int humidity) { this.Humidity = humidity; }

    public boolean IsHomeworkDone() { return this.IsHomeworkDone; }

    public void SetIsHomework(boolean homework) { this.IsHomeworkDone = homework; }

    public String GetDinnerMeal() { return this.DinnerMeal; }

    public void SetDinnerMeal(String dinnerMeal) { this.DinnerMeal = dinnerMeal; }

    private boolean CoinFlip() { return rand.nextBoolean(); }

    public boolean IsWeatherGood() {
        // If the humidity is between 70 and 80 then the weather is good.
        if (this.Humidity <= 80 && this.Humidity >= 70) {
            // If the temperature is between 70 and 80 then the weather is good.
            // Used switch case just to demonstrate for the assignment.
            switch (this.Temperature) {
                case 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80:
                    return true;
                default:
                    return false;
            }
        }

        return false;
    }

    public boolean IsTodayGood() {
        // If the weather isn't good but homework is done return true.
        // If the weather is good but homework isn't done, still return true.
        // If both are false, flip a coin to see if the day is good.
        if (!IsWeatherGood() || !IsHomeworkDone()) {
            if (CoinFlip()) {
                return false;
            }
            // If the coin flip succeeds and dinner isn't some kind of pizza return false.
            else if (!this.DinnerMeal.toLowerCase().contains("pizza")) {
                return false;
            }
        }

        // If it's not a bad day, it's a good day.
        return true;
    }

    public String ToString() {
        // Warn about the default constructor being used and the values not being updated.
        if (this.Temperature == 0 && this.Humidity == 0.0 && !this.IsHomeworkDone && this.DinnerMeal.isEmpty()) {
            return "Default constructor was used and not updated.";
        }

        String output = "";

        output += "Temperature: " + this.Temperature + "\n";
        output += "Humidity: " + this.Humidity + "\n";
        output += "IsHomeworkDone: " + this.IsHomeworkDone + "\n";
        output += "DinnerMeal: " + this.DinnerMeal + "\n";
        output += "Good day?: " + this.IsTodayGood() + "\n";

        return output;
    }
}