package com.example;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        port(9090); // Use 9090 to avoid Jenkins port conflict
        get("/", (req, res) -> "Hello, Maven Build via Jenkins AND BY YOGESH!");

        // SparkJava keeps the JVM alive automatically
        System.out.println("Server started at http://localhost:9090");
    }
}
