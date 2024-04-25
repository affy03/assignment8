package com.example.assessment;

public class Assessment {
    private final int id;
    private final String name;
    private final String posture;
    private final String goal;

    public Assessment(int id, String name, String posture, String goal) {
        this.id = id;
        this.name = name;
        this.posture = posture;
        this.goal = goal;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosture() {
        return posture;
    }

    public String getGoal() {
        return goal;
    }
}
