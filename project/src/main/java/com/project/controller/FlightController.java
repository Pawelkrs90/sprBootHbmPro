
package com.project.controller;

import com.project.model.Flight;
import com.project.service.FlightDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Flight")
public class FlightController {
    
    @Autowired
    private FlightDaoService flightDaoService;
    
    @GetMapping("getById/{id}")
    public ResponseEntity<Flight> getArticleById(@PathVariable("id") Integer id) {
	
        Flight flight = flightDaoService.getById(new Long(id));
	return new ResponseEntity<Flight>(flight, HttpStatus.OK);
    }
    
    
}
