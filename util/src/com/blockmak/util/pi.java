package com.blockmak.util;

public class pi {
  private double val = 0;
  public double calc() {
    double s = 0;
    int sign = 1;
    for (int i=1; i <= 1000000; i=i+2) {
			s = s + sign*(1.0/i);
      sign = -1 * sign;
    } 
    val = 4 * s;
    return val;
  }
}
