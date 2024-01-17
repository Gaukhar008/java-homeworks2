package task_1;

public class LibrarianAdministrator extends User implements Librarian, Administrator {
    public LibrarianAdministrator(String name) {
        super(name);
    }

    @Override
    public void orderBooks(Supplier supplier) {
        User supplierUser = (User) supplier;
        System.out.println("Librarian " + getName() + " ordered books from the Supplier " + supplierUser.getName());
    }

    @Override
    public void giveBooks(Reader reader) {
        User readerUser = (User) reader;
        System.out.println("Administrator " + getName() + " gave books to the Reader " + readerUser.getName());
        reader.takeBook(this);
    }

    @Override
    public void takeBooks(Reader reader) {
        User readerUser = (User) reader;
        System.out.println("Administrator " + getName() + " took books from the Reader " + readerUser.getName());
    }

    @Override
    public void overdueNotification(Reader reader) {
        User readerUser = (User) reader;
        System.out.println("Administrator " + getName() + " notified the Reader " + readerUser.getName() + " about an overdue");
    }
}
