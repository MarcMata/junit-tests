import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public double getGradeAverage(){
        double sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    //delete grade
    public void deleteGrade(int grade){
        grades.remove(grade);
    }
    //updateGraade
    public void updateGrade(int grade, int newGrade){
        grades.set(grade, newGrade);
    }
}
