package lambda.stream;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by gengtao on 2019/6/10.
 */
public class Book {
    private int id;

    private String name;

    private LocalDate publicDate;

    private Double price;

    private String type;

    private Date endDate;

    public Book(int id, String name, LocalDate publicDate, Double price, String type) {
        this.id = id;
        this.name = name;
        this.publicDate = publicDate;
        this.price = price;
        this.type = type;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(LocalDate publicDate) {
        this.publicDate = publicDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publicDate=" + publicDate +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
