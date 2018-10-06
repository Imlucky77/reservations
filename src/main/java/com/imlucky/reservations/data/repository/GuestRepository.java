package com.imlucky.reservations.data.repository;

import com.imlucky.reservations.data.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {

    @Override
    Guest getOne(Long id);
}
