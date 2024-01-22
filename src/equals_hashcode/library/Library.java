package library;

public class Library {
    private Book[] library;
    private int size;

    public Library(int capacity) {
        library = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size == library.length) {
            System.out.println("Библиотека полна. Невозможно добавить больше книг.");
            return;
        }
        for (int i = 0; i < size; i++) {
            if (library[i].equals(book)) {
                System.out.println("Книга с таким ISBN уже существует: " + book.getIsbn());
                return;
            }
        }
        library[size++] = book;
    }

    public Book findBookByISBN(String isbn) {
        for (int i = 0; i < size; i++) {
            if (library[i].getIsbn().equals(isbn)) {
                return library[i];
            }
        }
        return null;
    }

    public void removeBook(String isbn) {
        for (int i = 0; i < size; i++) {
            if (library[i].getIsbn().equals(isbn)) {
                library[i] = library[size - 1];
                library[size - 1] = null;
                size--;
                return;
            }
        }
        System.out.println("Книга с ISBN " + isbn + " не найдена.");
    }
}
