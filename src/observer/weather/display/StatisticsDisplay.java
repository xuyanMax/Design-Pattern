package observer.weather.display;

import observer.weather.Observer;
import observer.weather.WeatherData;

/**
 * Created by xu on 07/07/2017.
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private WeatherData wd;

    public StatisticsDisplay(WeatherData weatherData) {
        this.wd = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;
        maxTemp = Math.max(maxTemp, temp);
        minTemp = Math.min(minTemp, temp);
        display();
    }

    @Override
    public void display() {
        System.out.println("- - - - - - -Statistics display - - - - - -");
        System.out.println("Avg/Max/Min temperatures = " + (tempSum/numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
