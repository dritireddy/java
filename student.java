class Student {
    int roll;
    String name;
    int age;
    String course;
    double CGPA;

    void display() {
        System.out.println("Student roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("CGPA: " + CGPA);
    }
}
class Main {
    public static void main(String args[]) {
        Student s1 = new Student();

        s1.roll = 25;
        s1.name = "Sharath Chandra";
        s1.age = 18;
        s1.course = "Information Technology";
        s1.CGPA = 7.75;

        s1.display();
    }
}