public class pi {
  public static double val = 0;
  public static void main(String[] args) {
    double s = 0;
    int sign = 1;
    for (int i=1; i <= 1000000; i=i+2) {
			s = s + sign*(1.0/i);
      sign = -1 * sign;
    } 
    val = 4 * s;
    System.out.printf("pi=%.9999999999f\n", val); 
  }
}
