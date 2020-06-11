package sam.springwork.sfgdi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import sam.springwork.sfgdi.examplebeans.FakeDataSource;

@Configuration
@PropertySource("classpath:datasource.properties")  //look inside the properties files to resolve the string values

public class PropertyConfig {
	
	@Autowired
	Environment env;
	
	@Value("${sam.username}") //sam.username is how it is declared in the datasource.properties
	String user;
	
	@Value("${sam.password}")
	String password;
	
	@Value("${sam.dburl}")
	String url;
	
	@Bean //Get instance of FakeDataSource class and load it with data from the properties file
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(env.getProperty("SAM_USERNAME"));  //environment variables
		//fakeDataSource.setUser(user);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		
		return fakeDataSource;
	}

	@Bean  //This will be reading the file
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceHolderConfigurer = new PropertySourcesPlaceholderConfigurer() ;
		
		return propertySourcesPlaceHolderConfigurer;
	}

}
