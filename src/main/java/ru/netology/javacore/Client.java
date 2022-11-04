package ru.netology.javacore;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    private static final String host = "127.0.0.1";
    private static final int port = 8989;

    public static void main(String[] args) throws IOException, InterruptedException {

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson json = gsonBuilder.create();
            String output = json.toJson(new Task("ADD", "Home task"));
            System.out.println(output);
            out.println(output);
            String input = in.readLine();
            System.out.println(input);
        }
        Thread.sleep(2000);

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson json = gsonBuilder.create();
            String output = json.toJson(new Task("ADD", "Delivery"));
            System.out.println(output);
            out.println(output);
            String input = in.readLine();
            System.out.println(input);
        }
        Thread.sleep(2000);

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson json = gsonBuilder.create();
            String output = json.toJson(new Task("ADD", "Cooking"));
            System.out.println(output);
            out.println(output);
            String input = in.readLine();
            System.out.println(input);
        }
        Thread.sleep(2000);

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson json = gsonBuilder.create();
            String output = json.toJson(new Task("ADD", "Cleaning"));
            System.out.println(output);
            out.println(output);
            String input = in.readLine();
            System.out.println(input);
        }
        Thread.sleep(2000);

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson json = gsonBuilder.create();
            String output = json.toJson(new Task("ADD", "Walking out the dog"));
            System.out.println(output);
            out.println(output);
            String input = in.readLine();
            System.out.println(input);
        }
        Thread.sleep(2000);

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson json = gsonBuilder.create();
            String output = json.toJson(new Task("ADD", "Shopping"));
            System.out.println(output);
            out.println(output);
            String input = in.readLine();
            System.out.println(input);
        }
        Thread.sleep(2000);

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson json = gsonBuilder.create();
            String output = json.toJson(new Task("ADD", "Gym"));
            System.out.println(output);
            out.println(output);
            String input = in.readLine();
            System.out.println(input);
        }
        Thread.sleep(2000);

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson json = gsonBuilder.create();
            String output = json.toJson(new Task("ADD", "Reading"));
            System.out.println(output);
            out.println(output);
            String input = in.readLine();
            System.out.println(input);
        }
        Thread.sleep(2000);

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson json = gsonBuilder.create();
            String output = json.toJson(new Task("REMOVE", "Delivery"));
            System.out.println(output);
            out.println(output);
            String input = in.readLine();
            System.out.println(input);
        }
        Thread.sleep(2000);

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson json = gsonBuilder.create();
            String output = json.toJson(new Task("ADD", "Reading"));
            System.out.println(output);
            out.println(output);
            String input = in.readLine();
            System.out.println(input);
        }
        Thread.sleep(2000);
    }
}
