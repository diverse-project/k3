package fr.inria.triskell.k3.gwt.server

import com.google.gwt.user.server.rpc.RemoteServiceServlet
import fr.inria.triskell.k3.gwt.client.GreetingService

class GreetingServiceImpl extends RemoteServiceServlet implements
    GreetingService {

  public override def String greetServer(String input) {
    return input.toUpperCase();
	}	
}