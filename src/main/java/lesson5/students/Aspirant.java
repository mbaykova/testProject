package lesson5.students;

public class Aspirant extends Student {
    private String scienceWorkName;


    public Aspirant(String fullName, String group, double averageMark, String scienceWorkName){
        super(fullName, group, averageMark);
        this.scienceWorkName = scienceWorkName;
    }

    public int getScholarship(){
        if (getAverageMark() == 5) {
            return 20000;
        }
        return 15000;
    }
}
