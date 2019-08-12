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
@RequestMapping(path = "/room")
public class RoomController {
    private final HotelService hotelService;

    public RoomController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

      @GetMapping(path="/newR")
    public ModelAndView newRoom(ModelAndView modelAndView){
        modelAndView.addObject("newroom",new Room());
          modelAndView.setViewName("booking/newRoom");
        return modelAndView;
    }
    @PostMapping(path="/addroom")
    public ModelAndView newRoom(@ModelAttribute("newroom") Room room, ModelAndView modelAndView){
        hotelService.addRoom(room);
        modelAndView.setViewName("redirect:/hotels");
        return modelAndView;
    }

}
