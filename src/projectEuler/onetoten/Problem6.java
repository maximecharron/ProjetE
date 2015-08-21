package projectEuler.onetoten;

import java.math.BigInteger;

/**
 * @copyright ©2015, Bell Canada
 * @author maxime.charron (CTS)
 */
public class Problem6 {

  public static void main(String[] pArgs) throws Exception {
    System.out.println("Calculating difference...");
    BigInteger multiple = findDifferenceBetweenSums();
    System.out.println("Difference is: " + multiple.toString());
  }

  static BigInteger findDifferenceBetweenSums() {
    BigInteger squareOfSum = BigInteger.ZERO;
    BigInteger sum = BigInteger.ZERO;
    BigInteger sumOfSquare = BigInteger.ZERO;
    for (long i = 0l; i <= 100l; i++) {
      sumOfSquare = sumOfSquare.add(BigInteger.valueOf(i * i));
      sum = sum.add(BigInteger.valueOf(i));
    }
    squareOfSum = sum.pow(2);
    return squareOfSum.subtract(sumOfSquare);
  }

}
