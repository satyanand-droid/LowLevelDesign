package org.example.chainofresponsibility.logger;

public class InfoLogger implements LoggerChain {
  private int INFO_LOG_LEVEL = 2;
  private LoggerChain chain;

  @Override
  public void setNextLogger(LoggerChain nextLogger) {
    this.chain = nextLogger;
  }

  @Override
  public void logMessage(String message, int level) {
    if (level == INFO_LOG_LEVEL) {
      System.out.println("INFO: " + message);
    } else {
      chain.logMessage(message, level);
    }
  }
}
