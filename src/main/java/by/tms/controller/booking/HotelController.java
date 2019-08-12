package by.tms.controller.booking;

import by.tms.entity.Hotel;
import by.tms.entity.Room;
import by.tms.service.HotelService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/hotels")
public class HotelController {
    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping
    public ModelAndView hotels(ModelAndView modelAndView){
        modelAndView.addObject("hotels", hotelService.getAllHotels());
        modelAndView.addObject("rooms", hotelService.getAllRooms());
        modelAndView.setViewName("booking/hotels");
        return modelAndView;
    }

    @GetMapping(path="/newH")
    public ModelAndView newHotel(ModelAndView modelAndView){
        modelAndView.setViewName("booking/newHotel");
        modelAndView.addObject("newhotel",new Hotel());
        return modelAndView;
    }
    @PostMapping(path="/addhotel")
    public ModelAndView newHotel(@ModelAttribute("newhotel") Hotel hotel,ModelAndView modelAndView){
        hotelService.addHotel(hotel);
        modelAndView.setViewName("redirect:/hotels");
        return modelAndView;
    }


}
