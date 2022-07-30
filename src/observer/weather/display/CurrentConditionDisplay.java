package observer.weather.display;

import observer.weather.Observer;
import observer.weather.WeatherData;

/**
 * Created by xu on 07/07/2017.
 */
public class CurrentConditionDisplay extends Observer implements DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;

    /*构造器传入一个Subject对象，并用此注册该观察者*/
    public CurrentConditionDisplay(WeatherData weatherData) {
        this.wd = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        /*调用DisplayElement*/
        display();
    }

    @Override
    public void display() {
        System.out.println("- - - - - - -Current conditions - - - - - -");
        System.out.println("Temperature: " + temp);
        System.out.println("Humidity " + humidity);
        System.out.println("Pressure " + pressure);
    }
}
