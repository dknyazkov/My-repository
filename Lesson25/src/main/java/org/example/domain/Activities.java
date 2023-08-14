package org.example.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Activities {

    public String name;
    public Status status = Status.created;
    public UUID id;


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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return name;
    }
}
