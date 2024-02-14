package com.example.policynaveen.dao;

import com.example.policynaveen.entity.Coverage;

import java.util.List;

public interface Coveragedao {
    public Coverage addcoverage(Coverage coverage);

    public List<Coverage> getallcoverage();

    public Coverage getcoverage(int id);

    public Coverage updatecoverage(Coverage coverage);

    public Coverage deletecoverage(int id);
}
