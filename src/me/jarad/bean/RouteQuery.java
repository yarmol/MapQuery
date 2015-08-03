package me.jarad.bean;

import java.io.Serializable;

/**
 * Java beans class. 
 * Using as transferring query data from 
 * start login/data forms 
 * to servlet engine
 * 
 * @version 0.0.1
 * @author vitaly
 * @date 2015-08-01
 *
 */

public class RouteQuery implements Serializable {

	private String sourceDescription; 
	private String destinationDescription;
	
	
	private static final long serialVersionUID = 1L;
	
	public RouteQuery() {
		
	}

	/**
	 * @return the sourceDescription
	 */
	public String getSourceDescription() {
		return sourceDescription;
	}

	/**
	 * @param sourceDescription the sourceDescription to set
	 */
	public void setSourceDescription(String sourceDescription) {
		this.sourceDescription = sourceDescription;
	}

	/**
	 * @return the destinationDescription
	 */
	String getDestinationDescription() {
		return destinationDescription;
	}

	/**
	 * @param destinationDescription the destinationDescription to set
	 */
	void setDestinationDescription(String destinationDescription) {
		this.destinationDescription = destinationDescription;
	}
	

}
