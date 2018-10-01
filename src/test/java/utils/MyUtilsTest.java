package utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MyUtilsTest {

	@SuppressWarnings("unused")
	@Test
	public void testsGlobaux() {

		// TESTS

		List<Integer> listInteger1 = new ArrayList<Integer>();
		List<Integer> listInteger2 = new ArrayList<Integer>();
		List<Float> listFloat = new ArrayList<Float>();
		String s = "s";
		Integer i1 = 1;
		Integer i2 = 2;
		Integer i3 = 3;
		Integer i4 = 4;
		Integer i5 = 5;
		Float f1 = 1F;
		Float f2 = 2F;
		Float f3 = 3F;
		Float f4 = 4F;
		Float f5 = 5F;

		Integer sum = i1 + i2 + i3 + i4 + i5;

		// TESTS COMPARE

		int[] tab1 = { 1, 5, 7, 8, 8, 9 };
		int[] tab2 = { 1, 1, 5, 7, 8, 9 };

		System.out.println("Test assert(Services.compare(tab1, tab2)");
		System.out.println("");

		boolean b = MyUtils.compare(tab1, tab2);

		assert (b);

		// TEST 1

		listInteger1.add(i1);
		listInteger1.add(i2);
		listInteger1.add(i3);
		listInteger1.add(i4);
		listInteger1.add(i5);

		// TEST 2

		Integer sum2 = MyUtils.sum(listInteger1);

		// TEST 3

		listInteger2.add(i2);
		listInteger2.add(i4);

		List<Integer> listIntegerF = MyUtils.filterEvenNumbers(listInteger1);

		// TEST 4

		listFloat.add(f1);
		listFloat.add(f2);
		listFloat.add(f3);
		listFloat.add(f4);
		listFloat.add(f5);

		List<Float> listeFloatCarre = new ArrayList<Float>();

		listeFloatCarre.add(f1 * f1 + 0.5F);
		listeFloatCarre.add(f2 * f2 + 0.5F);
		listeFloatCarre.add(f3 * f3 + 0.5F);
		listeFloatCarre.add(f4 * f4 + 0.5F);
		listeFloatCarre.add(f5 * f5 + 0.5F);

		List<Float> listeFloatF = MyUtils.transformSquarePlusPointFive(listFloat);

		// TEST IP

		HttpDataService h = new HttpDataService();
		MyIpService ipTest = new MyIpService(h);

		String ip = MyIpService.getIp().toString();

		// EXECUTION TESTS

		assertNotNull(MyUtils.emptyToNull(s));
		assertEquals(sum2, sum);
		assertEquals(listInteger2, listIntegerF);
		assertEquals(listeFloatCarre, listeFloatF);
		assertEquals(ip, ip.toString());
		assertEquals(false, "92.154.66.30" == ip.toString());

		// RETOUR SYSOUT TESTS

		System.out.println("Sysout de la methode MyUtils.emptyToNull sur s : ");
		System.out.println(MyUtils.emptyToNull(s));
		System.out.println("");

		System.out.println("Sysout de la methode MyUtils.sum sur listInteger1 : ");
		System.out.println(MyUtils.sum(listInteger1));
		System.out.println("");

		System.out.println("Sysout de la methode MyUtils.filterEvenNumbers sur listInteger1 : ");
		System.out.println(MyUtils.filterEvenNumbers(listInteger1));
		System.out.println("");

		System.out.println("Sysout de la methode MyUtils.transformSquarePlusPointFive sur listFloat : ");
		System.out.println(MyUtils.transformSquarePlusPointFive(listFloat));
		System.out.println("");

		System.out.println("Sysout de la methode  MyIpService.getIp().toString() : ");
		System.out.println(MyIpService.getIp().toString());
		System.out.println("");

		System.out.println("FIN DES TESTS");

		try {
			Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("");
		System.out.println("FERMETURE DU PROGRAMME");
	}
}
