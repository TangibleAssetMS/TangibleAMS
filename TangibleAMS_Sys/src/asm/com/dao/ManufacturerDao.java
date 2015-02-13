package asm.com.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import asm.com.dbHelper.DbHelper;
import asm.com.pojos.Asset;
import asm.com.pojos.Department;
import asm.com.pojos.Invoice;
import asm.com.pojos.Manufacturer;

public class ManufacturerDao {
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for saving an Employee Account
	public void saveManufacturer(Manufacturer manufacturer){
		emf = DbHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(manufacturer);
		em.getTransaction().commit();
		em.close();
	}
	public Manufacturer searchManufacturer(Long id){
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Manufacturer manufacturer=em.find(Manufacturer.class,id);
		return manufacturer;
	}
	
	
	//for updating
	
			
				
				public void updateManufacturer(long id, String manuFacturerName,
						String webSiteLink, String contactName, Integer phone, String address,
						String city, String email, Integer fax, String description,
						Set<Asset> asset, Set<Invoice> invoice) 
						{
	
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Manufacturer manufacturer=em.find(Manufacturer.class,id);
		manufacturer.setAddress(address);
		manufacturer.setPhone(phone);
		manufacturer.setEmail(email);
		manufacturer.setFax(fax);
		manufacturer.setDescription(description);
		manufacturer.setWebSiteLink(webSiteLink);
		
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<Manufacturer>listManufacturer(){
        emf=DbHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<Manufacturer> query=em.createQuery("Select b from Manufacturer b",Manufacturer.class);
        List<Manufacturer> manufacturerList=query.getResultList();
        return manufacturerList;
    }
		//for deleting
		public void deleteManufacturer(Long id){
			emf=DbHelper.provideFactory();
			em=emf.createEntityManager();
			em.getTransaction().begin();
			Manufacturer manufac=em.find(Manufacturer.class,id);
			em.remove(manufac);
			em.getTransaction().commit();
			em.close();
		}


}
