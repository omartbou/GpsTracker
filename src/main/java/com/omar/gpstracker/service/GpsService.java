package com.omar.gpstracker.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.omar.gpstracker.model.GpsCoordinate;
import com.omar.gpstracker.repository.GpsCoordinateRepository;

@Service
public class GpsService {

    private GpsCoordinateRepository gpsCoordinateRepository;

    public List<GpsCoordinate> getAllCoordinates() {
        return gpsCoordinateRepository.findAll();
    }
}
