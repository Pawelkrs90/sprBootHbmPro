package com.project.dao.impl;

import com.project.dao.FlightDao;
import com.project.model.Flight;
import com.project.model.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class FlightDaoImpl implements FlightDao{

    @PersistenceContext	
    private EntityManager entityManager;	
    
    @Override
    public Flight getById(Long id){
        return entityManager.find(Flight.class, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Flight> getAll() {
        String hql = "FROM Flight as flight ORDER BY flight.id";
        return (List<Flight>) entityManager.createQuery(hql).getResultList();
    }
    
    @Override
    public void add(Flight flight){
        entityManager.persist(flight);
    }

    @Override
    public void update(Flight flightNew){
        //User user = getById(userNew.getId());
        ////
        //entityManager.flush();
    }
    
    @Override
    public void delete(Flight flight){
        entityManager.remove(flight);
    }
}   


