package fr.inria.triskell.k3.gwt.client;

import com.google.gwt.core.client.GWT;

public interface GetServices {

	
	  public  GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

} 
 