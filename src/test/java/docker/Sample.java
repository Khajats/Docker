package docker;

import java.net.MalformedURLException;
import java.util.Arrays;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class Sample {
	

	@SuppressWarnings("unchecked")
	@BeforeMethod
	public void setup(Object[]data) {
		System.out.println(Arrays.toString(data));
	}

	@Test(dataProvider = "getData")
	public void localTest(String name, String surname) throws MalformedURLException {

		System.out.println(name+":"+surname);
	}

	@DataProvider(parallel = false)
	public Object[] getData() {
		return new Object[][] {{"khaja","ts"},{"sameer","rathod"}};
		
	}

}
