package com.acode.security.Contoller;

import com.acode.security.Locations;
import com.acode.security.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Locations")
public class LocationController {

    @Autowired
    LocationService locationService;

    @GetMapping("allLocations")
    public List<Locations> getAllLocations() {
        return locationService.getAllLocations();
    }
}
