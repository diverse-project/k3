package fr.inria.triskell.k3.gwt.client

import com.google.gwt.core.client.EntryPoint
import com.google.gwt.event.dom.client.ClickEvent
import com.google.gwt.event.dom.client.ClickHandler
import com.google.gwt.user.client.Window
import com.google.gwt.user.client.rpc.AsyncCallback
import com.google.gwt.user.client.ui.Button
import com.google.gwt.user.client.ui.RootPanel

//import static fr.inria.triskell.k3.gwt.client.GreetingServiceAsync.Util.*

public class TestXtend implements EntryPoint{
	
	
	
	
	
	override onModuleLoad() {
		var b = new Button();
		b.text = "hello"
		b.addClickHandler(new MyClickHandler())
		RootPanel.get().add(b)
		
	}
	
}

class MyClickHandler implements ClickHandler, AsyncCallback<String>{
	
	
	override onClick(ClickEvent arg0) {
		GetServices.greetingService.greetServer("hello world", this)
	}
	
	override onFailure(Throwable arg0) {
		Window.alert("error")
	}
	
	override onSuccess(String arg0) {
		Window.alert(arg0)
	}
	
}