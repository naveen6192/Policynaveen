package com.example.policynaveen.service;

import com.example.policynaveen.entity.Coverage;
import com.example.policynaveen.entity.Policy;
import com.example.policynaveen.entity.State;

import java.util.List;


public interface Policyservice {
    public Policy addpolicy(Policy policy);

    public List<Policy> getallpolicy();

    public Policy getpolicy(int id);

    public Policy updatepolicy(Policy policy);

    public Policy deletepolicy(int id);

    public State addstate(State state);

    public List<State> getallstate();

    public State getstate(int id);

    public State updatestate(State state);

    public State deletestate(int id);

    public Coverage addcoverage(Coverage coverage);

    public List<Coverage> getallcoverage();

    public Coverage getcoverage(int id);

    public Coverage updatecoverage(Coverage coverage);

    public Coverage deletecoverage(int id);
}
