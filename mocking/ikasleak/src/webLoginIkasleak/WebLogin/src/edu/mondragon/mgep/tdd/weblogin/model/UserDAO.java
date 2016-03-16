package edu.mondragon.mgep.tdd.weblogin.model;

public interface UserDAO {
	 /**
     * Loads a User object for the record that
     * is returned with the same userName and password.
     * 
     * @parameter userName
     * @parameter password
     * @return    User
     */
     User loadByUsernameAndPassword(String userName, String password);
}
