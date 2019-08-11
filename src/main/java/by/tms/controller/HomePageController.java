package by.tms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/homepage")
public class HomePageController {

 /* private final UserRepositoryImpl userRepository;

  @Autowired
  public HomePageController(UserRepositoryImpl userRepository) {
    this.userRepository = userRepository;
  }*/

  @GetMapping
  public ModelAndView homepage(ModelAndView modelAndView) {
    modelAndView.setViewName("homepage");
    return modelAndView;
  }

  /*@GetMapping(path = "user/{id}")
  public ModelAndView getUserById(@PathVariable("id") Integer id, ModelAndView modelAndView){
    modelAndView.setViewName("index");
    User user = userRepository.findUserById(id);
    modelAndView.addObject("user", user);
    return modelAndView;
  }*/

}
