/**
 * Author:- Nardos Lemma
 * CMSC 215
 * 02| 06| 24
 * This is my Project2
 */

import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {

        //initializing my entities to 0 for starter
        double averageGpa;
        int numberOfStudents = 0;
        double totGpa = 0.0;

        String filePath = "students.txt";
        //arraylist to store all the students that are read from the file
        ArrayList<Student> students = new ArrayList<>();
        //file reader
        File file = new File(filePath);
        //checking to see if the file was found or throwing an exception
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Student student;
        //while loop to read in the students name while the file can be read
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] studentInfo = line.split(" ");
        // storing the string to an array
            String name = studentInfo[0];
            int creditHours = Integer.parseInt(studentInfo[1]);
            int qualityPoints = Integer.parseInt(studentInfo[2]);
            String status = studentInfo[3];

        // checking if the condition of the student is graduate or undergraduate
            if (status.equalsIgnoreCase("Junior") || status.equalsIgnoreCase("Senior")) {
                student = new Undergraduate(name, creditHours,  qualityPoints, status);
            } else
                student = new Graduate(name, creditHours, qualityPoints, status);
            students.add(student);
            totGpa = totGpa + student.gradePointAverage();
            numberOfStudents++;
        }
        scanner.close();

        // calcualting the average gpa
        averageGpa = totGpa / numberOfStudents;
        Student.setGpaThreshold(averageGpa);
        System.out.println("Treshold:- " + Student.getTreshold());

        //printing out the students who are elligable
        System.out.println("These students are eligible for membership:-");
        for (int i = 0; i < students.size(); i++) {
            Student student1 = students.get(i);
            if (student1.eligibleForHonorSociety()) {
                System.out.println(student1.getStudentName());
            }
        }
    }


}






