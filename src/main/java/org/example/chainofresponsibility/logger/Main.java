package org.example.chainofresponsibility.logger;

public class Main {
  public static void main(String[] args) {
    LoggerChain errorLevel = new ErrorLogger();
    LoggerChain warnLevel = new WarnLogger();
    LoggerChain infoLevel = new InfoLogger();
    LoggerChain debugLevel = new DebugLogger();
    errorLevel.setNextLogger(warnLevel);
    warnLevel.setNextLogger(infoLevel);
    infoLevel.setNextLogger(debugLevel);

    errorLevel.logMessage("error is here", 0);
    errorLevel.logMessage("warning is here", 1);
    errorLevel.logMessage("info is here", 2);
    errorLevel.logMessage("debug is here", 3);

    errorLevel.logMessage("random testing", 2);
    errorLevel.logMessage("random testing", 10);
  }
}
