package com.project.dao;



import com.project.model.Flight;
import java.util.List;

public interface FlightDao{
    
    Flight getById(Long id);
    List<Flight> getAll();
    void add(Flight user);
    void update(Flight flightNew);
    void delete(Flight flight);
}