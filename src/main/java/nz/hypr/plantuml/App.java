package nz.hypr.plantuml;

import static spark.Spark.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    public static void main(String[] args){
        setPort(8080);

        Logger logger = LoggerFactory.getLogger(App.class);
        logger.info("Hello World");
        get("/png", (req, res) -> "Hello World");
    }
}

