package observer.weatherObservable;

/**
 * Created by xu on 08/07/2017.
 */
public class WeatherStation {
     public static void main(String[] args){
         WeatherData weatherData = new WeatherData();
         CurrentConditionDisplay ccd = new CurrentConditionDisplay(weatherData);
         StatisticsDisplay sd = new StatisticsDisplay(weatherData);
         ForecastDisplay fd = new ForecastDisplay(weatherData);

         weatherData.setMeasurements(1,2,3);
         weatherData.setMeasurements(2,3,4);
         weatherData.setMeasurements(0,5,2);
     }
}
