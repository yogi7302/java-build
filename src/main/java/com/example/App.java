package com.example;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        port(8080);
        ipAddress("0.0.0.0");
        get("/", (req, res) -> "Hello, Maven Build via Jenkins AND BY YOGESH!....FINALLY I DID IT...10,0000+ AURA");
        System.out.println("Server started at http://0.0.0.0:8080");
    }
}
