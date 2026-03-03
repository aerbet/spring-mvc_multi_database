package kg.zhaparov.bookingservice.controller.mvc;

import kg.zhaparov.bookingservice.service.BookingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private final BookingService bookingService;

    public MainController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    public String getIndex() {
        return "index";
    }
}
