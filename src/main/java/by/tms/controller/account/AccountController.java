package by.tms.controller.account;

import by.tms.entity.CurUser;
import by.tms.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(path = "account")
public class AccountController {

    public final UserService userService;

    public AccountController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ModelAndView account(ModelAndView modelAndView, HttpServletRequest request){
        CurUser curUser= (CurUser) request.getSession().getAttribute("currentUser");
        modelAndView.addObject("user",userService.getUser(curUser));
        modelAndView.setViewName("account/account");
        return modelAndView;
    }
}
