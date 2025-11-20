package booklibrary.entity;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;


@Entity
@Table(name= "books")
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String title;
    private Set<String> genre;
    private String author;
    private LocalDate PublishDate;
    @Column(columnDefinition = "TEXT")
    private String Description;
    private String Details;
    private double Rating;
    private String Format;
    private int Pages;
    private String coverURL;

    public Book(Long id, String title, Set<String> genre, String author, LocalDate publishDate, String description, String details, double rating, String format, int pages, String coverURL) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.author = author;
        PublishDate = publishDate;
        Description = description;
        Details = details;
        Rating = rating;
        Format = format;
        Pages = pages;
        this.coverURL = coverURL;
    }

    public Book() {

    }

    public String getCoverURL() {
        return coverURL;
    }

    public void setCoverURL(String coverURL) {
        this.coverURL = coverURL;
    }

    public int getPages() {
        return Pages;
    }

    public void setPages(int pages) {
        Pages = pages;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(double rating) {
        Rating = rating;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public LocalDate getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Set<String> getGenre() {
        return genre;
    }

    public void setGenre(Set<String> genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
