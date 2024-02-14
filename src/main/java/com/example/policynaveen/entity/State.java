package com.example.policynaveen.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class State {
    @Id
    private int id;
    private String state;


    public State() {
    }

    public State(int id, String state) {
        this.id = id;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    @Override
    public String toString() {
        return "State{" +
                "id=" + id +
                ", state='" + state + '\'' +
                '}';
    }
}
