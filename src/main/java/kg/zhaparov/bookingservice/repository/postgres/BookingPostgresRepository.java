package kg.zhaparov.bookingservice.repository.postgres;

import kg.zhaparov.bookingservice.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingPostgresRepository extends JpaRepository<BookingEntity, Long> {
}
