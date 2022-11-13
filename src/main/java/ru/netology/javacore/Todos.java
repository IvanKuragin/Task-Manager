package ru.netology.javacore;

import java.util.*;
import java.util.stream.Collectors;

public class Todos {

    private final int LIST_SIZE = 7;
    private Set<String> tasks = new TreeSet<>();

    public void addTask(String task) {
        if (tasks.size() < LIST_SIZE) {
            tasks.add(task);
        } else {
            tasks.add(task);
            tasks.remove(task);
        }
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public String getAllTasks() {
        return tasks.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" "));
    }
}
