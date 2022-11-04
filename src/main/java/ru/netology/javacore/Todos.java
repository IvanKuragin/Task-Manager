package ru.netology.javacore;

import java.util.*;
import java.util.stream.Collectors;

public class Todos {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        if (tasks.size() < 7) {
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
        List<String> outTasks = tasks.stream()
                .sorted()
                .collect(Collectors.toList());
        return Arrays.toString(outTasks.toArray());
    }
}
