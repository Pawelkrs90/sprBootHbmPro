package com.project.service.impl;

import com.project.dao.FlightDao;
import com.project.dao.UserDao;
import com.project.model.User;
import com.project.service.FlightDaoService;
import com.project.service.UserDaoService;
import com.project.model.Flight;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightDaoServiceImpl implements FlightDaoService{

    @Autowired
    FlightDao flightDao;

    @Override
    public Flight getById(Long id){
        return flightDao.getById(id);
    }

    @Override
    public List<Flight> getAll() {
        return flightDao.getAll();
    }

    @Override
    public void add(Flight flight) {
        flightDao.add(flight);
    }

    @Override
    public void update(Flight flightNew) {
        flightDao.update(flightNew);
    }

    @Override
    public void delete(Flight flight) {
        flightDao.delete(flight);
    }
    
}


