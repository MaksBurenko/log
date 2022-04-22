package log;

import java.util.logging.*;

public class Main {

    private static void configureLogging() {

        Logger logger = Logger.getLogger("org.stepic.java");
        logger.log(Level.ALL, "org.stepic.java");

        Logger loggerA = Logger.getLogger("org.stepic.java.logging.ClassA");
        loggerA.log(Level.SEVERE, "ClassA");

        Logger loggerB = Logger.getLogger("org.stepic.java.logging.ClassA");
        loggerB.log(Level.WARNING, "ClassB");

        ConsoleHandler consoleHandler = new ConsoleHandler();
        logger.setUseParentHandlers(false);
        XMLFormatter xmlFormatter = new XMLFormatter();

        consoleHandler.setFormatter(xmlFormatter);
        logger.addHandler(consoleHandler);

        logger.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);
    }
}
