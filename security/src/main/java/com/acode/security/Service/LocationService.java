package com.acode.security.Service;

import com.acode.security.Locations;
import com.acode.security.Dao.LocationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    LocationDao locationDao;

    public List<Locations> getAllLocations() {

        return locationDao.findAll();

    }
}
