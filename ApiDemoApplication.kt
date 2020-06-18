package New.API.Apidemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApiDemoApplication{

fun main(args: Array<String>) {

	println("Hello world")
	runApplication<ApiDemoApplication>(*args)
}
}