package by.tms.controller.account;

import by.tms.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(path = "/adminpage")
public class AdminAccountController {

    private final UserService userService;

    public AdminAccountController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public ModelAndView admin(ModelAndView modelAndView, HttpServletRequest request){
      modelAndView.addObject("admin",userService.getUser(0));
        modelAndView.addObject("allUsers",userService.getAll());
        modelAndView.setViewName("account/adminpage");
        return modelAndView;
    }

}

