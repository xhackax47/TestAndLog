package app;

import utils.HttpDataService;
import utils.MyIpService;

public class App {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println("Testing and Logging");
		System.out.println("");
		
		HttpDataService httpDS = new HttpDataService(); 
		MyIpService ipS = new MyIpService(httpDS);
		
		String ip = MyIpService.getIp().toString();
		System.out.println(ip);
		
		
	}
}