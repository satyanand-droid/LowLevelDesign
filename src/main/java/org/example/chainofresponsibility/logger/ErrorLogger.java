package org.example.chainofresponsibility.logger;

public class ErrorLogger implements LoggerChain {
  private int ERROR_LOG_LEVEL = 0;
  private LoggerChain chain;

  @Override
  public void setNextLogger(LoggerChain nextLogger) {
    this.chain = nextLogger;
  }

  @Override
  public void logMessage(String message, int level) {
    if (level == ERROR_LOG_LEVEL) {
      System.out.println("ERROR: " + message);
    } else {
      chain.logMessage(message, level);
    }
  }
}
