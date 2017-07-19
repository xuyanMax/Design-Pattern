package observer.weather;

import observer.weather.display.CurrentConditionDisplay;
import observer.weather.display.ForecastDisplay;
import observer.weather.display.StatisticsDisplay;

/**
 * Created by xu on 07/07/2017.
 */
public class WeatherStation {
     public static void main(String[] args){
         WeatherData wd = new WeatherData();
         CurrentConditionDisplay ccd = new CurrentConditionDisplay(wd);
         ForecastDisplay fd = new ForecastDisplay(wd);
         StatisticsDisplay sd = new StatisticsDisplay(wd);

         wd.setMeasurements(11,50,4000);
         wd.setMeasurements(14,70,5000);
         wd.setMeasurements(18,80,4500);
     }
}
