package me.jarad.bean;

import java.io.Serializable;

/**
 * Bean class for transfer data from login 
 * html page to servlet
 * 
 * @author vitaly
 * @version 0.0.1
 */
public class LoginDataBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String 	loginData;
	private String 	passwordData;
	private boolean sessionData; 
	
	LoginDataBean() {
		
	}
}
