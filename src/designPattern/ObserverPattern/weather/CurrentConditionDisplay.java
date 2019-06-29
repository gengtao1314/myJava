package designPattern.ObserverPattern.weather;

import java.math.BigDecimal;

/**
 * Created by gengtao on 2019/6/29.
 * 实现获取最新信息的 观察者
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
    private BigDecimal temp;
    private BigDecimal humidity;
    private BigDecimal pressure;
    private Subject subject;

    //在构造方法里注册到主题中
    public CurrentConditionDisplay(Subject sub){
        this.subject = sub;
        sub.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temp: " + this.temp + "  humidity: " + this.humidity + "  pressure: " + this.pressure);
    }

    @Override
    public void update(BigDecimal temp, BigDecimal humidity, BigDecimal pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
