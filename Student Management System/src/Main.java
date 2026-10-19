import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main ( String [] args ){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        Average avg = new Average();
        int []marks = new int[3];

        while (true){
            System.out.println("----Welcome to Student Management System----");
            System.out.println("1. Enter with your ID");
            System.out.println("2. Check you Average ");
            System.out.println("3. View all Students");
            System.out.println("4. Exit ");
            int choice = sc.nextInt();
            if (choice == 4){
                System.out.println("Exiting....");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter your id : ");
                    int id = sc.nextInt();
                    System.out.println("Enter your name: ");
                    String name = sc.next();
                    System.out.println("Enter your marks: ");
                    for (int i = 0; i < marks.length; i++) {
                        System.out.println("Enter marks for subject " + (i + 1) + ": ");
                        marks[i] = sc.nextInt();
                    }
                    int average = 0;
                    Student s = new Student(id, name, marks, average);
                    students.add(s);
                    break;
                case 2:

                    System.out.print("Enter your ID: ");
                    int ID = sc.nextInt();
                    boolean found = false;
                    for (Student student : students) {
                        if (ID == student.id) {
                            int result = avg.Avg(student.marks);
                            System.out.println("Your average is " + result);
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println("Your ID was not found ");
                    }
                    break;
                case 3:
                   if (students.isEmpty()){
                       System.out.println("No Student has entered ");
                   }
                    for (Student student : students) {
                        System.out.println("ID : " + student.id + "/n" + "Name : " + student.name);
                    }
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

        }
    }
}