package mk.ukim.finki.ahci.dislexicon.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = {"/", "/home"})
public class HomepageController {

    @GetMapping(value = {"/", "/home"})
    public String getHomePage(HttpServletRequest servletRequest, Model model){
        return "master-template";
    }
}
