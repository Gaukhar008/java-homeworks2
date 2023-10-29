package src.objects_and_objects.library_project;

public class Student {
    String name;
    int id;
    Book borrowedBook;

    public void displayInfo() {
        System.out.println("Student: " + name);
        System.out.println("Student ID: " + id);
        if (borrowedBook != null) {
            System.out.println("Borrowed book: ");
            borrowedBook.displayBook();
        } else {
            System.out.println("No book was borrowed");
        }
    }
}
