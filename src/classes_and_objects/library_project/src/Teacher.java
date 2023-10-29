package src.objects_and_objects.library_project;

public class Teacher {
    String name;
    int age;
    Subject subject;

    public void talk() {
        System.out.println("The teacher talks");
    }

    public void displayInfo() {
        System.out.println("The name of teacher: " + name + " and age: " + age);
    }
}
