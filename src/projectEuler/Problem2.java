package projectEuler;

/**
 * @copyright ©2015, Bell Canada
 * @author maxime.charron (CTS)
 */
public class Problem2 {

  public static void main(String[] pArgs) throws Exception {
    System.out.println("Calculating sum...");
    Integer sum = sumEvenFibonacci();
    System.out.println("Sum is: " + sum);
  }

  static Integer sumEvenFibonacci() {
    Integer fibonacciBefore = 1;
    Integer fibonacci = 2;
    Integer sum = 0;
    while (fibonacci <= 4000000) {
      if (fibonacci % 2 == 0) {
        sum += fibonacci;
      }
      Integer fibonacciTemp = fibonacci;
      fibonacci += fibonacciBefore;
      fibonacciBefore = fibonacciTemp;
    }
    return sum;
  }

}
