package Exam;
public class Student {
     String firstName;
    String lastName;
    String group;
    String isElder;
    double averageMar;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getIsElder() {
        return isElder;
    }

    public void setIsElder(String isElder) {
        this.isElder = isElder;
    }

    public double getAverageMar() {
        return averageMar;
    }

    public void setAverageMar(double averageMar) {
        this.averageMar = averageMar;
    }

    public Student(String firstName, String lastName, String group, boolean isElder, double averageMar) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.isElder = this.isElder;
        this.averageMar = averageMar;
    }
    public void getScholarship(){
        if (getAverageMar() == 5) {
            System.out.println("Сумма вашей стипендии 1000 сом");
        }else{
            System.out.println("Сумма вашей стипендии 800 сом");
        }
    }

}
