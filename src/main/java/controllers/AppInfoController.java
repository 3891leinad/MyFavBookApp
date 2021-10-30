package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppInfoController {

    @GetMapping("/")
    public String getInfo() {
        return "index.html";
    }
}
