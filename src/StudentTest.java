/**
 * Author:- Nardos Lemma
 * CMSC 215
 * 02| 06| 24
 *This is my test class that tests my student class
 */
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Undergraduate graduate1 = new Undergraduate("Brown,William", 72,230, "junior");
    Graduate graduate2 = new Graduate("Johnson,Mary", 21,77,"Masters");
    Undergraduate graduate3 = new Undergraduate("height,john", 60,120, "junior");

    @Test
    public void gradePointAverage() {
        Assert.assertEquals(graduate1.gradePointAverage(),3.0, 0.0f);
        Assert.assertEquals(graduate3.gradePointAverage(),2.0, 0.0f);
    }

    @Test
    public void eligibleForHonorSociety() {
        graduate2.setGpaThreshold(3);
        Assert.assertEquals(graduate2.eligibleForHonorSociety(),false);
        Assert.assertEquals(graduate3.eligibleForHonorSociety(),false);
    }

    @Test
    public void getTreshold() {
        graduate2.setGpaThreshold(3);
        Assert.assertEquals(graduate1.getTreshold(),3.5, 0.0f);

    }

}