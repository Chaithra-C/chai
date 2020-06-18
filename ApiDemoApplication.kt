package New.API.Apidemo                                              //Package name

import org.springframework.boot.autoconfigure.SpringBootApplication  //Indicates a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning
import org.springframework.boot.runApplication			     //It is used to run the application

@SpringBootApplication						     //It is an annotation  used to mark a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning.
class ApiDemoApplication{					     //Creating a class

fun main(args: Array<String>) {					     //Declaring a function to print some output.

	println("Hello world")					     //printing the output
	runApplication<ApiDemoApplication>(*args)		     
}
}
