package com.project.service;

import com.project.dao.*;
import com.project.model.Flight;
import com.project.model.User;
import java.util.List;

public interface FlightDaoService{
    
    Flight getById(Long id);
    List<Flight> getAll();
    void add(Flight flight);
    void update(Flight flihgtNew);
    void delete(Flight flight);
}