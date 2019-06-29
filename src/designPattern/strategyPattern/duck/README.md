demo1 鸭子问题：
      有不同种类的鸭子，每种鸭子有不同的飞行方式和叫声方式

1、定义一个FlyBehavior(飞行接口)与QuackBehavior(鸭叫接口)
FlyBehavior中有fly()方法
QuackBehavior中有quack()方法

2、定义一个FlyWithWings类，继承FlyBehavior接口，并实现fly()方法
   定义一个FlyNoWay类，也继承FlyBehavior接口，并实现fly()方法
   
3、定义一个Quack类，继承QuackBehavior接口，并实现quack()方法
   定义一个Squeak类，继承QuackBehavior接口，并实现quack()方法
   
4、定义一个Duck抽象类
   成员变量：
   
           FlyBehavior flyBehavior;
           QuackBehavior quackBehavior;
   方法：
          
          //定义无参构造方法
          public Duck(){}

          //定义performFly() 和 performQuack()来执行fly()和quack()方法
          public void performFly(){
                flyBehavior.fly();
          }
          public void performQuack(){
                quackBehavior.quack();
          }
          
          //定义set方法来动态改变flyBehavior 和 quackBehavior
          public void setFlyBehavior(FlyBehavior flyBehavior){
                this.flyBehavior = flyBehavior;
          }
          public void setQuackBehavior(QuackBehavior quackBehavior){
                this.quackBehavior = quackBehavior;
          }
          
5、定义一个类RedHeadDuck 继承Duck类
   方法：
            
          //定义构造方法，实现FlyBehavior和QuackBehavior
          public RedHeadDuck(){
                 flyBehavior = new FlyWithWings();
                 quackBehavior = new Quack();
          }
          
6、测试
        
        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        //使用set动态改变行为
        redHeadDuck.setFlyBehavior(new FlyNoWay());
        redHeadDuck.performFly();