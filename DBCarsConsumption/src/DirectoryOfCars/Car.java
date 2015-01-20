package DirectoryOfCars;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * creating databases with fuel consumption 
 * certain kind of car
 * @version 1.0 2015-01-01
 * @author Masha Gorbunova
 */
@Entity
@Table (name="Car_Consumption")
public class Car {
	
	private long id;
	private String nameOfCar;
	private double engineVolume;
	private double fuelConsumption;
	private String kindOfFuel;
	
	public Car () {}
	
	/**
	 * constructs an object of Car
	 * @param nameOfCar car's name
	 * @param engineVolume car's volume of engine
	 * @param fuelConsumption fuel consumption of car
	 * @param kindOfFuel kind of fuel which uses car 
	 */
	public Car (String nameOfCar, double engineVolume, double fuelConsumption, String kindOfFuel) {
		this.nameOfCar = nameOfCar;
		this.engineVolume = engineVolume;
		this.fuelConsumption = fuelConsumption;
		this.kindOfFuel = kindOfFuel;
	}
	
	@Id
	@GeneratedValue (generator="increment")
	@GenericGenerator (name="increment", strategy="increment")
	@Column (name="id")
	/**
	 * get id
	 * @return id in the table
	 */
	public long getId () {
		return id;
	}
	
	@Column (name="name_Of_Car")
	/**
	 * get name of car
	 * @return name of car in the table
	 */
	public String getNameOfCar () {
		return nameOfCar;
	}
	
	@Column (name="engine_Volume")
	/**
	 * get car's volume of engine
	 * @return car's volume of engine in the table
	 */
	public double getEngineVolume () {
		return engineVolume;
	}
	
	@Column (name="fuel_Consumption")
	/**
	 * get fuel consumption
	 * @return fuel consumption in the table
	 */
	public double getFuelConsumption () {
		return fuelConsumption;
	}
	
	@Column (name="kind_Of_Fuel")
	/**
	 * get kind of fuel
	 * @return kind of fuel in the table
	 */
	public String getKindOfFuel () {
		return kindOfFuel;
	}
	
	/**
	 * change id in the table
	 * @param id new id 
	 */
	public void setId (long id) {
		this.id = id;
	}
	
	/**
	 * change name of car in the table
	 * @param nameOfCar new name of car
	 */
	public void setNameOfCar (String nameOfCar) {
		this.nameOfCar = nameOfCar;
	}
	
	/**
	 * change car's volume of engine in the table
	 * @param engineVolume new car's volume of engine
	 */
	public void setEngineVolume (double engineVolume) {
		this.engineVolume = engineVolume;
	}
	
	/**
	 * change fuel consumption in the table
	 * @param fuelConsumption new fuel consumption
	 */
	public void setFuelConsumption (double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	
	/**
	 * change kind of fuel in the table
	 * @param kindOfFuel new kind of fuel
	 */
	public void setKindOfFuel (String kindOfFuel) {
		this.kindOfFuel = kindOfFuel;
	}
	
	@Override
	/**
	 * output in String object of Car
	 */
	public String toString () {
		return nameOfCar + ", " + engineVolume + ", " + fuelConsumption + ", " + kindOfFuel;
	}

}
