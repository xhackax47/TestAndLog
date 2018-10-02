package utils;

import java.io.IOException;

import org.apache.http.client.fluent.Request;

public class HttpDataService {
	
	public String url="http://jsonip.com";
	
	public String getJsonIP() {
		try {
			return Request.Get(url).execute().returnContent().toString();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
