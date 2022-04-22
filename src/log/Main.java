package log;

import java.util.logging.*;

public class Main {

    private static void configureLogging() {

        Logger logger = Logger.getLogger("org.stepic.java");
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false);

        Logger loggerA = Logger.getLogger("org.stepic.java.logging.ClassA");
        loggerA.setLevel(Level.ALL);

        Logger loggerB = Logger.getLogger("org.stepic.java.logging.ClassB");
        loggerB.setLevel(Level.WARNING);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        XMLFormatter xmlFormatter = new XMLFormatter();

        consoleHandler.setFormatter(xmlFormatter);
        logger.addHandler(consoleHandler);

        logger.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);
    }
}
