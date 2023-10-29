package src.objects_and_objects.library_project;

public class Test {
    public static void main(String[] args) {
        Book book = new Book();
        book.author = "Joanne Rowling";
        book.title = "Harry Potter";
        book.id = 11111;

        Student student = new Student();
        student.name = "Gaukhar";
        student.id = 876545678;

        Library library = new Library();
        library.availableBook = book;

        student.displayInfo();
        library.lendBook(student);
        student.displayInfo();

        library.acceptBook(student);
        student.displayInfo();

        Teacher teacher = new Teacher();
        Subject subjectMath = new Subject();
        teacher.name = "Mariya Petrovna";
        teacher.age = 68;
        teacher.subject = subjectMath;
        teacher.subject.displayInfoSubject();
        teacher.subject.rank = 1;
        teacher.subject.category = 10;

        System.out.println(teacher.subject.category);

        teacher.talk();
        teacher.displayInfo();
    }
}
