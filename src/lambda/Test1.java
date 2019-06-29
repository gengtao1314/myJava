package lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.*;

/**
 * Created by gengtao on 2019/6/6.
 */
public class Test1 {
//    public static void main(String[] args) {
//        Test1 test1 = new Test1();
//        System.out.println(test1.biFunction1.apply("qwq","rerwf"));
//        System.out.println(test1.biFunction2.apply("fdsf","w"));
//    }


    //BiFunction两个输入,一个输出的函数式接口
    BiFunction<String, String, Integer> biFunction1 = new BiFunction<String, String, Integer>() {
        @Override
        public Integer apply(String s, String s2) {
            return (s + s2).length();
        }
    };

    BiFunction<String, String, Integer> biFunction2 = (a, b) ->{
        return (a + b).length();
    };

    BiConsumer<Too, String> bc = (to , str) -> {new Too().too(str);};
    BiConsumer<Too,String> bc2 = Too::too;

    Soom<Too,String> so = (too, str) -> {new Too().too(str);};
    Soom<Too,String> so2 = Too::too;

    class Too{
        public void too(String str){
            str.toUpperCase();
        }
    }

    interface Soom<Too,String>{
        void soom(Too too, String str);
    }


    public static void main(String[] args) {
        //无参数的构造函数
        Supplier<List> list2 = ArrayList::new;
        List<String> list3 = list2.get();
        Supplier<Person> persion = Person::new;
        Person p1 =  persion.get();

        //有参数的构造函数
        Consumer<Integer>persion2 = Person::new;  //无返回类型

        Function<String,Person> person3 = ss ->  new Person(ss);
        Function<String,Person> person4 = Person::new;
        Person p2 = person4.apply("张三");
     }
}
class Person{
    public Person(){
        System.out.println("persion");
    }

    public Person(int age){
        System.out.println("persion(age)");
    }

    public Person(String name){
        System.out.println(name);
    }
}