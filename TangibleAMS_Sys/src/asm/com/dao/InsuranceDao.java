package asm.com.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import asm.com.dbHelper.DbHelper;
import asm.com.pojos.Asset;
import asm.com.pojos.Insurance;

public class InsuranceDao {
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for saving an Employee Account
	public void saveInsurance(Insurance insurance){
		emf = DbHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(insurance);
		em.getTransaction().commit();
		em.close();
	}
	public Insurance searchInsurance(Long id){
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Insurance insurance=em.find(Insurance.class,id);
		return insurance;
	}
	
	
	//for updating
	
			
				
				public void updateInsurance(String insureName, String webSiteLink, String contactName,
						long phone, String address, String city, String email, long fax,
						String description,Set<Asset> asset) 
						{
	
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Insurance insurance=em.find(Insurance.class,insureName);
		insurance.setWebSiteLink(webSiteLink);
		insurance.setAddress(address);
		insurance.setContactName(contactName);
		insurance.setInsureName(insureName);
		insurance.setAsset(asset);
		insurance.setEmail(email);
		insurance.setFax(fax);
		insurance.setCity(city);
		insurance.setPhone(phone);
		insurance.setDescription(description);
		

		
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<Insurance>listInsurance(){
        emf=DbHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<Insurance> query=em.createQuery("Select b from Insurance b",Insurance.class);
        List<Insurance> InsuranceList=query.getResultList();
        return InsuranceList;
    }

}
