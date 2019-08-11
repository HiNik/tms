package by.tms.excontroller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.persistence.NoResultException;

@ControllerAdvice
public class ExController {

  @ExceptionHandler({NoResultException.class, })
  public String noResult(Model model, Exception e) {
    model.addAttribute("message", "Нет результата");
    return "index";
  }
}
