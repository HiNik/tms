package by.tms.controller.account;

import by.tms.entity.CurUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(path = "/logout")
public class LogOutController {
    @GetMapping
    public ModelAndView logOut(@ModelAttribute("cUser") CurUser CurUser, ModelAndView modelAndView, HttpServletRequest request){
        request.getSession().setAttribute("currentUser",null);
        request.getSession().setAttribute("cAdmin",null);
        modelAndView.setViewName("redirect:/homepage");
        return modelAndView;
    }
}
