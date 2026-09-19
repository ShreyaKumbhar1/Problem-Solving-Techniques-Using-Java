package pstj_Week1;

import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class JavaSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            students.add(new Student(id, name, cgpa));
        }

        Collections.sort(students, new Comparator<Student>() {

            public int compare(Student s1, Student s2) {

                if (s1.cgpa != s2.cgpa) {
                    return Double.compare(s2.cgpa, s1.cgpa);
                }

                if (!s1.name.equals(s2.name)) {
                    return s1.name.compareTo(s2.name);
                }

                return s1.id - s2.id;
            }
        });

        for (Student s : students) {
            System.out.println(s.name);
        }

        sc.close();
    }
}