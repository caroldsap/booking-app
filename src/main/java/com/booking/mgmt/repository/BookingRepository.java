package com.booking.mgmt.repository;

import com.booking.mgmt.model.Booking;
import com.booking.mgmt.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookingRepository extends CrudRepository<Booking, Long> {
    List<Booking> findBybookedBy(User user);
}
