package grades;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student ry = new Student("Ry");
        ry.addGrade(98);
        ry.addGrade(94);
        ry.addGrade(88);

        Student quentin = new Student("Quentin");
        quentin.addGrade(100);
        quentin.addGrade(100);
        quentin.addGrade(55);

        Student kenneth = new Student("Kenneth");
        quentin.addGrade(88);
        quentin.addGrade(92);
        quentin.addGrade(76);

        Student sam = new Student("Sam");
        quentin.addGrade(70);
        quentin.addGrade(72);
        quentin.addGrade(78);

        students.put("ry-sutton", ry);
        students.putIfAbsent("QHewwit", quentin);
        students.putIfAbsent("KenMan", kenneth);
        students.putIfAbsent("smore", sam);

        commandLineInterface(students);
    }

    public static void commandLineInterface(HashMap<String, Student> students){
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of out students:");
        for (String key : students.keySet()){
            System.out.print("|" + key + "| ");
        }
    }
}
