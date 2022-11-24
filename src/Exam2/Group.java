package Exam2;

public class Group {
    private int id;
    private String name;
    private Student[] students = new Student[4];

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] == null) {
                this.students[i] = student;
                System.out.println("Студент " + student.getName() + " зачислен в группу " + this.getName());
                return;
            }
        }
        System.out.println("К сожалению в группе нет мест(");
    }

    public static void searchByGroupName(Group[] groups, String nameOfGroup) {
        for (int i = 0; i < groups.length; i++) {
            if (groups[i].getName().equals(nameOfGroup)) {
                System.out.println(" Группа с названием " + nameOfGroup + " найдена");
                for (int j = 0; j < groups[i].getStudents().length; j++) {
                    if (groups[i].getStudents()[j] != null) {
                        System.out.println("Имя" + groups[i].getStudents()[j].getName() + ": Возраст " +
                                groups[i].getStudents()[j].getAge());
                    }
                }
                return;
            }
        }
        System.out.println(" Группы с названием " + nameOfGroup + " нет");
    }

    public static void printInfoGroups(Group[] groups) {
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] != null) {
                System.out.println("Группа: " + groups[i].getName());
                for (int j = 0; j < groups[i].getStudents().length; j++) {
                    if (groups[i].getStudents()[j] != null)
                        System.out.println("Имя" +
                                groups[i].getStudents()[j].getName()
                                + ": Возраст " +
                                groups[i].getStudents()[j].getAge());
                }
            }
        }
    }

}