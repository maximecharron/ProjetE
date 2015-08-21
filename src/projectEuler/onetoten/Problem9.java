package projectEuler.onetoten;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Table;
import com.google.common.collect.Tables;

import projectEuler.utils.Triplet;

public class Problem9 {

	public static void main(String[] pArgs) throws Exception {
		System.out.println("Finding unique pythagorian triplet with a sum of 1000...");
		Triplet<Integer, Integer, Integer> triplet = findPythagorianTripletWith1000Sum(findPythagoreTriplets());
		System.out.println("Pythagorian triplet is: " + triplet.toString());
		int multiple = triplet.getA()*triplet.getB()*triplet.getC();
		System.out.println("Multiple of abc is : " + multiple);
	}

	private static List<Triplet<Integer, Integer, Integer>> findPythagoreTriplets() {
		List<Triplet<Integer, Integer, Integer>> pythagorianTriplets = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			for (int j = i +1; j<100; j++){
				int a = j*j - i*i;
				int b = 2*j*i;
				int c = j*j + i*i;
				Triplet<Integer, Integer, Integer> pythagorianTriplet = new Triplet<Integer, Integer, Integer>(a, b,c);
				pythagorianTriplets.add(pythagorianTriplet);
				}
		}
		return pythagorianTriplets;
	}

	public static Triplet<Integer, Integer, Integer> findPythagorianTripletWith1000Sum(List<Triplet<Integer, Integer, Integer>> pythagorianTriplets) {
		for (Triplet<Integer, Integer, Integer> pythagorianTriplet : pythagorianTriplets){
			if ((pythagorianTriplet.getA()+pythagorianTriplet.getB()+pythagorianTriplet.getC()) == 1000){
				return pythagorianTriplet;
			}
		}
		return null;
	}

}
