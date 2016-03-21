package edu.mondragon.mgep.tdd.weblogin.test;

import edu.mondragon.mgep.tdd.weblogin.model.LoginServiceFacade;
import edu.mondragon.mgep.tdd.weblogin.model.UserDAO;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by urko on 21/03/16.
 */
public class LoginMock {

    LoginServiceFacade service = new LoginServiceFacade();
    UserDAO dao = EasyMock.createMock(UserDAO.class);

    @Before
    public void preInit() {
        service.setUserDAO(dao);
    }

    @Test
    public void initCorrectLogin() {

    }

    @Test
    public void initFailedLogin() {

    }

}
