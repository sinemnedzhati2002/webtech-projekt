package htw.webtech.myapp;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String genre;
    private Integer rating; // 1-5
    private LocalDate finishedOn;

    public Book() {}

    // Konstuktor

    public Book(String title, String author, String genre, Integer rating, LocalDate finishedOn) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
        this.finishedOn = finishedOn;
    }

    // Getter/Setter
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id; }
    public String getTitle() {return title; }
    public void setTitle(String title) {this.title = title; }
    public String getAuthor() {return author; }
    public void setAuthor(String author) {this.author = author; }
    public String getGenre() {return genre; }
    public void setGenre(String genre) {this.genre = genre; }
    public Integer getRating() {return rating; }
    public void setRating(Integer rating) {this.rating = rating; }
    public LocalDate getFinishedOn() {return finishedOn; }
    public void setFinishedOn(LocalDate finishedOn) {this.finishedOn = finishedOn; }

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + id +
                ", name=" + title + '\'' +
                ", author=" + author + '\'' +
                ", genre=" + genre + '\'' +
                ", rating=" + rating +
                ", finishedOn=" + finishedOn +
                '}';
        }
    }



