import java.io.*;
import java.util.*;

public class StudentNameFile {
    public static void main(String[] args) throws IOException {
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Pradeep");
        studentNames.add("Sravya");
        studentNames.add("PeterParker");
        studentNames.add("Odin");

        String filename = "E:\\Cognizant\\Daily_tasks_JS002\\TECHACADEMY-DAILY-TASK-JAVA-STANDARD-main\\Day - 14&15(java)/students.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (String name : studentNames) {
            writer.write(name);
            writer.newLine();
        }
        writer.close();
        System.out.println("The student names will be added in the file.");

        System.out.println("\nStudent names in the UPPERCASE:");
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line.toUpperCase());
        }
        reader.close();
    }
}
