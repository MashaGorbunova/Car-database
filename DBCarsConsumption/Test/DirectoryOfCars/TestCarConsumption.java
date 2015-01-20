package DirectoryOfCars;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCarConsumption {
	Car car1 = new Car ("Lada", 1.5, 7.0, "disel");
	Car car2 = new Car ("Toyota", 2.0, 10.0, "disel");

	@Test
	public void testAddInfo() {
		CarConsumption cons = new CarConsumption ();
		cons.addInfo(car1);
		cons.addInfo(car2);
		String value = cons.getById(1).getNameOfCar();
		assertFalse (value.isEmpty());
	}

	@Test
	public void testGetById() {
		CarConsumption cons = new CarConsumption ();
		String value = cons.getById(1).getNameOfCar();
		assertFalse (value.isEmpty());
	}

}
