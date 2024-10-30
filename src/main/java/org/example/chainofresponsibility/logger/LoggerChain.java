package org.example.chainofresponsibility.logger;

public interface LoggerChain {

  void setNextLogger(LoggerChain logger);

  void logMessage(String message, int level);
}
