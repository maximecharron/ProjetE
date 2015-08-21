package projectEuler.onetoten;

/**
 * @copyright ©2015, Bell Canada
 * @author maxime.charron (CTS)
 */
public class Problem5 {

  public static void main(String[] pArgs) throws Exception {
    System.out.println("Calculating smallest multiple...");
    Integer multiple = findSmallestMultiple();
    System.out.println("Smallest multiple is: " + multiple);
  }

  private static Integer findSmallestMultiple() {
    for (int i = 2520; i <= 1000000000; i += 20) {
      if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0 && i % 6 == 0 && i % 7 == 0 && i % 8 == 0
          && i % 9 == 0 && i % 11 == 0 && i % 12 == 0 && i % 13 == 0 && i % 14 == 0 && i % 15 == 0
          && i % 16 == 0 && i % 17 == 0 && i % 18 == 0 && i % 19 == 0)
      {
        return i;
      }
    }
    return 0;
  }
}
