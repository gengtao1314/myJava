package lambda.stream;

import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by gengtao on 2019/6/10.
 */
public class TestLambda {
    @Test
    public void test1(){
        //将数组转为Map
        String queryString = "userName=张三&password=123456&type=1&token=11111";
        Map<String,String> param = Stream.of(queryString.split("&"))
                .map(str -> str.split("="))
                .collect(Collectors.toMap(s -> s[0], s -> s[1]));
        System.out.println(param);
    }

    //对象排序
    @Test
    public void test2(){
        //输出int id          [1, 2, 3, 4, 5, 6]
        List<Integer>ids = bookList().stream()
                .map(book -> book.getId())
                .collect(Collectors.toList());
        System.out.println(ids);
        //输出String id          ('1','2','3','4','5','6')
        String names = bookList().stream()
                .map(book ->"'" + book.getId() + "'")
                .collect(Collectors.joining(",", "(", ")"));
        System.out.println(names);
        //根据价格从高到低排序
        List<Book> books = bookList().stream()
                .sorted((book1, book2) -> Double.compare(book2.getPrice(), book1.getPrice()))
                .collect(Collectors.toList());
     //   System.out.println(books);
        //价格相同时根据日期从近到远排序
        Comparator<Book> comp = (book1, book2) ->Double.compare(book1.getPrice(), book2.getPrice());
        List<Book> books1 = bookList().stream()
                .sorted(comp.thenComparing((book1, book2) -> book1.getPublicDate().isAfter(book2.getPublicDate()) ? -1 : 1))
                .collect(Collectors.toList());
       // System.out.println(books1);
        //利用Comparator排序,reversed()表示倒序
        List<Book> books2 = bookList().stream()
                .sorted(Comparator.comparing(Book::getPrice)
                        .reversed()
                        .thenComparing(Comparator.comparing(Book::getPublicDate).reversed())
                ).collect(Collectors.toList());
        System.out.println(books2);
    }

    @Test
    public void test3(){
        //价格平均值
        Double avg = bookList().stream().collect(Collectors.averagingDouble(Book :: getPrice));
        BigDecimal val = new BigDecimal(avg);
        BigDecimal res = val.setScale(2,BigDecimal.ROUND_HALF_UP); //ROUND_HALF_UP向上四舍五入,即0.5取1
       // System.out.println(res);
        //返回价格最高的且日期最近的
        Optional<Book>maxBook =  bookList().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Book :: getPrice)
                        .thenComparing(Comparator.comparing(Book::getPublicDate))
                        ));
        System.out.println(maxBook);

        //返回价格最低的
        Optional<Book>minBook =  bookList().stream()
                .collect(Collectors.minBy(Comparator.comparing(Book::getPrice)));
       // System.out.println(minBook);
    }

    @Test
    public void test4(){
        //将list转为map
        Map<Integer, Book> bookMap = bookList().stream().collect(Collectors.toMap(Book::getId, book2 -> book2));
        //  System.out.println(bookMap);

        //根据类型分组
        Map<String,List<Book>>groupByType =  bookList().stream().collect(Collectors.groupingBy(Book::getType));
        groupByType.entrySet().forEach(x ->{
            System.out.println(x.getKey());
            System.out.println(x.getValue());
        });

        //统计每种类型的数量
        Map<String, Long>coutByType = bookList().stream().collect(Collectors.groupingBy(Book :: getType, Collectors.counting()));
        // System.out.println(coutByType);
    }

    @Test
    public void test5(){
        Comparator<Book> comp = (book1, book2) -> book1.getEndDate().after(book2.getEndDate()) ? -1 : 1;
        bookList().stream().sorted(comp).collect(Collectors.toList()).forEach(System.out::println);
    }

    private List<Book> bookList(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(1 ,"java", LocalDate.parse("2014-11-03"), 51.0,"编程语言"));
        books.add(new Book(2 ,"php", LocalDate.parse("2011-03-12"), 53.0, "编程语言"));
        books.add(new Book(3 ,"html", LocalDate.parse("2015-06-08"), 48.0, "编程语言"));
        books.add(new Book(4 ,"mysql", LocalDate.parse("2016-08-23"), 52.0, "数据库"));
        books.add(new Book(5 ,"oracle", LocalDate.parse("2013-07-20"), 48.0, "数据库"));
        books.add(new Book(6 ,"hbase", LocalDate.parse("2011-05-12"), 51.0, "数据库"));
        books.add(new Book(7 ,"oracle 12g", LocalDate.parse("2013-08-12"), 53.0, "数据库"));
        return books;
    }
}
