package com.example.policynaveen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Coverage {
    @Id
    private int id;
    private String coveragename;
    @ManyToMany(mappedBy = "coverages")
    private List<Policy> policies;

    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    public Coverage() {
    }

    public Coverage(int id, String coveragename) {
        this.id = id;
        this.coveragename = coveragename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoveragename() {
        return coveragename;
    }

    public void setCoveragename(String coveragename) {
        this.coveragename = coveragename;
    }

    @Override
    public String toString() {
        return "Coverage{" +
                "id=" + id +
                ", coveragename='" + coveragename + '\'' +
                '}';
    }
}
