import java.util.HashMap;
import java.util.Scanner;


class StudentGrades {
    private HashMap<String, Integer> studentMap;

    public StudentGrades() {
        studentMap = new HashMap<>();
    }


    public void addStudent(String name, int grade) {
        studentMap.put(name, grade);
        System.out.println(name + " has been added!");
    }

    public void removeStudent(String name) {
        if (studentMap.containsKey(name)) {
            studentMap.remove(name);
            System.out.println(name + " has been removed!");
        } else {
            System.out.println(name + " is not in the list.");
        }
    }

    public void displayGrade(String name) {
        if (studentMap.containsKey(name)) {
            System.out.println(name + "'s grade: " + studentMap.get(name));
        } else {
            System.out.println(name + " is not in the list.");
        }
    }

    public static void main(String[] args) {
        StudentGrades sg = new StudentGrades();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    sg.addStudent(name, grade);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    name = scanner.nextLine();
                    sg.removeStudent(name);
                    break;
                case 3:
                    System.out.print("Enter student name to view grade: ");
                    name = scanner.nextLine();
                    sg.displayGrade(name);
                    break;
                case 4:
                    System.out.println("Thank you! Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

