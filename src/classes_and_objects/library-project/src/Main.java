public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("E.B. White", "Charlotte’s Web", 12345);
        Student student1 = new Student("Gaukhar", 17673840);
        Teacher teacher1 = new Teacher("Halsey", 34567890, new Subject("Geometry") );

        library.setAvailableBook(book1);
        student1.displayInfo();

        library.lendBook(student1);
        student1.displayInfo();
        library.acceptBook(student1);

        teacher1.displayInfo();
        library.lendBook(teacher1);
        teacher1.displayInfo();
    }
}