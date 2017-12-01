package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Object> students = new HashMap<>();

        Student james = new Student("James T. Kirk");
        james.addGrade(52);
        james.addGrade(85);
        james.addGrade(67);

        Student ivan = new Student("Ivan Sokolov");
        ivan.addGrade(76);
        ivan.addGrade(81);
        ivan.addGrade(79);

        Student robbie = new Student("Robbie Rotten");
        robbie.addGrade(47);
        robbie.addGrade(36);
        robbie.addGrade(99);

        Student abraham = new Student("Abraham Lincoln");
        abraham.addGrade(100);
        abraham.addGrade(98);
        abraham.addGrade(96);

        students.put("VagaJamesBond", james.getName());
        students.put("cheekibreeki", ivan.getName());
        students.put("numberOne", robbie.getName());
        students.put("MrPOTUS16", abraham.getName());
    }
}
