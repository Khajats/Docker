package utility;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

public class DataProvider2 {

	@DataProvider
	public List<Object> getData() {
		List<Object>list = new ArrayList<>();
		list.add("kahaja");
		list .add("sjajja");
		return list;
	}

}
