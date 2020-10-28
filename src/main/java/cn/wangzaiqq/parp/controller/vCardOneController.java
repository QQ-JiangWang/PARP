package cn.wangzaiqq.parp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/parp/001")
public class vCardOneController {

    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("page","about");
        return "parp/001/about";
    }
    @GetMapping("/resume")
    public String resume(Model model){
        model.addAttribute("page","resume");
        return "parp/001/resume";
    }
    @GetMapping("/works")
    public String works(Model model){
        model.addAttribute("page","works");
        return "parp/001/works";
    }
    @GetMapping("/blog")
    public String blog(Model model){
        model.addAttribute("page","blog");
        return "parp/001/blog";
    }
    @GetMapping("/contact")
    public String contact(Model model){
        model.addAttribute("page","contact");
        return "parp/001/contact";
    }
}
