package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverController {
    @RequestMapping("/home")
    public String home(){
        return "conver";
    }
    @PostMapping ("/convers")
    public String conver(@RequestParam("usd") float usd , Model model){
        model.addAttribute("vnd",usd*23000);
        return "conver";
    }
}
