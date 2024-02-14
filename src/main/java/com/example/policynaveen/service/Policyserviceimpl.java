package com.example.policynaveen.service;

import com.example.policynaveen.dao.Coveragedao;
import com.example.policynaveen.dao.Policydao;
import com.example.policynaveen.dao.Statedao;
import com.example.policynaveen.entity.Coverage;
import com.example.policynaveen.entity.Policy;
import com.example.policynaveen.entity.State;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Policyserviceimpl implements Policyservice {
    @Autowired
    private Policydao policydao;
    @Autowired
    private Statedao statedao;
    @Autowired
    private Coveragedao coveragedao;

    @Transactional
    @Override
    public Policy addpolicy(Policy policy) {
        return policydao.addpolicy(policy);
    }

    @Transactional
    @Override
    public List<Policy> getallpolicy() {
        return policydao.getallpolicy();
    }

    @Transactional
    @Override
    public Policy getpolicy(int id) {
        return policydao.getpolicy(id);
    }

    @Transactional
    @Override
    public Policy updatepolicy(Policy policy) {
        return policydao.updatepolicy(policy);
    }

    @Transactional
    @Override
    public Policy deletepolicy(int id) {
        return policydao.deletepolicy(id);
    }

    @Transactional
    @Override
    public State addstate(State state) {
        return statedao.addstate(state);
    }

    @Transactional
    @Override
    public List<State> getallstate() {
        return statedao.getallstate();
    }

    @Transactional
    @Override
    public State getstate(int id) {
        return statedao.getstate(id);
    }

    @Transactional
    @Override
    public State updatestate(State state) {
        return statedao.updatestate(state);
    }

    @Transactional
    @Override
    public State deletestate(int id) {
        return statedao.deletestate(id);
    }

    @Transactional
    @Override
    public Coverage addcoverage(Coverage coverage) {
        return coveragedao.addcoverage(coverage);
    }

    @Transactional
    @Override
    public List<Coverage> getallcoverage() {
        return coveragedao.getallcoverage();
    }

    @Transactional
    @Override
    public Coverage getcoverage(int id) {
        return coveragedao.getcoverage(id);
    }

    @Transactional
    @Override
    public Coverage updatecoverage(Coverage coverage) {
        return coveragedao.updatecoverage(coverage);
    }

    @Transactional
    @Override
    public Coverage deletecoverage(int id) {
        return coveragedao.deletecoverage(id);
    }
}
