package edu.mondragon.mgep.tdd.weblogin.test;

import edu.mondragon.mgep.tdd.weblogin.model.LoginServiceFacade;
import edu.mondragon.mgep.tdd.weblogin.model.UserDAO;
import edu.mondragon.mgep.tdd.weblogin.model.UserDAOXml;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * LoginTest
 *
 * This test always throws errors because UserDAOXml is null.
 *
 * @author urko
 */
public class LoginTest {

    UserDAO dao = new UserDAOXml();
    LoginServiceFacade service = new LoginServiceFacade();

    @Before
    public void preInit() {
        service.setUserDAO(dao);
    }

    @Test
    public void testCorrect() {
        boolean r = service.login("urko", "pineda");
        assertTrue("Log in with username and password correct.", r);
    }

    @Test
    public void testIncorrect() {
        boolean r = service.login("pineda", "urko");
        assertFalse("Log in with username and password correct.", r);
    }

}
