package com.example.policynaveen.dao;

import com.example.policynaveen.entity.Policy;

import java.util.List;

public interface Policydao {
    public Policy addpolicy(Policy policy);

    public List<Policy> getallpolicy();

    public Policy getpolicy(int id);

    public Policy updatepolicy(Policy policy);

    public Policy deletepolicy(int id);
}
