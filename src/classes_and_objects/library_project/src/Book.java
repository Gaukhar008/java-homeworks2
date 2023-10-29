package src.objects_and_objects.library_project;

public class Book {
    String author;
    String title;
    String category;
    int id;
    int totalRatings;
    int numberOfRatings;

    public void displayBook() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("ID: " + id);
    }
}
