package projectEuler.onetoten;

import java.util.ArrayList;
import java.util.List;

/**
 * @copyright ©2015, Bell Canada
 * @author maxime.charron (CTS)
 */
public class Problem7 {

  public static void main(String[] pArgs) throws Exception {
    System.out.println("Calculating 10001st prime...");
    Integer multiple = findPrime();
    System.out.println("Difference is: " + multiple.toString());
  }

  static Integer findPrime() {
    List<Integer> primes = new ArrayList<>();
    primes.add(2);
    int i = 3;
    while (primes.size() != 10001) {
      if (isPrime(i)) {
        primes.add(i);
      }
      i += 2;
    }
    return primes.get(10000);
  }

  static boolean isPrime(int n) {
    if (n == 2) {
      return true;
    } else if (n % 2 == 0) {
      return false;
    } else {
      for (int i = 3; i * i <= n; i += 2) {
        if (n % i == 0) {
          return false;
        }
      }
      return true;
    }
  }
}
