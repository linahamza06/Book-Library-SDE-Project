package booklibrary.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Reviews {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="book_id")
    private Book book;


    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    private int rating;

    @Column(columnDefinition = "TEXT")
    private String description;

    public Reviews() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {}

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
