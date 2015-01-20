package DirectoryOfCars;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * creating connection with databases
 * through Hibernate framework
 * @version 1.0 2015-01-01
 * @author Masha Gorbunova
 */

public class CarConsumption {
	private SessionFactory sf;
	
	/**
	 * constructs object of CarConsumption
	 */
	public CarConsumption () {
		Configuration con = new Configuration ();
		con.configure();
		
		ServiceRegistry servreg = new StandardServiceRegistryBuilder()
		                              .applySettings(con.getProperties()).build();
		sf = con.buildSessionFactory(servreg);
	}
	
	/**
	 * add information to table
	 * @param car object of Car
	 */
	public void addInfo (Car car) {
		Session session = null;
		try {
			session = sf.openSession();
			session.beginTransaction();
			session.save(car);
			session.getTransaction().commit();
		} finally {
			if (session != null && session.isOpen())
				session.close ();
		}
	}

	
	/**
	 * get information about car through id
	 * @param id id in the table
	 * @return information about car from id
	 */
	public Car getById (long id) {
		Session session = null;
		Car rez = null;
		try {
			session = sf.openSession();
			rez = (Car) session.get(Car.class, id);
		} finally {
			if (session !=null && session.isOpen())
				session.close();
		}
		return rez;
	}

}
