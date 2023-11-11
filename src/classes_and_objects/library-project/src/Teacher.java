public class Teacher extends Person {
    private Subject subject;

    public Teacher(String name, int id, Subject subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher: " + this.getName() + "; ID: " + this.getID() + "; Subject: " + this.getSubject());
        super.displayInfo();
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
