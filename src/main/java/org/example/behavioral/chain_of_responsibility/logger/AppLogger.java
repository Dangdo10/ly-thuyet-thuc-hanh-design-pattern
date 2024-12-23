package org.example.behavioral.chain_of_responsibility.logger;

public class AppLogger {

    public static Logger getLogger() {
        Logger consoleLogger = new ConsoleLogger(LogLevel.DEBUG);
        Logger fileLogger = consoleLogger.setNext(new FileLogger(LogLevel.ERROR));
        fileLogger.setNext(new EmailLogger(LogLevel.FATAL));
        return consoleLogger;
    }
}
