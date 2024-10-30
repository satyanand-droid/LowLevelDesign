package org.example.chainofresponsibility.logger;

public class WarnLogger implements LoggerChain {
  private int WARN_LOG_LEVEL = 1;
  private LoggerChain chain;

  @Override
  public void setNextLogger(LoggerChain nextLogger) {
    this.chain = nextLogger;
  }

  @Override
  public void logMessage(String message, int level) {
    if (level == WARN_LOG_LEVEL) {
      System.out.println("WARN: " + message);
    } else {
      chain.logMessage(message, level);
    }
  }
}
