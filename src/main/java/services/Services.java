package services;

import java.util.ArrayList;

public class Services {

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

}
