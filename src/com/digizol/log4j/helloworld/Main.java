package com.digizol.log4j.helloworld;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * A simple class to generate different levels of log messages.
 * 
 * @author Kamal Mettananda
 *
 */
public class Main {

    private static Logger log = Logger.getLogger(Main.class);

    public 
    static 
    void main(String[] args) {

        log.debug("This is debug method");
        log.info("This is info method");
        log.error("This is error method");

        log.log(Level.DEBUG, "This is debug from Level.DEBUG");
        log.log(Level.INFO, "This is info from Level.INFO");
        log.log(Level.ERROR, "This is error from Level.ERROR");

    }

}