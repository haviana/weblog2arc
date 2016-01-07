package com.fccn.arquivo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



/**
 * Hello world!
 *
 */
public class App 
{
	static final Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        PropertyConfigurator.configure("log4j.properties");

        logger.debug("Hello World!");
        logger.warn("warning");
        logger.error("error");
    }
}
