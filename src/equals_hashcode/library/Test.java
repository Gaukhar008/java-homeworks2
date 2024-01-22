package library;

public class Test {
    public static void main(String[] args) {
        Library library = new Library(5);
        Book book1 = new Book("Harry Potter", "Joanne Rowling", "747532743", 1997);
        Book book2 = new Book("Shuggie Bain", "Douglas Stuart", "546277399", 1980);

        library.addBook(book1);
        library.findBookByISBN(book1.getIsbn());
        library.addBook(book2);
        library.findBookByISBN("546277399");

        library.removeBook(book1.getIsbn());
        library.findBookByISBN(book1.getIsbn());
    }
}
