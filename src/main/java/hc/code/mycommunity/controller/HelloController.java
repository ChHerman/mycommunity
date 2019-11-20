package hc.code.mycommunity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello (@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name", name);
<<<<<<< HEAD
        return "index";
=======
        return "hello";
>>>>>>> df3bd72d2205aa5f12a1f2ea78bd5aae932a2bbd
    }
}
