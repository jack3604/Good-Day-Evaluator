/**
 * GoodDay class for Module 5
 *
 *
 * @author Adisson Buchanan
 */
public class GoodDay {
    private int Temperature;
    private double Humidity;
    private boolean IsHomeworkDone;
    private String DinnerMeal;

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

    public boolean IsTodayGood() {
        return true;
    }

    public boolean IsWeatherGood() {
        return true;
    }

    public String ToString() {
        String output = "";

        return output;
    }
}