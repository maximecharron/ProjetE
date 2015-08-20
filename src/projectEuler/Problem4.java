package projectEuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @copyright ©2015, Bell Canada
 * @author maxime.charron (CTS)
 */
public class Problem4 {

  public static void main(String[] pArgs) throws Exception {
    System.out.println("Calculating largest palindromes...");
    Integer palindrome = findLargest(findPalindromes());
    System.out.println("Largest palindrome is: " + palindrome);
  }

  static Integer findLargest(List<Integer> sortedList) {
    if (sortedList.size() > 0) {
      return sortedList.get(sortedList.size() - 1);
    } else
      return null;
  }

  static List<Integer> findPalindromes() {
    List<Integer> palindromes = new ArrayList<>();
    for (int i = 999; i >= 900; i--) {
      for (int j = 999; j >= 900; j--) {
        int potentialPalindrome = i * j;
        if (isPalindrome(potentialPalindrome)) {
          palindromes.add(potentialPalindrome);
        }
      }
    }
    Collections.sort(palindromes);
    return palindromes;
  }

  static boolean isPalindrome(int palindrome) {
    return String.valueOf(palindrome)
                 .equals(new StringBuilder(String.valueOf(palindrome)).reverse().toString());
  }
}
