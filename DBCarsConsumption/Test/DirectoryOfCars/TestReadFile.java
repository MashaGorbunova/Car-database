package DirectoryOfCars;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestReadFile {

	@Test
	public void testGetCars() {
		List <Car> cars = new ArrayList <Car> ();
		String pathfile = "D:\\normy11.xls";
		ReadFile rf = new ReadFile (); 
		try {
			cars.addAll(rf.getCars(pathfile));
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertFalse (cars.isEmpty());
	}

}
