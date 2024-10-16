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
        Humidity = 0;
        IsHomeworkDone = false;
        DinnerMeal = "";
    }

    GoodDay(int temperature, double humidity, boolean isHomework, String dinnerMeal) {
        Temperature = temperature;
        Humidity = humidity;
        IsHomeworkDone = isHomework;
        DinnerMeal = dinnerMeal;
    }

    public int GetTemperature(int temperature) { return this.Temperature; }

    public void SetTemperature(int temperature) { this.Temperature = temperature; }

    public double GetHumidity(int humidity) { return this.Humidity; }

    public void SetHumidity(int humidity) { this.Humidity = humidity; }

    public boolean IsHomeworkDone() { return this.IsHomeworkDone; }

    public void SetIsHomework(boolean homework) { this.IsHomeworkDone = homework; }

    public String GetDinnerMeal() { return this.DinnerMeal; }

    public void SetDinnerMeal(String dinnerMeal) { this.DinnerMeal = dinnerMeal; }

    private boolean CoinFlip() { return rand.nextBoolean(); }

    public boolean IsWeatherGood() {
        return true;
    }

    public boolean IsTodayGood() {
        if (!IsWeatherGood() || !IsHomeworkDone()) {
            if (CoinFlip() == true) {
                return false;
            }
        }

        return true;
    }

    public String ToString() {
        String output = "";

        return output;
    }
}