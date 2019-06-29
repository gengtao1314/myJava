package designPattern.ObserverPattern.weather;

import java.math.BigDecimal;

/**
 * Created by gengtao on 2019/6/29.
 * 定义观察者
 */
public interface Observer {
    //当主题数据发生改变时，调用update()将数据传递给观察者
    void update(BigDecimal temp, BigDecimal humidity, BigDecimal pressure);
}
