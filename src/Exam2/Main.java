package Exam2;

public class Main {
    public static void main(String[] args) {
        Group[] groups = new Group[3];

        Student student1 = new Student(" Martin", 21);
        Student student2 = new Student(" Joe", 20);
        Student student3 = new Student(" Masha", 19);
        Student student4 = new Student(" Sasha", 18);

        Group pascal = new Group(1, "Pascal");
        Group java = new Group(1, "Java");

        groups[0] = java;
        groups[1] = pascal;

        java.addStudent(student1);
        java.addStudent(student3);

        pascal.addStudent(student2);
        pascal.addStudent(student4);

        Group.searchByGroupName(groups, "Java");
        Group.printInfoGroups(groups);
    }
}
