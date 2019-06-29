package lambda;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.function.BiFunction;

/**
 * Created by gengtao on 2019/6/10.
 */
public class Test3 {
    @Test
    public void test1(){
        BiFunction<BigDecimal,BigDecimal,BigDecimal> total  = (x1, x2) -> x1.add(x2);
        BigDecimal xx = total.apply(new BigDecimal("232.343"),new BigDecimal("34.4535346"));
        System.out.println(xx);
    }

    @Test
    public void test2(){
        String ss = "qwe";
        stringTest(ss);
        System.out.println(ss);
    }

    @Test
    public void test3(){
        Person p = new Person();
        p.setAge(23);
        p.setName("zhangsan");
        ObjTest(p);
        System.out.println(p);
    }

    public void stringTest(String ss){
        ss = ss + "123";
    }

    public void ObjTest(Person p){
        p.setName("lisi");
        p.setAge(12);
    }

    class Person{
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
