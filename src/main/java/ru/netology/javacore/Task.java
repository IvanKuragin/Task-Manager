package ru.netology.javacore;

public class Task {

    private String type;
    private String task;

    public Task(String operation, String task) {
        this.type = operation;
        this.task = task;
    }
    public String getType() {
        return type;
    }
    public String getTask() {
        return task;
    }

    @Override
    public String toString() {
        return "fuck" + task;
    }
}
