package New.API.Apidemo

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ReqsponseBody
import org.springframework.web.bind.annotation.RequestParam

@Controller
class Controller
{
    @Autowired
    var service : Service = Service()
    @RequestMapping(_value "/")

    fun home(@RequestParam name: String, model : Model) : String
    {
        var user : String = ""

        model.addAttribute(attributeName: "user", user)
        return "home"
    }
}