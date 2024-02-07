/**
 * Author:- Nardos Lemma
 * CMSC 215
 * 02| 06| 24
 * This is my Student class that has the attributes of all students
 */

public class Student {
    private String studentName;
    private int creditHour;
    private int qualityPoints;
    private static double treshold;

    public Student(String studentName, int creditHour, int qualityPoints) {
        this.studentName = studentName;
        this.creditHour = creditHour;
        this.qualityPoints =qualityPoints;
    }
//this method gets the gpa of all students
public double gradePointAverage() {
    return (double) qualityPoints / creditHour;
}
// this method shows if the students are eligible or not
    public boolean eligibleForHonorSociety() {
        return gradePointAverage() > treshold;
    }
//changes to a string
    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", gradePointAverage =" + gradePointAverage();
    }
//sets the value of the threshold
    public static void setGpaThreshold(double averageGpa) {
        treshold = (averageGpa + 4.0) / 2;
    }
    public static double getTreshold() {
        return treshold;
    }
//to access the name of the students who are eligible
    public String getStudentName() {
        return studentName;
    }
}
