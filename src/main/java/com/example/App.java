package com.example;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        port(8080); // Container listens on 8080
        get("/", (req, res) -> "Hello, Maven Build via Jenkins AND BY YOGESH!....");

        // Keep the server running indefinitely
        // SparkJava keeps the JVM alive, no need for manual while loop
    }
}
