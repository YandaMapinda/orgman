package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {


        @Test
        public void buildGender() {
            Gender gender = GenderFactory.buildGender("Female");
            System.out.println(gender.getGenderId());
            Assert.assertNotNull(gender.getGenderId());
            Assert.assertEquals("Female",gender.getGenderDescription());
        }


}