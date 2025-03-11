package com.omar.gpstracker.controller;

import com.omar.gpstracker.model.GpsCoordinate;
import com.omar.gpstracker.repository.GpsCoordinateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class GpsCoordinateController {

    @Autowired
    private GpsCoordinateRepository gpsCoordinateRepository;

    @GetMapping("/gpscoordinates")
    public List<GpsCoordinate> getGpsCoordinates() {
        return gpsCoordinateRepository.findAll();
    }
}