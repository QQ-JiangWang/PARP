package cn.wangzaiqq.parp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/parp")
public class LoginController {
    @GetMapping("/login")
    public String Login(){
        return "parp/login";
    }
}
