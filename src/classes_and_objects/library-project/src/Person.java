public class Person {
    private String name;
    private int id;
    private Book borrowedBook;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        if ( borrowedBook != null) {
            System.out.println("Borrowed book: ");
            borrowedBook.display();
        }
        else {
            System.out.println("No book borrowed");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }
}
