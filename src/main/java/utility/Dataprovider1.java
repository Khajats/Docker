package utility;

import org.testng.annotations.DataProvider;

public class Dataprovider1 {

	@DataProvider
	public static Object[][] getData() {
		return new Object[][] { { "abcdeabcde212", "abcd1abcd" }, { "abcdeabcde213", "abcde1abcde" } };
	}

}
