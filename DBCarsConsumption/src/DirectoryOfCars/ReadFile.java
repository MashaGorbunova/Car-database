package DirectoryOfCars;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * reading information from Excel file
 * and put its to list of Car's objects
 * @version 1.0 2015-01-01
 * @author Masha Gorbunova
 */

public class ReadFile {
	public static final int NAME_OF_CAR = 1;
	public static final int ENGINE_VOLUME = 2;
	public static final int KIND_OF_FUEL = 3;
	public static final int FUEL_CONSUMPTION = 4;
	
	/**
	 * get list of Car's objects
	 * @param pathFile path to Excel file
	 * @return list of Car's objects
	 * @throws Exception
	 */
	public List<Car> getCars (String pathFile) throws Exception {
		
		List <Car> cars = new ArrayList <Car> ();
		
		InputStream in = new FileInputStream(pathFile);
        HSSFWorkbook wb = new HSSFWorkbook(in);
 
        Sheet sheet = wb.getSheetAt(0); // check only first sheet
        
        Iterator<Row> it = sheet.iterator();
        if (it.hasNext()) {  // without title of table
        	it.next();
        }
        
        while (it.hasNext()) {
            Row row = it.next();
            Cell namecell = row.getCell(NAME_OF_CAR);
            Cell enginecell = row.getCell(ENGINE_VOLUME);
            Cell kindcell = row.getCell(KIND_OF_FUEL);
            Cell consumptioncell = row.getCell(FUEL_CONSUMPTION);
            
            Car car = new Car ();
            car.setNameOfCar(namecell.getStringCellValue());
            car.setEngineVolume(enginecell.getNumericCellValue());
            car.setKindOfFuel(kindcell.getStringCellValue());
            car.setFuelConsumption(consumptioncell.getNumericCellValue());
            cars.add(car);
        }
		wb.close();
		return cars;
	}
}
