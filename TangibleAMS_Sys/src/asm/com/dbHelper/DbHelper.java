package asm.com.dbHelper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Lwandle
 *
 */
public class DbHelper {
	
	private static final EntityManagerFactory entityManagerFactory = produceObj();
	private static EntityManagerFactory produceObj() {	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TAMS");	
		return entityManagerFactory;
	}
	public static EntityManagerFactory provideFactory(){	
		return entityManagerFactory;
	}

}
