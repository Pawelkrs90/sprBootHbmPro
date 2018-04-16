package com.project.dao.impl;

import com.project.dao.UserDao;
import com.project.model.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{

    @PersistenceContext	
    private EntityManager entityManager;	
    
    @Override
    public User getById(Long id) {
        return entityManager.find(User.class, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getAll() {
        String hql = "FROM User as usr ORDER BY usr.id";
        return (List<User>) entityManager.createQuery(hql).getResultList();
    }
    
    @Override
    public void add(User user){
        entityManager.persist(user);
    }

    public void update(User userNew){
        //User user = getById(userNew.getId());
        ////
        //entityManager.flush();
    }
    
    public void delete(User user){
        entityManager.remove(user);
    }
}   


