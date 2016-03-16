package edu.mondragon.mgep.tdd.weblogin.test;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.mondragon.mgep.tdd.weblogin.model.LoginServiceFacade;
import edu.mondragon.mgep.tdd.weblogin.model.User;
import edu.mondragon.mgep.tdd.weblogin.model.UserDAO;

public class LoginServiceTest {

	private LoginServiceFacade service;
    private UserDAO mockDao;
    
	@Before
	public void setUp() throws Exception {
		  service = new LoginServiceFacade();
          mockDao = EasyMock.createStrictMock(UserDAO.class);
          service.setUserDAO(mockDao);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	/**
     * This method will test the "rosy" scenario of passing a valid
     * username and password and retrieveing the user.  Once the user
     * is returned to the service, the service will return true to
     * the caller.
     */
     public void testRosyScenario() {
		 User results = new User();
         String userName = "Rosy";
         String password = "p@ssw0rd";
         String passwordHash =  "5—@½Ú™O‹U3†ØE";//"qwerty";
         EasyMock.expect(mockDao.loadByUsernameAndPassword(EasyMock.eq(userName), EasyMock.eq(passwordHash)))
               .andReturn(results);

         EasyMock.replay(mockDao);
         Assert.assertTrue(service.login(userName, password));
         EasyMock.verify(mockDao);
     }
 }
