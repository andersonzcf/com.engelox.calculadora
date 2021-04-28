package com.engelox.calculadora.operations;

public abstract class Algebra implements Operation {
  protected double operand1;
  protected double operand2;

  Algebra(double operand1, double operand2) {
    this.operand1 = operand1;
    this.operand2 = operand2;
  }

  public abstract double execute();
}
