package sam.springwork.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import sam.springwork.sfgdi.controllers.PetController;
import sam.springwork.sfgdi.controllers.MyController;
import sam.springwork.sfgdi.controllers.I18nController;
import sam.springwork.sfgdi.controllers.PrimaryController;
import sam.springwork.sfgdi.controllers.PropertyInjectedControllerSpr;
import sam.springwork.sfgdi.controllers.SetterInjectedControllerSpr;
import sam.springwork.sfgdi.examplebeans.FakeDataSource;
import sam.springwork.sfgdi.examplebeans.FakeJmsBroker;
import sam.springwork.sfgdi.controllers.ConstructorInjectedControllerSpr;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		//Sam - Get a handle to the application context
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
	
		//Ask the context for a copy of my controller
		//Context just returns an object, so controller needs to be cast to MyController
		//Then ask for the bean, the name of the bean being s
		//By default when spring creates beans, it is going to be the name of the 
		//class name but beginning with a lowercase
		//Do not have to do new Controller() as the Spring object is doing that inside the context
		//MyController myController = (MyController) ctx.getBean(s: "myController");
		
		//MyController is an example of how to do an injection without Spring
		MyController myController = (MyController) ctx.getBean("myController");
		
		//Finds the FakeDataSource @Bean in the PropertyConfig.java file
		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println("FakeDataSource Username: "+fakeDataSource.getUser());
		
		//Finds the FakeDataSource @Bean in the PropertyConfig.java file
		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
		System.out.println("FakeJMSBroker Username: "+fakeJmsBroker.getUser());
		
		/*
		String greeting = myController.sayHello();
		System.out.println(greeting);
		

		//PrimaryController when there is more than one service that can be used
		System.out.println("______Primary Greeting Spring Controller_");
		PrimaryController primaryController = (PrimaryController) ctx.getBean("primaryController");
		String primaryGreeting = primaryController.getGreeting();
		System.out.println( primaryGreeting);
		
		
		//Injection with Spring - PropertyInjectedControllerSpr
		System.out.println("______Property Based Spring Controller_");
		PropertyInjectedControllerSpr propertyInjectedControllerSpr = 
				(PropertyInjectedControllerSpr) ctx.getBean("propertyInjectedControllerSpr");
		greeting = propertyInjectedControllerSpr.getGreeting();
		System.out.println(greeting);
		
		
		//Injection with Spring - SetterInjectedControllerSpr
		System.out.println("______Setter Based Spring Controller_");
		SetterInjectedControllerSpr setterInjectedControllerSpr = 
				(SetterInjectedControllerSpr) ctx.getBean("setterInjectedControllerSpr");
		greeting = setterInjectedControllerSpr.getGreeting();
		System.out.println(greeting);
		
		
		//Injection with Spring - ConstructorInjectedControllerSpr
		System.out.println("______Constuctor Based Spring Controller_");
		ConstructorInjectedControllerSpr constructorInjectedControllerSpr = 
				(ConstructorInjectedControllerSpr) ctx.getBean("constructorInjectedControllerSpr");
		greeting = constructorInjectedControllerSpr.getGreeting();
		System.out.println(greeting);
		
		
		//I18n - Uses Profile, Service and Qualifier
		System.out.println("______I18n Controller_");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		String i18nGreeting = i18nController.sayHello();
		System.out.println(i18nGreeting);
		
		//Pet Controller Assignment
		System.out.println("______Pet Controller Spring Controller_");
		System.out.println("The Best Pet is: ");
		PetController petController = (PetController) ctx.getBean("petController");
		String bestPet = petController.whichPetIsTheBest();
		System.out.println(bestPet);
		
		*/
		
	}

}
