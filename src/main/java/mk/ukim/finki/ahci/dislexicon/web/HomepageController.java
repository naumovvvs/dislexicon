package mk.ukim.finki.ahci.dislexicon.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
@RequestMapping(value = {"/", "/home"})
public class HomepageController {

    @GetMapping(value = {"/", "/home"})
    public String getHomePage(HttpServletRequest servletRequest, Model model){
        model.addAttribute("bodyContent", "home");
        model.addAttribute("headTitle", "Почетна");
        return "master-template";
    }

    @GetMapping("/learnAlphabet")
    public String getAlphabetPage(HttpServletRequest servletRequest, Model model) {
        model.addAttribute("bodyContent", "alphabet");
        model.addAttribute("headTitle", "Научи ја азбуката");
        return "master-template";
    }

    @GetMapping("/guessTheWord")
    public String getPictureWordPage(HttpServletRequest servletRequest, Model model) {
        model.addAttribute("bodyContent", "pictureWord");
        model.addAttribute("headTitle", "Слико-збор");
        return "master-template";
    }

    @GetMapping("/questions")
    public String getQuestionsPage(HttpServletRequest servletRequest, Model model) {
        model.addAttribute("bodyContent", "questions");
        model.addAttribute("headTitle", "Прашања");
        return "master-template";
    }

    @GetMapping("/riddles")
    public String getRiddlesPage(HttpServletRequest servletRequest, Model model) {
        model.addAttribute("bodyContent", "riddles");
        model.addAttribute("headTitle", "Загатки");
        return "master-template";
    }
    @GetMapping("/math")
    public String getMathPage(HttpServletRequest servletRequest, Model model) {
        model.addAttribute("bodyContent", "math");
        model.addAttribute("headTitle", "Броеви");
        return "master-template";
    }

    @GetMapping("/help")
    public String getHelpPage(HttpServletRequest servletRequest, Model model) {
        model.addAttribute("bodyContent", "help");
        model.addAttribute("headTitle", "Помош");
        return "master-template";
    }

}
