package designPattern.ObserverPattern.weather;

/**
 * Created by gengtao on 2019/6/29.
 * 定义主题
 */
public interface Subject {
    //注册观察者
    public void registerObserver(Observer observer);
    //注销观察者
    public void removeObserver(Observer observer);
    //通知观察者
    public void notifyObserver();
}
