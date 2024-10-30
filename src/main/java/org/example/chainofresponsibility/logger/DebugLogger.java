package org.example.chainofresponsibility.logger;

public class DebugLogger implements LoggerChain {
  private int DEBUG_LOG_LEVEL = 3;
  private LoggerChain chain;

  @Override
  public void setNextLogger(LoggerChain nextLogger) {
    this.chain = nextLogger;
  }

  @Override
  public void logMessage(String message, int level) {
    if (level == DEBUG_LOG_LEVEL) {
      System.out.println("DEBUG: " + message);
    } else {
      System.out.println("wrong log level");
    }
  }
}
