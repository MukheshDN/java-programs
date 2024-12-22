package cie;

public class Student {
    public String usn;
    public String name;
    public int sem;

    public Student(String usn, String name, int sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }
}

package cie;

public class Internals {
    public int[] internalMarks = new int[5];

    public Internals(int[] marks) {
        System.arraycopy(marks, 0, internalMarks, 0, 5);
    }
}

package see;
import cie.Student;

public class External extends Student {
    public int[] seeMarks = new int[5];

    public External(String usn, String name, int sem, int[] marks) {
        super(usn, name, sem);
        System.arraycopy(marks, 0, seeMarks, 0, 5);
    }
}
package final1; 
import cie.*;
import see.*;
import java.util.Scanner;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        Internals[] internals = new Internals[n];
        External[] externals = new External[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter USN for student " + (i + 1) + ": ");
            String usn = sc.next();
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = sc.next();
            System.out.print("Enter semester for student " + (i + 1) + ": ");
            int sem = sc.nextInt();

            int[] internalMarks = new int[5];
            System.out.println("Enter 5 internal marks for student " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                internalMarks[j] = sc.nextInt();
            }

            int[] seeMarks = new int[5];
            System.out.println("Enter 5 SEE marks for student " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                seeMarks[j] = sc.nextInt();
            }

            students[i] = new Student(usn, name, sem);
            internals[i] = new Internals(internalMarks);
            externals[i] = new External(usn, name, sem, seeMarks);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Final Marks for " + students[i].name + " (" + students[i].usn + "): ");
            for (int j = 0; j < 5; j++) {
                int finalMark = (internals[i].internalMarks[j] + (externals[i].seeMarks[j] / 2));
                System.out.println("Course " + (j + 1) + ": " + finalMark);
            }
        }

        sc.close();
    }
}

