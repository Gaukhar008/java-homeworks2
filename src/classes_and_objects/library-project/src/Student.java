public class Student extends Person {

    public Student(String name, int id) {
        super(name, id);
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + this.getName() + ", ID: " + this.getID());
        super.displayInfo();
    }
}
