package task_1;

public class SupplierReader extends User implements Supplier, Reader {
    public SupplierReader(String name) {
        super(name);
    }

    @Override
    public void supplyBooks(Librarian librarian) {
        User librarianUser = (User) librarian;
        System.out.println("Supplier " + getName() + " supplied the books to the Librarian " + librarianUser.getName());
    }

    @Override
    public void takeBook(Administrator admin) {
        User adminUser = (User) admin;
        System.out.println("Reader " + getName() + " took the books from the Administrator " + adminUser.getName());
    }

    @Override
    public void returnBook(Administrator admin) {
        User adminUser = (User) admin;
        System.out.println("Reader " + getName() + " returned the books to the Administrator " + adminUser.getName());
    }
}
