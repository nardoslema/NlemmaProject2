/**
 * Author:- Nardos Lemma
 * CMSC 215
 * 02| 06| 24
 *This is my Graduate class which is for graduate students and inherits from student class.
 */
public class Graduate extends Student {
    private String degreeSought;
    // constructor that takes in all attributes and special attribute of this class
    public Graduate(String studentName, int creditHour, int qualityPoints, String degreeSought) {
        super(studentName, creditHour, qualityPoints);
        this.degreeSought = degreeSought;
    }
    //checks eligibilty in addition to special attribute
    @Override
    public boolean eligibleForHonorSociety() {
        return  degreeSought.equals("masters")  && super.eligibleForHonorSociety();
    }
//changing to a string
    @Override
    public String toString() {
        return super.toString() +
                "degreeSought='" + degreeSought + '\'' +
                '}';
    }
}
