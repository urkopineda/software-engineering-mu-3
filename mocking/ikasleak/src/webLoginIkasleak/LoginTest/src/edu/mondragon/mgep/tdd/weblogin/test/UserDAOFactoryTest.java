package edu.mondragon.mgep.tdd.weblogin.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.mondragon.mgep.tdd.weblogin.model.LoginServiceFacade;
import edu.mondragon.mgep.tdd.weblogin.model.UserDAOFactory;

public class UserDAOFactoryTest {

	@Test
	public void test() {
		String userName = "Rosy";
        String password = "p@ssw0rd";
        //String passwordHash =  "5�@�ڙO�U3��E";
		LoginServiceFacade loginService = new LoginServiceFacade();
		loginService.setUserDAO( UserDAOFactory.getUserDAO() );
		loginService.login(userName, password);
	}

}
