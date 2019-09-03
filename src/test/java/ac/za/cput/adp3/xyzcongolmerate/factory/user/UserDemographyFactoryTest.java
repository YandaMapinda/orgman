package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    @Test
    public void buildUserDemography() {
        UserDemography userDemography = UserDemographyFactory.buildUserDemography("@gmail.com","Z.M","F","B",new Date(31/8/95));
        System.out.println(userDemography.toString());
        assertEquals("Z.M",userDemography.getUserTitle());
        Assert.assertNotNull(userDemography);
    }
}