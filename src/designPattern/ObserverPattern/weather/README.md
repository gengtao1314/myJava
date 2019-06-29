自定义观察者模式

需求：气象站（主题 Subject）会在气象信息（温度、湿度、压力）发生变化时，通知每个订阅者（观察者 Observer）

分析：
1、编写Observer接口
方法：
    update(); //用于接收Subject更新的数据

2、编写Subject接口
方法：
    registerObserver(Observer o);  //注册 Observer
    removeObject(Observer o);   //注销 Observer
    notify(),   //更新数据时给 Observer发送消息

3、编写DisplayElement接口，用于观察者接收数据后执行任务

4、编写WeatherData（气象站）类，继承Subject接口
成员变量：
    List<Observer> observerList;   //存放所有就的观察者
    BigDecimal temp;    //温度
    BigDecimal humidity;    //湿度
    BigDecimal pressure;    //压力
    (1) 在构造方法里实例化observerList,用于存放所有的观察者
    (2) 在registerObserver(Observer o)中将o添加到observerList中
    (3) 在removeObject(Observer o)中将观察者o注销
    (4) 在setMeasurements(BigDecimal temp, BigDecimal humidity, BigDecimal pressure)中更新数据，
    然后调用notify()方法通知每个观察者
        
5、编写CurrentConditionDisplay(获取最近天气变化信息), 继承Observer和DisplayElement接口
    (1) 在构造方法里将 该观察者 注册到 主题 中
    (2) 在update()方法中获取数据，并更新数据
    (3) 在display()方法中执行任务
