package ru.netology.javacore;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TodoServer {
    private Todos todos;
    private final int port;

    public TodoServer(int port, Todos todos) {
        this.todos = todos;
        this.port = port;
    }

    public void start() throws IOException {
        System.out.println("Starting server at " + port + "...");
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                try (
                        Socket socket = serverSocket.accept();
                        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        PrintWriter out = new PrintWriter(socket.getOutputStream())
                ) {
                    String input = in.readLine();
                    GsonBuilder builder = new GsonBuilder();
                    Gson gson = builder.create();
                    Task task = gson.fromJson(input, Task.class);
                    if (task.getType().equals("ADD")) {
                        todos.addTask(task.getTask());
                    } else if (task.getType().equals("REMOVE")) {
                        todos.removeTask(task.getTask());
                    }
                    out.println(todos.getAllTasks());
                }
            }
        }
    }
}
