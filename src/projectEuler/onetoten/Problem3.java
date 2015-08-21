package projectEuler.onetoten;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;

/**
 * @copyright ©2015, Bell Canada
 * @author maxime.charron (CTS)
 */
public class Problem3 {
  public static void main(String[] pArgs) throws Exception {
    System.out.println("Calculating largest prime factor of 600851475143...");
    Integer prime = findLargest(primeFactors(600851475143l));
    System.out.println("Largest prime factor is: " + prime);
  }

  public static Integer findLargest(Set<Integer> primeFactors) {
    List<Integer> sortedPrimeFactors = Lists.newArrayList(primeFactors);
    Collections.sort(sortedPrimeFactors);
    return sortedPrimeFactors.get(sortedPrimeFactors.size() - 1);
  }

  public static Set<Integer> primeFactors(long number) {
    Set<Integer> primefactors = new HashSet<>();
    long copyOfInput = number;
    for (int i = 2; i <= copyOfInput; i++) {
      if (copyOfInput % i == 0) {
        primefactors.add(i);
        copyOfInput /= i;
        i--;
      }
    }
    return primefactors;
  }

}
