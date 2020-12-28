package Now.Serenity.scam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

//    @RequestMapping(value = "/list")
//    public ResponseBody
}