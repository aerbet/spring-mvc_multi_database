package kg.zhaparov.bookingservice.mapper;

import kg.zhaparov.bookingservice.entity.BookingEntity;
import kg.zhaparov.bookingservice.payload.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {
    BookingEntity mapToEntity(Booking booking);
}
