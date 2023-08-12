package org.example.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Activities {

    public String name;
    public String status = "created";
    public UUID id;
    boolean isComplete = false;


    public Activities(String name) {
        id = UUID.randomUUID();
        this.name = name;


    }

    public String getName() {
        return name;
    }


    public UUID getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    @Override
    public String toString() {
        return name;
    }
}
