package com.sparta.cr;
import java.io.File;
import java.io.IOException;
import java.util.logging.*;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args){

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.WARNING);
        consoleHandler.setFormatter(new CustomFormatter());
        logger.addHandler(consoleHandler);

        //log file should not be part of the .gitignore

        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/log-file.log", true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new CustomFormatter());

        }
        catch (IOException e){
            throw new RuntimeException(e);
        }


        //todo something here

        //logger.log(Level.INFO, "this is an info message");
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false);
        logger.info("This is an info message");
        logger.warning("This is a warning message");
        logger.fine("This is a fine message");

    }
}
