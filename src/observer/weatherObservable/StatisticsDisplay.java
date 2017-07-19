package observer.weatherObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by xu on 08/07/2017.
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    Observable obs;
    private float maxTemp = 0.0f;
    private float mintTemp = 200f;
    private float tempSum=0.0f;
    private int numReadings;

    public StatisticsDisplay(Observable observable) {
        this.obs = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData wd = (WeatherData) o;
            float temp = wd.getTemperature();
            tempSum += temp;
            maxTemp = Math.max(maxTemp, temp);
            mintTemp = Math.min(mintTemp, temp);
            numReadings++;
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("- - - - - Statistics Display - - - - -");
        System.out.println("Avg/min/max temperatures: "
                            + tempSum/numReadings + "/"
                            + mintTemp + "/"
                            + maxTemp);
    }
}
