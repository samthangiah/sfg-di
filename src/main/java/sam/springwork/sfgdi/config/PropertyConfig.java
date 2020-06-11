package sam.springwork.sfgdi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import sam.springwork.sfgdi.examplebeans.FakeDataSource;
import sam.springwork.sfgdi.examplebeans.FakeJmsBroker;

@Configuration
//older multiple property source configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})  //look inside the properties files to resolve the string values

/*@PropertySources({
	@PropertySource("classpath:datasource.properties"),
	@PropertySource("classpath:jms.properties")
})
*/

public class PropertyConfig {
	
	/*@Autowired
	Environment env;
	*/
	
	@Value("${sam.username}") //sam.username is how it is declared in the datasource.properties
	String user;
	
	@Value("${sam.password}")
	String password;
	
	@Value("${sam.dburl}")
	String url;
	
	@Value("${sam.jms.username}") //sam.username is how it is declared in the datasource.properties
	String jmsUser;
	
	@Value("${sam.jms.password}")
	String jmsPassword;
	
	@Value("${sam.jms.dburl}")
	String jmsUrl;
	
	@Bean //Get instance of FakeDataSource class and load it with data from the properties file
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		//fakeDataSource.setUser(env.getProperty("SAM_USERNAME"));  //environment variables
		fakeDataSource.setUser(user);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		
		return fakeDataSource;
	}
	
	@Bean //Get instance of FakeDataSource class and load it with data from the properties file
	public FakeJmsBroker fakeJmsDataSource() {
		FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
		fakeJmsBroker.setUser(jmsUser);
		fakeJmsBroker.setPassword(jmsPassword);
		fakeJmsBroker.setUrl(jmsUrl);
		
		return fakeJmsBroker;
	}

	//Would not need this if Application.properties are used
	/*@Bean  //This will be reading the file
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceHolderConfigurer = new PropertySourcesPlaceholderConfigurer() ;
		
		return propertySourcesPlaceHolderConfigurer;
	}
	*/

}
