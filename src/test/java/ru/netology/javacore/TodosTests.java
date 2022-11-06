package ru.netology.javacore;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodosTests {

    @Test
    @DisplayName("Collection update")
    public void addTask() {
        Todos todos = new Todos();
        List<String> list = new ArrayList<>();
        String data = "Shopping";
        list.add(data);
        todos.addTask(data);
        String result = Arrays.toString(list.toArray())
                .replace("[", "")
                .replace("]", "");
        Assertions.assertEquals(result, todos.getAllTasks());
    }
    @Test
    @DisplayName("Collection remove")
    public void removeTask() {
        Todos todos = new Todos();
        List<String> list = new ArrayList<>();
        String data = "Shopping";
        list.add(data);
        todos.addTask(data);
        list.remove(data);
        todos.removeTask(data);
        String result = Arrays.toString(list.toArray())
                .replace("[", "")
                .replace("]", "");
        Assertions.assertEquals(result, todos.getAllTasks());
    }

    @Test
    @DisplayName("Sorting test")
    public void getAllSortedTasks() {
        Todos todos = new Todos();
        todos.addTask("Shopping");
        todos.addTask("Cleaning");
        todos.addTask("Reading");
        String result = "Cleaning Reading Shopping";
        Assertions.assertEquals(result, todos.getAllTasks());
    }

    @Test
    @DisplayName("Not added if 8")
    public void getAllTasks() {
        Todos todos = new Todos();
        todos.addTask("1");
        todos.addTask("2");
        todos.addTask("3");
        todos.addTask("4");
        todos.addTask("5");
        todos.addTask("6");
        todos.addTask("7");
        todos.addTask("8");
        String dataResult = "1 2 3 4 5 6 7";
        Assertions.assertEquals(dataResult, todos.getAllTasks());
    }


}
