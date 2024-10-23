/**
 * GoodDay class for Module 5
 * This GoodDay class is used to determine whether it has been a good day or not using
 * the temperature, humidity, what's for dinner and whether homework is done or not.
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

    /**
     * Default contructor for the GoodDay object
     * Sets all properties to 0, false or empty strings.
     */
    GoodDay() {
        Temperature = 0;
        Humidity = 0.0;
        IsHomeworkDone = false;
        DinnerMeal = "";
    }

    /**
     * Parameterized constructor for the GoodDay object
     *
     * @param temperature   The temperature for the day.
     * @param humidity      The humidity for the day.
     * @param isHomework    True if homework is done, false if not.
     * @param dinnerMeal    Dinner planned for that day.
     */
    GoodDay(int temperature, double humidity, boolean isHomework, String dinnerMeal) {
        Temperature = temperature;
        Humidity = humidity;
        IsHomeworkDone = isHomework;
        DinnerMeal = dinnerMeal;
    }

    /**
     * Gets the Temperature for the day.
     * @return The temperature for the day.
     */
    public int GetTemperature() { return this.Temperature; }

    /**
     * Sets the Temperature for the day.
     * @param temperature   The temperature to be set.
     */
    public void SetTemperature(int temperature) { this.Temperature = temperature; }

    /**
     * Gets the Humidity for the day.
     * @return The humidity for the day.
     */
    public double GetHumidity() { return this.Humidity; }

    /**
     * Sets the Humidity for the day.
     * @param humidity      The humidity to be set.
     */
    public void SetHumidity(int humidity) { this.Humidity = humidity; }

    /**
     * Returns a boolean for if homework is done for the day.
     * @return True if homework is done.
     */
    public boolean IsHomeworkDone() { return this.IsHomeworkDone; }

    /**
     * Sets if homework is done for the day.
     * @param homework      Boolean value for if homework is done for the day.
     */
    public void SetIsHomework(boolean homework) { this.IsHomeworkDone = homework; }

    /**
     * Gets the planned meal for dinner.
     * @return  The planed meal for dinner.
     */
    public String GetDinnerMeal() { return this.DinnerMeal; }

    /**
     * Sets the planned meal for dinner.
     * @param dinnerMeal    The meal you plan to eat for dinner.
     */
    public void SetDinnerMeal(String dinnerMeal) { this.DinnerMeal = dinnerMeal; }

    /**
     * Simple coin flip function to return true or false.
     * @return True or false to simulate a coin flip.
     */
    private boolean CoinFlip() { return rand.nextBoolean(); }

    /**
     * Returns a boolean for if the weather is good or not.
     * @return  A boolean for if the weather is good.
     */
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

    /**
     * Returns if the day is good or not.
     * @return  A boolean for if the day is good.
     */
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

    /**
     * Returns a string to be outputed with a summary of the object.
     * @return An output string with a summary of the object
     */
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