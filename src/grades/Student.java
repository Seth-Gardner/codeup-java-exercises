package grades;

import java.util.ArrayList;

public class Student {

    private String name;

    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        float sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }

    public static void main(String[] args) {

        Student seth = new Student("Seth");

        seth.addGrade(47);
        seth.addGrade(37);
        seth.addGrade(57);
        System.out.println(seth.getGradeAverage());


    }
}
