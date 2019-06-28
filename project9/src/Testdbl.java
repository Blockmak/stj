public class Testdbl {
  public static void main (String[] args) {
    System.out.printf("double=%.0f\n", Double.MAX_VALUE);
    int dbl2int = (int) Double.MAX_VALUE;
    System.out.println("int="+dbl2int);
    long dbl2long = (long) Double.MAX_VALUE;
    System.out.println("long="+dbl2long);
  }
}
