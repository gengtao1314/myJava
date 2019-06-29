package designPattern.ObserverPattern.weatherUseJavaUtil;

import java.math.BigDecimal;
import java.util.Observable;

/**
 * Created by gengtao on 2019/6/29.
 */
public class WeatherData extends Observable {
    private BigDecimal temp;
    private BigDecimal humidity;
    private BigDecimal pressure;

    //不必自己追踪观察者
    public WeatherData(){

    }

    public void setMeasurementsChanged(){
        setChanged(); //更新数据时，必须调用该方法
        notifyObservers(); //通知所有的观察者
    }
    //更新数据
    public void setMeasurements(BigDecimal temp, BigDecimal humidity, BigDecimal pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        setMeasurementsChanged();
    }

    //观察者可以使用get方法主动获取更新的数据
    public BigDecimal getTemp() {
        return temp;
    }

    public BigDecimal getHumidity() {
        return humidity;
    }

    public BigDecimal getPressure() {
        return pressure;
    }
}
