package sam.springwork.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/*
 * Sam - Created a controllers package added the MyController class.
 * Made the MyController class a Controller
 */

@Controller
public class MyController {

	public String sayHello() {
		System.out.println("Hello World!!!");
		return "Hi Folks";
	}
}
