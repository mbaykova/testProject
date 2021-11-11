package lesson5.students;

public class Student {
    private String fullName;
    private String group;

    public double getAverageMark() {
        return averageMark;
    }

    private double averageMark;

    public Student(String fullName, String group, double averageMark){
        this.averageMark = averageMark;
        this.fullName = fullName;
        this.group = group;
    }

    public int getScholarship(){
        if (averageMark == 5) {
            return 15000;
        }
        return 10000;
    }
}
