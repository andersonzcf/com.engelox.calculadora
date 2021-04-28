package com.engelox.calculadora;

import com.engelox.calculadora.operations.Operation;

public interface Calculator {
  public static double calculate(Operation operation) {
    return operation.execute();
  }
}
