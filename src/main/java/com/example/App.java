import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        port(8080); // internal container port
        ipAddress("0.0.0.0"); // bind to all network interfaces
        get("/", (req, res) -> "Hello, Maven Build via Jenkins AND BY YOGESH!....");
        System.out.println("Server started at http://0.0.0.0:8080");
    }
}
