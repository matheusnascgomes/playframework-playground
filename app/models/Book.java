package models;

import io.ebean.*;

import javax.persistence.*;

@Entity
public class Book extends Model{

    @Id
    public Integer id;
    public String title;
    public Integer price;
    public String author;

    public Book(Integer id, String title, Integer price, String author) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
    }
}
