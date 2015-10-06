import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/", (req, res) -> {
        	// Do something
        	return "Welcome! This is a Spark Example!";
        });
        
        get("/hello/:name", (req, res) -> {
        	// Do something
        	return "Welcome! " + req.params(":name");
        });
    }
}