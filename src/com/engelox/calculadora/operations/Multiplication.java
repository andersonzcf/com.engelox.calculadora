package com.engelox.calculadora.operations;

public class Multiplication extends Algebra {

  public Multiplication(double operand1, double operand2) {
    super(operand1, operand2);
  }

  @Override
  public double execute() {
    return operand1 * operand2;
  }
}
