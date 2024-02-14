package com.example.policynaveen.entity;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int policynumber;
    private String holdername;
    private String address1;
    private String address2;
    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(
            name = "Policy_Coverage",
            joinColumns = @JoinColumn(name = "Policy_id"),
            inverseJoinColumns = @JoinColumn(name = "Coverage_id")
    )
    private List<Coverage> coverages = new ArrayList<>();

    public List<Coverage> getCoverages() {
        return coverages;
    }

    public void setCoverages(List<Coverage> coverages) {
        this.coverages = coverages;
    }

    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private State state;

    public void setState(State state) {
        this.state = state;
    }


    public Policy() {
    }

    public Policy(int policynumber, String holdername, String address1, String address2) {
        this.policynumber = policynumber;
        this.holdername = holdername;
        this.address1 = address1;
        this.address2 = address2;
    }

    public int getPolicynumber() {
        return policynumber;
    }

    public void setPolicynumber(int policynumber) {
        this.policynumber = policynumber;
    }

    public String getHoldername() {
        return holdername;
    }

    public void setHoldername(String holdername) {
        this.holdername = holdername;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policynumber=" + policynumber +
                ", holdername='" + holdername + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                '}';
    }
}
