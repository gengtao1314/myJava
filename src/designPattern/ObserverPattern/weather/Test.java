package designPattern.ObserverPattern.weather;

import java.math.BigDecimal;

/**
 * Created by gengtao on 2019/6/29.
 */
public class Test {
    public static void main(String[] args) {
        //获取一个主题实例
        WeatherData weatherData = new WeatherData();
        //将 currentConditionDisplay 注册到 weatherData 中
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        //更新气象信息
        weatherData.setMeasurements(new BigDecimal(25), new BigDecimal(30), new BigDecimal(60));
    }
}
