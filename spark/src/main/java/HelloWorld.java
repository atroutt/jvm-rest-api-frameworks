import static spark.Spark.*;

/**
 * Created by audrey on 9/9/16.
 */
public class HelloWorld {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World from Spark Framework");
    }
}
