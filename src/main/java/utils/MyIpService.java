package utils;

import java.util.Map;

import org.junit.Before;
import org.mockito.Mockito;

import com.google.gson.Gson;

public class MyIpService {
	
	private static HttpDataService httpDS;
	
	public MyIpService(HttpDataService httpDS) {
		MyIpService.httpDS = httpDS;
	}
	
	public String getIp() {
		Gson gson = new Gson();
		String jsonIp = httpDS.getJsonIP();
		Map<String, String> map = gson.<Map<String, String>>fromJson(jsonIp, Map.class);
		return map.get("ip").split(",")[0];
	}
	
	@Before
	public String mockGetJsonIP() {

		HttpDataService hds;
		String json = "{\"ip\":\"92.154.66.22\",\"about\":\"/about\",\"Pro!\":\"http://getjsonip.com\",\"reject-fascism\":\"Support the ACLU: https://action.aclu.org/secure/donate-to-aclu\"}";
		
		hds = Mockito.mock(HttpDataService.class);
		Mockito.when(hds.getJsonIP()).thenReturn(json);
		return json;
	}

}
