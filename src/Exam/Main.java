package Exam;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        Student students1 = new Student("Yroslav", "Korchemkin", "Medic",false,3.0);
        Student students2 = new Student("Argen", "Ablosanov", "Medic",true, 5.0);
        Aspirant aspirant1 = new Aspirant("Danil", "Chehovskoi", "Medic Aspirant", true,3.0, false);
        Aspirant aspirant2 = new Aspirant("Ira", "Panchenko", "Medic Aspirant", false, 5.0, true);

        students[0] = students1;
        students[1] = students2;
        students[2] = aspirant1;
        students[3] = aspirant2;

        System.out.println("Студент: " + students1.getFirstName() +  " " + students1.getLastName());
        students1.getScholarship();
        System.out.println();
        System.out.println("Студент: " + students2.getFirstName() + " " + students2.getLastName());
        students2.getScholarship();
        System.out.println();
        System.out.println("Аспирант: " + aspirant1.getFirstName() + " " + aspirant1.getLastName());
        aspirant1.getScholarship();
        System.out.println();
        System.out.println("Аспирант: " + aspirant2.getFirstName() + " " + aspirant2.getLastName());
        aspirant2.getScholarship();
        System.out.println();

    }
}