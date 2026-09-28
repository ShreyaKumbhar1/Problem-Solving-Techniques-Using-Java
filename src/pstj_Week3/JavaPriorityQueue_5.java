package pstj_Week3;

import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    int getID() {
        return id;
    }

    String getName() {
        return name;
    }

    double getCGPA() {
        return cgpa;
    }
}

public class JavaPriorityQueue_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Student> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.getCGPA() != b.getCGPA()) {
                    return Double.compare(b.getCGPA(), a.getCGPA());
                }
                if (!a.getName().equals(b.getName())) {
                    return a.getName().compareTo(b.getName());
                }
                return a.getID() - b.getID();
            });

        for (int i = 0; i < n; i++) {
            String event = sc.next();

            if (event.equals("ENTER")) {
                String name = sc.next();
                double cgpa = sc.nextDouble();
                int id = sc.nextInt();

                pq.add(new Student(id, name, cgpa));
            } else {
                if (!pq.isEmpty()) {
                    pq.poll();
                }
            }
        }

        if (pq.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            while (!pq.isEmpty()) {
                System.out.println(pq.poll().getName());
            }
        }

        sc.close();
    }
}