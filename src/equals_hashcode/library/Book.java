package library;

public class Book {
    private String title;
    private String author;
    private int isbn;
    private int publishYear;

    Book (String title, String author, int isbn, int publishYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        int res = title != null ? title.hashCode() : 0;
        res = 31 * res + author.hashCode();
        res = 31 * res + isbn;
        res = 31 * res + publishYear;
        return res;
    }

}
