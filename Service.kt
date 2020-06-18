package New.API.Apidemo

import org.springframework.stereotype.Component


@Component
class Service
{
    fun findUser(name: String) : String
    {
        var user : String = ""
        if (name = 1)
            user = "abc"
        else if (name = 2)
            user = "xyz"
        else
            user = "pqr"

        return user
        
    }
}