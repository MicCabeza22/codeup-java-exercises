package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    //  This section creates the Student constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getAverage() {
        int sumGrades = 0;

        for (Integer integer : grades) {
            sumGrades += integer;
        }

        return (double) sumGrades / grades.size();
    }

    public static void main(String[] args) {
        Student student1 = new Student("John Smith");
        student1.addGrade(97);
        student1.addGrade(81);
        student1.addGrade(88);

        System.out.println(student1.getName());
        System.out.println(student1.getAverage());
    }
}
