package dong.example.ams;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/login000")
    public String hello(Model model){

        model.addAttribute("username","董学强");
        model.addAttribute("password","20200216");
        return "login";

    }




}
