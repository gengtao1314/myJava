使用Java内置的观察者类

使用java内置的观察类与自定义观察类的区别：

1、Observable不是接口，所以不是面向接口编程

2、只有当changed变量为true时才可以广播消息给观察者，
所以在发送请求广播给观察者时，必须先调用setChanged()方法，已保证changed为true
可以调用clearChanged()方法将changed置为false
也可以调用hasChanged()查看当前changed的状态

3、使用Observable时不需要在实体类中自己定义List存储Observer

4、可以使用set方法主动获取变更的数据，而不是让可观察者（即主题）直接将所有数据全部发给观察者