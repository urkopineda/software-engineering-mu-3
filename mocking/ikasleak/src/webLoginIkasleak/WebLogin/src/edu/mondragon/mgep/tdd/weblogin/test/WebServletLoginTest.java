package edu.mondragon.mgep.tdd.weblogin.test;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by urko on 21/03/16.
 */
public class WebServletLoginTest {

    WebTester tester;

    @Before
    public void preInit() {
        tester = new WebTester();
        tester.setBaseUrl("http://localhost:8080");
    }

    @Test
    public void loginOK() {
        tester.beginAt("index.jsp");
        tester.setTextField("username", "urko");
        tester.setTextField("password", "pineda");
        tester.submit();
        tester.assertTitleNotEquals("ERROR");
    }

    @Test
    public void loginNotOK() {
        tester.beginAt("index.jsp");
        tester.setTextField("username", "pineda");
        tester.setTextField("password", "urko");
        tester.submit();
        tester.assertTitleEquals("ERROR");
    }

    @Test
    public void passNotOK() {
        tester.beginAt("index.jsp");
        tester.setTextField("username", "urko");
        tester.setTextField("password", "urko");
        tester.submit();
        tester.assertTitleEquals("ERROR");
    }

    @Test
    public void allNotOK() {
        tester.beginAt("index.jsp");
        tester.setTextField("username", "pineda");
        tester.setTextField("password", "urko");
        tester.submit();
        tester.assertTitleEquals("ERROR");
    }

}
