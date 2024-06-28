package com.sparta.cr;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PalindromeLogger {
    private static final Logger logger = Logger.getLogger("PalindromeLogger");

    public PalindromeLogger(){

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.WARNING);

        logger.addHandler(consoleHandler);
        logger.setLevel(Level.ALL);

        try{
            FileHandler fileHandlerFinest = new FileHandler("src/main/resources/log-file-system", true);
            FileHandler fileHandlerUser = new FileHandler("src/main/resources/log-file-user", true);
            fileHandlerFinest.setLevel(Level.ALL);
            fileHandlerUser.setLevel(Level.INFO);

            logger.addHandler(fileHandlerFinest);
            logger.addHandler(fileHandlerUser);
            logger.setUseParentHandlers(false);
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    public static setupLogger

    public Logger getLogger(){
        return logger;
    }

}
