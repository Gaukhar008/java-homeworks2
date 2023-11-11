public class Library {
    private Book availableBook;  // Only one book can be available for lending

    public Library() {

    }

    // Method to lend a book to a student
    public void lendBook(Person person) {
        if (availableBook != null && person.getBorrowedBook() == null) {
            person.setBorrowedBook(availableBook);
            availableBook = null;
        } else {
            System.out.println("Book already borrowed or person already has a book!");
        }
    }


    // Method to accept a returned book
    public void acceptBook(Person person) {
        if (availableBook == null && person.getBorrowedBook() != null) {
            availableBook = person.getBorrowedBook();
            person.setBorrowedBook(null);
        } else {
            System.out.println("Library already has a book or student doesn't have a book!");
        }
    }

    public Book getAvailableBook() {
        return availableBook;
    }

    public void setAvailableBook(Book availableBook) {
        this.availableBook = availableBook;
    }
}
