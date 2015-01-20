package DirectoryOfCars;

/**
 * program of creating databases through
 * Hibernate and put information to databases
 * from Excel file
 * @version 1.0 2015-01-01
 * @author Masha Gorbunova
 */

public class MainCarConsumption {
	
	/**
	 * get table with data from Excel file
	 * @throws Exception
	 */
	public static void getTable () throws Exception {
		ReadFile d = new ReadFile();
		String pathFile = "D:\\Programmer/Eclipse work space/DBCarsConsumption/normy11.xls";
		CarConsumption carcons = new CarConsumption ();
		for (int i=0;i<d.getCars (pathFile).size(); i++) {
			carcons.addInfo(d.getCars (pathFile).get(i));
		}
	}
	
	public static void main (String ... args) throws Exception {
		getTable();
	}

}
