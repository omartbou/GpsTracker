package com.omar.gpstracker.repository;

import com.omar.gpstracker.model.GpsCoordinate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GpsCoordinateRepository extends JpaRepository<GpsCoordinate, Long> {
    //
}