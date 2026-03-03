package kg.zhaparov.bookingservice.controller.mvc;

import jakarta.validation.Valid;
import kg.zhaparov.bookingservice.payload.Booking;
import kg.zhaparov.bookingservice.service.BookingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    private static final Logger log = LoggerFactory.getLogger(MainController.class);
    private final BookingService service;

    public MainController(BookingService service) {
        this.service = service;
    }

    @GetMapping
    public String index(Booking booking) {
        return "index";
    }

    @PostMapping
    public String processBooking(
            @ModelAttribute @Valid Booking booking,
            BindingResult bindingResult
    ) {
        if(bindingResult.hasErrors()) {
            return "index";
        }
        log.info("booking={}", booking);
        log.info("binding={}", bindingResult);
        service.save(booking);
        return "answer";
    }
}
