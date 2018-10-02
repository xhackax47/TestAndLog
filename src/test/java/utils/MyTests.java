package utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MyTests {
	
	public MyTests() {
		super();
	}

	List<Integer> listInteger1 = new ArrayList<Integer>();
	List<Integer> listInteger2 = new ArrayList<Integer>();
	List<Float> listFloat = new ArrayList<Float>();
	List<Float> listeFloatCarre = new ArrayList<Float>();
	
	String s = "s";
	String s2 = null;
	
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
	
	@Before
	public void before() {
		
		listInteger1.add(i1);
		listInteger1.add(i2);
		listInteger1.add(i3);
		listInteger1.add(i4);
		listInteger1.add(i5);
		
		listInteger2.add(i2);
		listInteger2.add(i4);
		
		listFloat.add(f1);
		listFloat.add(f2);
		listFloat.add(f3);
		listFloat.add(f4);
		listFloat.add(f5);
		
		listeFloatCarre.add(f1 * f1 + 0.5F);
		listeFloatCarre.add(f2 * f2 + 0.5F);
		listeFloatCarre.add(f3 * f3 + 0.5F);
		listeFloatCarre.add(f4 * f4 + 0.5F);
		listeFloatCarre.add(f5 * f5 + 0.5F);	
	}

	
	@Test
	public void testsCompare() {

		int[] tab1 = { 1, 5, 7, 8, 8, 9 };
		int[] tab2 = { 1, 1, 5, 7, 8, 9 };
		
		System.out.println("");
		System.out.println("Test assert(Services.compare(tab1, tab2)");
		System.out.println("");

		boolean b = MyUtils.compare(tab1, tab2);

		assert (b);
		
		System.out.println("");
		System.out.println("Sysout de la methode MyUtils.compare sur tab1 et tab2 : ");
		System.out.println(MyUtils.compare(tab1, tab2));
		System.out.println("");
		
	}
	
	@Test
	public void testSum() {

		Integer sum2 = MyUtils.sum(listInteger1);
		assertEquals(sum2, sum);
		
		System.out.println("");
		System.out.println("Sysout de la methode MyUtils.sum sur listInteger1 : ");
		System.out.println(MyUtils.sum(listInteger1));
		System.out.println("");
		
	}
	
	@Test
	public void testEmptyToNull() {
		
		assertNotNull(MyUtils.emptyToNull(s));
		assertNull(MyUtils.emptyToNull(s2));
		
		System.out.println("");
		System.out.println("Sysout de la methode MyUtils.emptyToNull sur s : ");
		System.out.println(MyUtils.emptyToNull(s));
		System.out.println("");
		
		System.out.println("");
		System.out.println("Sysout de la methode MyUtils.emptyToNull sur s2 : ");
		System.out.println(MyUtils.emptyToNull(s2));
		System.out.println("");
	}
	
	@Test
	public void testFilterEvenNumbers() {

		List<Integer> listIntegerF = MyUtils.filterEvenNumbers(listInteger1);
		assertEquals(listInteger2, listIntegerF);
		
		System.out.println("");
		System.out.println("Sysout de la methode MyUtils.filterEvenNumbers sur listInteger1 : ");
		System.out.println(MyUtils.filterEvenNumbers(listInteger1));
		System.out.println("");

	}
	
	@Test
	public void testTransformSquarePlusPointFive() {

		List<Float> listeFloatF = MyUtils.transformSquarePlusPointFive(listFloat);
		
		assertEquals(listeFloatCarre, listeFloatF);
		
		System.out.println("");
		System.out.println("Sysout de la methode MyUtils.transformSquarePlusPointFive sur listFloat : ");
		System.out.println(MyUtils.transformSquarePlusPointFive(listFloat));
		System.out.println("");

	}
	
	@Test
	public void testGetMyIp()  {
		// TEST IP
		HttpDataService h = new HttpDataService();
		MyIpService ipTest = new MyIpService(h);
		MyIpService ipSTest = new MyIpService(h);

		String ip = ipTest.getIp();
		String ipS = ipSTest.mockGetJsonIP();
		String json = "{\"ip\":\"92.154.66.22\",\"about\":\"/about\",\"Pro!\":\"http://getjsonip.com\",\"reject-fascism\":\"Support the ACLU: https://action.aclu.org/secure/donate-to-aclu\"}";
		
		assertEquals("92.154.66.22", ip);
		assertEquals(json, ipS);
		
		System.out.println("");
		System.out.println("Sysout de la methode  MyIpService.getIp().toString() : ");
		System.out.println(ipTest.getIp().toString());
		System.out.println("");
		
		System.out.println("");
		System.out.println("Sysout de la methode  MyIpServiceTest.getMockIp().toString() : ");
		System.out.println(ipSTest.mockGetJsonIP().toString());
		System.out.println("");
	}
}
