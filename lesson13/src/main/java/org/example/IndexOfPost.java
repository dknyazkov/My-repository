package org.example;

public enum IndexOfPost {
    WORKER(100),
    GENERALDIRECTOR(800),
    DEPARTMENTDIRECTOR(600),
    COMERCIALDIRECTOR(500),
    FINDIRECTOR(550),
    AUTOMATIZER(400),
    ROBOTICS(450),
    COMMUNICATION(500);

    int index;

    IndexOfPost(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
