/**
 * Author:- Nardos Lemma
 * CMSC 215
 * 02| 06| 24
 *This is my Undergraduate class which is for Undergraduate students and inherits from student class.
 */
public class Undergraduate extends Student{
    private String year;
// constructor that takes in all attributes and special attribute of this class
    public Undergraduate(String studentName, int creditHour, int qualityPoints, String year) {
        super(studentName, creditHour, qualityPoints);
        this.year = year;
    }
//checks eligibilty in addition to special attribute
    @Override
    public boolean eligibleForHonorSociety() {
        return (year.equals("junior") || year.equals("senior")) && super.eligibleForHonorSociety();

    }

    @Override
    public String toString() {
        return super.toString() + "year =" + year;
    }
}
