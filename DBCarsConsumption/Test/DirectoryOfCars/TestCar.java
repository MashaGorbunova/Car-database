package DirectoryOfCars;

import org.junit.Assert;
import org.junit.Test;

public class TestCar extends Assert {
	
	@Test
	public void testGetNameOfCar() {
		String name = "Lada";
		Car car = new Car ("Lada", 1.5, 7.0, "disel");
		assertEquals (name, car.getNameOfCar());
	}

	@Test
	public void testGetEngineVolume() {
		double engine = 1.5;
		Car car = new Car ("Lada", 1.5, 7.0, "disel");
		assertTrue (engine==car.getEngineVolume());
	}

	@Test
	public void testGetFuelConsumption() {
		double consumption = 7.0;
		Car car = new Car ("Lada", 1.5, 7.0, "disel");
		assertTrue (consumption==car.getFuelConsumption());
	}

	@Test
	public void testGetKindOfFuel() {
		String fuel = "disel";
		Car car = new Car ("Lada", 1.5, 7.0, "disel");
		assertEquals (fuel, car.getKindOfFuel());
	}

	@Test
	public void testSetNameOfCar() {
		String value = "Toyota";
		Car car = new Car ("Lada", 1.5, 7.0, "disel");
		car.setNameOfCar(value);
		assertEquals (value, car.getNameOfCar());
	}

	@Test
	public void testSetEngineVolume() {
		double value = 2.0;
		Car car = new Car ("Lada", 1.5, 7.0, "disel");
		car.setEngineVolume(value);
		assertTrue (value == car.getEngineVolume());
	}

	@Test
	public void testSetFuelConsumption() {
		double value = 10.0;
		Car car = new Car ("Lada", 1.5, 7.0, "disel");
		car.setFuelConsumption(value);
		assertTrue (value == car.getFuelConsumption());
	}

	@Test
	public void testSetKindOfFuel() {
		String value = "a95";
		Car car = new Car ("Lada", 1.5, 7.0, "disel");
		car.setKindOfFuel(value);;
		assertEquals (value, car.getKindOfFuel());
	}

	@Test
	public void testToString() {
		String value1 = "Volvo";
		double value2 = 1.7;
		double value3 = 8.5;
		String value4 = "a95";
		
		String value = value1 + ", " + value2 + ", " + value3 + ", " + value4;
		
		Car car = new Car (value1, value2, value3, value4);
		assertEquals (value, car.toString());
	}

}
