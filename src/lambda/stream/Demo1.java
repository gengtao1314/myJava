package lambda.stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by gengtao on 2019/6/10.
 */
public class Demo1 {
    public static void main(String[] args) {
        //设置线程数为5
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism","5");

        Optional<Integer>sum =  Stream.iterate(1, x -> x + 1).limit(200).peek(x -> {
            System.out.println(Thread.currentThread().getName());
        }).parallel().max(Integer :: compare);
        System.out.println(sum);
    }
}
