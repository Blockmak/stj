import com.blockmak.util.pi;

public class TestPi{
  public static void main(String[] args){
    System.out.println("Math.PI: " + Math.PI);
    pi myPi = new pi();
    System.out.println("My PI: " + myPi.calc());
  }
}
