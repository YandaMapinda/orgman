package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {


    @Test
    public void buildUser() {
        User user= UserFactory.buildUser("@mail","Salomi","Mpazi");
        Assert.assertNotNull(user);
        assertEquals("@mail",user.getUserEmail());
        System.out.println( user.toString());
    }
}