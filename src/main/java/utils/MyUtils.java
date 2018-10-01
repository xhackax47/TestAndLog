package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyUtils {
	
	public static boolean compare(int[] tab1, int[] tab2) {

		System.out.println("Voici  le tableau 1 : " + tab1);
		System.out.println("Voici  le tableau 1 : " + tab2);

		ArrayList<Integer> al1 = new ArrayList<Integer>();

		for (int i : tab1) {
			al1.add(i);
		}

		System.out.println("Liste 1 : " + al1);

		ArrayList<Integer> al2 = new ArrayList<Integer>();

		for (int i : tab2) {
			al2.add(i);
		}

		System.out.println("Liste 2 : " + al2);

		for (int i : tab1) {
			if (!al1.contains(i)) {
				return false;
			}
			;
		}
		for (int i : tab2) {
			if (!al2.contains(i)) {
				return false;
			}
			
		}
		return true;
}
	
	public static int sum(List<Integer> list) {
		int i1 = 0;
		for(int i2:list) {
			i1+=i2;
		}
		return i1;
		
	}
	
	public static String emptyToNull(String s) {
		if(s == null) {
			return null;
		}else {
			return s;
		}
	}
	
	public static List<Integer> filterEvenNumbers(List<Integer> integers) {
		List<Integer> li = new ArrayList<Integer>();
		
//		for(int nb:integers) {
//			if(nb % 2 == 0) {
//				li.add(nb);
//			}
//		}
		
		li = integers.stream().filter(nb-> nb % 2 == 0).collect(Collectors.toList());
		
		return li;
		
	}
	
	public static List<Float> transformSquarePlusPointFive(List<Float> floats) {
		List<Float> lf = new ArrayList<Float>();
		
//		for(float nb:floats) {
//			lf.add(nb * nb + 0.5F);
//		}
		
		lf = floats.stream().map(x-> x*x+0.5F).collect(Collectors.toList());
		
		return lf;
	}

}
