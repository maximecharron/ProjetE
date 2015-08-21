package projectEuler.onetoten;

import java.util.ArrayList;
import java.util.List;

public class Problem10 {

	
	public static void main(String[] pArgs) throws Exception {
	    System.out.println("Calculating all primes below 2 millions...");
	    long sum = findSum(findPrimes());
	    System.out.println("Sum is: " + sum);
	  }
	
	static List<Integer> findPrimes() {
	    List<Integer> primes = new ArrayList<>();
	    primes.add(2);
	    int i = 3;
	    while (i <= 2000000) {
	      if (isPrime(i)) {
	        primes.add(i);
	      }
	      i += 2;
	    }
	    return primes;
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
	  
	  static long findSum(List<Integer> primes){
		  long sum = 0;
		  for (Integer prime :primes){
			  sum += prime;
		  }
		  return sum;
	  }
}
