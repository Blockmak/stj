public class power {
  public static void main(String[] args) {
    System.out.println("a \t a^2 \t a^3"); 
    for (int i=1; i < 5; i++) {
      System.out.printf("%d \t %.0f \t %.0f \n", i, Math.pow(i,2), Math.pow(i,3)); 
    } 
  }
}
