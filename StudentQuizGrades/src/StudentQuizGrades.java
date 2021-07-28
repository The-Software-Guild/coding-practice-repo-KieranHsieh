import java.util.ArrayList;
import java.util.HashMap;

public class StudentQuizGrades {
    public static void main(String[] args) {
        UserIOConsoleImpl console = new UserIOConsoleImpl();
        HashMap<String, ArrayList<Integer>> students = new HashMap<>();
        boolean stillRunning = true;
        while(stillRunning) {
            console.print("1. View All Students");
            console.print("2. Add a Student");
            console.print("3. Remove a Student");
            console.print("4. See Quiz Scores for Student");
            console.print("5. View average quiz score for Student");
            console.print("6. Add Quiz Score for Student");
            console.print("7. Exit");
            int selection = console.readInt("Enter a selection: ");
            switch(selection) {
                case 1:
                    for(String s : students.keySet()) {
                        System.out.println(s);
                    }
                    break;
                case 2:
                    String name = console.readString("Enter Student Name: ");
                    students.put(name, new ArrayList<>());
                    break;
                case 3:
                    name = console.readString("Enter Student Name to Remove: ");
                    students.remove(name);
                    break;
                case 4:
                    name = console.readString("Enter Student Name to view quiz scores for: ");
                    ArrayList<Integer> scores = students.get(name);
                    for(int i : scores) {
                        console.print(Integer.toString(i));
                    }
                    break;
                case 5:
                    name = console.readString("Enter Student name to view average quiz score for: ");
                    scores = students.get(name);
                    double total = 0;
                    for(int i : scores) {
                        total += i;
                    }
                    console.print("Average Quiz Score for " + name + " = " + (total / students.size()));
                    break;
                case 6:
                    name = console.readString("Enter Student name to add a quiz score for: ");
                    int score = console.readInt("Enter the quiz score for " + name + ": ");
                    students.get(name).add(score);
                    break;
                case 7:
                    stillRunning = false;
            }
        }
    }
}
