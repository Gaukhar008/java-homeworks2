package library;

public class Library {
    private Book[] library = new Book[100];

    public void addBook(Book book) {
        if (!this.searchBook(book.getIsbn())) {
            for (int i = 0; i < library.length; i++) {
                if (library[i] == null) {
                    library[i] = book;
                    System.out.println("The book is added to the library");
                    break;
                }
            }
        } else {
            System.out.println("The book already exists in the library");
        }
    }

    public boolean searchBook(int isbn) {
        for (Book element : library) {
            if (element != null) {
                if (element.getIsbn() == isbn) {
                    System.out.println("The book exists in the library:");
                    System.out.println("Title: " + element.getTitle() + "\nAuthor: " + element.getAuthor() +
                            "\nPublished year: " + element.getPublishYear());
                    return true;
                };
            }
        };
        System.out.println("The book does not exist in the library");
        return false;
    };

    public void deleteBook(Book book) {
        if (this.searchBook(book.getIsbn())) {
            for (int i = 0; i < library.length; i++) {
                if (library[i] != null) {
                    if (library[i].equals(book)) {
                        library[i] = null;
                        System.out.println("The book was deleted from the library");
                    }
                }
            }
        } else {
            System.out.println("The library does not have this book, impossible to delete");
        }
    }
}
