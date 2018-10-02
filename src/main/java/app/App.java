package app;

import utils.HttpDataService;
import utils.MyIpService;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Testing and Logging");
		System.out.println("");
		
		HttpDataService httpDS = new HttpDataService(); 
		MyIpService ipS = new MyIpService(httpDS);
		
		String ip = ipS.getIp().toString();
		System.out.println(ip);	

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