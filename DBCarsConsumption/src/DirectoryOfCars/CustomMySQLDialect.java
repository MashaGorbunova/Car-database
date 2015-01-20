package DirectoryOfCars;

import org.hibernate.dialect.MySQL5InnoDBDialect;

/**
 * creating the correct encoding 
 * in the configure Hibernate file
 * @version 1.0 2015-01-01
 * @author Masha Gorbunova
 */

public class CustomMySQLDialect extends MySQL5InnoDBDialect {
	
	/**
	 * get the correct encoding in the table
	 * @return String with right settings
	 */
	public String getTableTypeString(){
        return "ENGINE=InnoDB DEFAULT CHARSET=utf8mb4";
    }

}
