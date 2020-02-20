package dong.example.ams;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){

        model.addAttribute("username","董学强");
        model.addAttribute("password","20200216");
        return "hello01";

    }
}
