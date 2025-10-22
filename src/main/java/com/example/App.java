import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        port(8080); // inside container
        get("/", (req, res) -> "Hello, Maven Build via Jenkins AND BY YOGESH!....");
    }
}
