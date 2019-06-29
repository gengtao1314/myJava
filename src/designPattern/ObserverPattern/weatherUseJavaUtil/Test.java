package designPattern.ObserverPattern.weatherUseJavaUtil;

import java.math.BigDecimal;

/**
 * Created by gengtao on 2019/6/29.
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(new BigDecimal(25), new BigDecimal(30), new BigDecimal(60));
    }
}
