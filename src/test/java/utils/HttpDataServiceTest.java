package utils;

import org.junit.Before;
import org.mockito.Mockito;

public class HttpDataServiceTest {
	
	@Before
	public String mockGetJsonIP() {

		HttpDataService hds;
		String json = "{\"ip\":\"92.154.66.22\",\"about\":\"/about\",\"Pro!\":\"http://getjsonip.com\",\"reject-fascism\":\"Support the ACLU: https://action.aclu.org/secure/donate-to-aclu\"}";
		
		hds = Mockito.mock(HttpDataService.class);
		Mockito.when(hds.getJsonIP()).thenReturn(json);
		return json;
	}

}
