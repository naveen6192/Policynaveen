package com.example.policynaveen.dao;

import com.example.policynaveen.entity.State;

import java.util.List;


public interface Statedao {
    public State addstate(State state);

    public List<State> getallstate();

    public State getstate(int id);

    public State updatestate(State state);

    public State deletestate(int id);
}
