package projectEuler.onetoten;

import java.util.HashSet;
import java.util.Set;

/**
 * @copyright ©2015, Bell Canada
 * @author maxime.charron (CTS)
 */
public class Problem1 {

  public static void main(String[] pArgs) throws Exception {
    System.out.println("Calculating sum...");
    Set<Integer> multiples = findMultipleOf3Or5();
    Integer sum = sum(multiples);
    System.out.println("Sum is: " + sum);
  }

  static Set<Integer> findMultipleOf3Or5() {
    Set<Integer> multiples = new HashSet<>();
    for (int i = 0; i < 1000; i = i + 3) {
      multiples.add(i);
    }
    for (int i = 0; i < 1000; i = i + 5) {
      multiples.add(i);
    }
    return multiples;
  }

  static Integer sum(Set<Integer> multiples) {
    Integer sum = 0;
    for (Integer multiple : multiples) {
      sum += multiple;
    }

    return sum;
  }
}
