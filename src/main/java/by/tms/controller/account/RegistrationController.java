package by.tms.controller.account;

import by.tms.entity.User;
import by.tms.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping(path = "/reg")
public class RegistrationController {

  //репозиторий
  private final UserService userService;

  public RegistrationController( UserService userService) {
    this.userService = userService;

  }


  @GetMapping
  public ModelAndView getForm(ModelAndView modelAndView) {
    modelAndView.setViewName("account/registration");
    modelAndView.addObject("newUser", new User());
    return modelAndView;
  }

  @PostMapping
  public ModelAndView setForm( @ModelAttribute("newUser") User user, BindingResult bindingResult,
                              ModelAndView modelAndView) {
    userService.regUser(user);
    modelAndView.setViewName("redirect:/homepage");
    return modelAndView;
  }
}
