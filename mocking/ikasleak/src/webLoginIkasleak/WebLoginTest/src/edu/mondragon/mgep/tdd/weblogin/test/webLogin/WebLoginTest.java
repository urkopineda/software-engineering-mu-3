package edu.mondragon.mgep.tdd.weblogin.test.webLogin;

import static org.junit.Assert.fail;
import static net.sourceforge.jwebunit.junit.JWebUnit.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WebLoginTest {

	@Before
	public void setUp() throws Exception {
		 setBaseUrl("http://localhost:8080/WebLogin");
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void testLoginOK() {
		 beginAt("/index.jsp");
		 assertTitleEquals("Login Page");
	     setTextField("username", "Rosy");
	     setTextField("password", "p@ssw0rd");
	     submit();
	     assertTitleEquals("User Logged Successfully");
	}
	
	

}