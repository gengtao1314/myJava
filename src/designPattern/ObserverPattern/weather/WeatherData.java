package designPattern.ObserverPattern.weather;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gengtao on 2019/6/29.
 * 实现一个气象站主题
 */
public class WeatherData implements Subject {
    private List<Observer> observers; //存放所有的观察者
    private BigDecimal temp; //温度
    private BigDecimal humidity; //湿度
    private BigDecimal pressure; //压力

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        //给每个观察者发送更新信息
        observers.stream().forEach(o ->{
            o.update(temp, humidity, pressure);
        });
    }

    public void measurementChanged(){
        notifyObserver();
    }

    //更新数据
    public void setMeasurements(BigDecimal temp, BigDecimal humidity, BigDecimal pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
