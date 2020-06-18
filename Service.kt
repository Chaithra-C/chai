package New.API.Apidemo                                         //Declaring package

import org.springframework.stereotype.Component                 // It is used to Annotations denoting the roles of types or methods in the overall architecture (at a conceptual, rather than implementation, level).


@Component                                                      //Component annotation to define a structure
class Service                                                   //Declaring a Class
{
    fun findUser(name: String) : String                         //Declaring a function of variable name.
    {
        var user : String = ""
        if (name = 1)
            user = "abc"
        else if (name = 2)
            user = "xyz"
        else
            user = "pqr"

        return user                                         //return the value
        
    }
}
