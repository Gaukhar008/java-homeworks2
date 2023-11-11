public class Book {
    private String author;
    private String title;
    //    private String category;
    private int id;
//    private int totalRatings;
//    private int numberOfRatings;

    public Book(String author, String title, int id) {
        this.author = author;
        this.title = title;
        this.id = id;
    }

    public Book() {

    }

    public void display() {
        System.out.println("Title: " + title + " by " + author + ", ID: " + id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }
}
