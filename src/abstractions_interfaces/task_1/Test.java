package task_1;

public class Test {
    public static void main(String[] args) {
        Supplier supplier = new SupplierReader("Eva");
        Librarian librarian = new LibrarianAdministrator("Duke");
        supplier.supplyBooks(librarian);

        Reader reader = new SupplierReader("Lisa");
        Administrator administrator = new LibrarianAdministrator("Lora");
        administrator.giveBooks(reader);
        administrator.takeBooks(reader);
        administrator.overdueNotification(reader);
    }
}
