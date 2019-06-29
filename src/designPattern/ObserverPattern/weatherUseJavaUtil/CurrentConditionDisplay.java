package designPattern.ObserverPattern.weatherUseJavaUtil;

import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by gengtao on 2019/6/29.
 */
public class CurrentConditionDisplay implements Observer , DisplayElement {
    private BigDecimal temp;
    private BigDecimal humidity;
    private BigDecimal pressure;
    private Observable ob;

    public CurrentConditionDisplay(Observable obs){
        this.ob = obs;
        ob.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temp: " + this.temp + "  humidity: " + this.humidity + "  pressure: " + this.pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
