package by.tms.controller.booking;

import by.tms.entity.CurUser;
import by.tms.entity.Reservation;
import by.tms.service.HotelService;
import by.tms.service.ReservationService;
import by.tms.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(path = "/reservation")
public class ReservationController {
    private final ReservationService reservationService;
    private  final UserService userService;
    private final HotelService hotelService;

    public ReservationController(ReservationService reservationService, UserService userService, HotelService hotelService) {
        this.reservationService = reservationService;
        this.userService = userService;
        this.hotelService = hotelService;
    }

    @GetMapping
    public ModelAndView addReservation(ModelAndView modelAndView) {
        modelAndView.addObject("newreservation", new Reservation());
        modelAndView.addObject("hotels", hotelService.getAllHotels());
        modelAndView.setViewName("booking/reservation");
        return modelAndView;
    }

    @PostMapping(path = "/new")
    public ModelAndView addReservation(@ModelAttribute("newreservation") Reservation reservation, ModelAndView modelAndView, HttpServletRequest request){
        CurUser curUser= (CurUser) request.getSession().getAttribute("currentUser");
        modelAndView.addObject("user",userService.getUser(curUser));
        reservationService.addReser(userService.getUser(curUser),reservation);
        modelAndView.setViewName("redirect:/hotels");
        return modelAndView;
    }

}
