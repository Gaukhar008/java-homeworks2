package src.objects_and_objects.library_project;

public class Library {
    Book availableBook;  // Only one book can be available for lending

    // Method to lend a book to a student
    void lendBook(Student student) {
        if (availableBook != null && student.borrowedBook == null) {
            student.borrowedBook = availableBook;
            availableBook = null;
        } else {
            System.out.println("Book already borrowed or student already has a book!");
        }
    }

    // Method to accept a returned book
    void acceptBook(Student student) {
        if (availableBook == null && student.borrowedBook != null) {
            availableBook = student.borrowedBook;
            student.borrowedBook = null;
        } else {
            System.out.println("Library already has a book or student doesn't have a book!");
        }
    }
}
