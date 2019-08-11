package by.tms.controller.account;

import by.tms.entity.CurUser;
import by.tms.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping(path = "/signIn")
//@SessionAttributes("userSession")
public class SignInController {

  private final UserService userService;

  public SignInController( UserService userService) {
    this.userService = userService;
  }


  @GetMapping
  public ModelAndView log(ModelAndView modelAndView) {
    modelAndView.setViewName("account/signIn");
    modelAndView.addObject("cUser", new CurUser());
    return modelAndView;
  }

  @PostMapping
  public ModelAndView log(@ModelAttribute("cUser") CurUser CurUser, BindingResult bindingResult,
                          ModelAndView modelAndView, HttpServletRequest request) {
      if(userService.sigIn(CurUser)){
        request.getSession().setAttribute("currentUser",CurUser);
        modelAndView.setViewName("redirect:/homepage");
     // modelAndView.addObject("userSession",CurUser);
    }else modelAndView.setViewName("redirect:/signIn");
      return modelAndView;

  }
}
