package utils;

import java.util.Map;

import com.google.gson.Gson;

public class MyIpService {
	
	public static HttpDataService httpDS;
	
	public MyIpService(HttpDataService httpDS) {
		MyIpService.httpDS = httpDS;
	}
	
	public String getIp() {
		Gson gson = new Gson();
		String jsonIp = httpDS.getJsonIP();
		Map<String, String> map = gson.<Map<String, String>>fromJson(jsonIp, Map.class);
		return map.get("ip").split(",")[0];
	}

}
