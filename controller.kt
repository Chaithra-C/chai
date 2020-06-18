package New.API.Apidemo                                                 //Creating the Package

import org.springframework.web.bind.annotation.RestController           //It is used to create a restfull controlles
import org.springframework.web.bind.annotation.RequestMapping           //It is used for mapping web requests onto methods in request-handling classes with flexible method signatures
import org.springframework.stereotype.Controller                        //It is  is used in which the central type is the Controller class. 
import org.springframework.web.bind.annotation.ResponseBody            //It is used to  indicates a method return value should be bound to the web response body
import org.springframework.web.bind.annotation.RequestParam            //It is a Spring annotation used to bind a web request parameter to a method parameter.

@Controller                                                            //It is an annotation for controller
class Controller                                                       //Creating a class
{
    @Autowired                                                         //Autowiring feature of spring framework enables you to inject the object dependency implicitly
    var service : Service = Service()                                  //Creating an object
    @RequestMapping(_value "/")

    fun home(@RequestParam name: String, model : Model) : String
    {
        var user : String = ""

        model.addAttribute(attributeName: "user", user)
        return "home"
    }
}
