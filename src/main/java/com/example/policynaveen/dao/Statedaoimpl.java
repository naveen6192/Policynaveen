package com.example.policynaveen.dao;

import com.example.policynaveen.entity.State;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Statedaoimpl implements Statedao {
    @Autowired
    private EntityManager entityManager;

    @Override
    public State addstate(State state) {
        return entityManager.merge(state);
    }

    @Override
    public List<State> getallstate() {
        TypedQuery<State> typedQuery = entityManager.createQuery("from State", State.class);
        List<State> states = typedQuery.getResultList();
        return states;
    }

    @Override
    public State getstate(int id) {
        return entityManager.find(State.class, id);
    }

    @Override
    public State updatestate(State state) {
        return entityManager.merge(state);
    }

    @Override
    public State deletestate(int id) {
        State state = entityManager.find(State.class, id);
        entityManager.remove(state);
        return state;
    }
}
