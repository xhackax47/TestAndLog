package utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyIpServiceTest {

	@SuppressWarnings("unused")
	@Test
	public void test() {
		
		HttpDataService h = new HttpDataService();
		MyIpService ipTest = new MyIpService(h);
		
		String ip = MyIpService.getIp().toString();
		
		assertEquals(ip, ip.toString());
		assertEquals(false,"92.154.66.30" == ip.toString());
	}

}
