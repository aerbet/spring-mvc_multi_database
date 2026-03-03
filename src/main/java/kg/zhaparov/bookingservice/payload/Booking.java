package kg.zhaparov.bookingservice.payload;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record Booking (
        @NotNull
        @Size(min=2, max=30)
        String nameClient,
        @NotNull
        @Size(min = 2, max=13)
        String phoneNumberClient,
        @NotNull
        @Email
        String emailClient,
        @NotNull
        @Max(5)
        @Min(2)
        Integer numberOfPerson,
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        LocalDate dateOfBooking
) {
}
