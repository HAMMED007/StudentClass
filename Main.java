package oop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int count1 = 0;
        int count2 = 0;
        int[] admission_year_array = new int[6];

        //Create 6 student objects in main method.

        Student student1 = new Student("Jacob", "Software", "Estonia", "Tallinn", 100, 2020, 111001, 1234567);
        Student student2 = new Student("Hannah", "Software", "Egypt", "Cairo", 101, 2022, 111002, 1234568);
        Student student3 = new Student("Hammed", "Software", "Nigeria", "Lagos", 103, 2013, 111003, 1234569);
        Student student4 = new Student("Samuel", "Business", "England", "Manchester", 104, 2015, 111004, 1234570);
        Student student5 = new Student("Alex", "Business", "Latvia", "Riga", 105, 2019, 111005, 1234571);
        Student student6 = new Student("Esther", "Business", "Ghana", "Accra", 106, 2016, 111006, 1234572);

        // Create an array of students.
        Student[] students = {student1, student2, student3, student4, student5, student6};

        // Print all students' data in a format NAME ADMISSION_YEAR COUNTRY
        System.out.println(" ");
        for (int i = 0; i < students.length; i++) {

            System.out.println(students[i]);
            System.out.println(" ");
            // Calculate, how many students are from your country
            if (students[i].country.equals("Nigeria")) {
                count1++;

            }
            System.out.println("Number of student from Nigeria is: " + count1);

            //Calculate, how many students are NOT from Estonia.
            if (students[i].country != "Estonia") {
                count2++;
            }
            System.out.println("Number of student not from Estonia is: " + count2);

        }
        //  Find the student(s), who has the earliest admission year.

        for (int i = 0; i < students.length; i++) {
            // System.out.println(students[i].admission_year);
            admission_year_array[i] = students[i].admission_year;

        }
        Arrays.sort(admission_year_array);
        System.out.println(" ");
        System.out.println(admission_year_array[0] + " is the earliest admission year");

        //  Find the student(s), who has the latest admission year.

        System.out.println(admission_year_array[5] + " is the latest admission year");


        // Create 2 arrays group01 and group02
        //All students with an even admission year value - must be saved into the group01, all
        // the students with an odd value of admission year - must be saved in a group02.

        // Group1
        System.out.println("  ");
        System.out.println(" GROUP 1");
        for (int i = 0; i < students.length; i++){

            if (students[i].admission_year % 2 ==0) {
                System.out.println(students[i]);
            }
        }
        // Group2
        System.out.println("  ");
        System.out.println("  ");
        System.out.println(" GROUP 2");
        for (int i = 0; i < students.length; i++){

            if (students[i].admission_year % 2 !=0) {
                System.out.println(students[i]);
            }
        }

    }
}
