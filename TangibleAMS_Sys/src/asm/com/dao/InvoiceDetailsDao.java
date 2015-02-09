/*package asm.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import asm.com.dbHelper.DbHelper;
import asm.com.pojos.Asset;
import asm.com.pojos.invoiceDetails;

public class InvoiceDetailsDao {
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for saving an Employee Account
	public void saveInvoiceDetails(invoiceDetails invoicedetails){
		emf = DbHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(invoicedetails);
		em.getTransaction().commit();
		em.close();
	}
	public invoiceDetails searchinvoiceDetails(Long id){
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		invoiceDetails invoicedetails=em.find(invoiceDetails.class,id);
		return invoicedetails;
	}
	
	
	//for updating
	
			
				
				public void updateInvoice(long id,long quantity, float unitPrice, String description, Asset asset) 
						{
	
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		invoiceDetails invoicedetails=em.find(invoiceDetails.class,id);
		invoicedetails.setAsset(asset);
		invoicedetails.setDescription(description);
		invoicedetails.setQuantity(quantity);
		invoicedetails.setUnitPrice(unitPrice);
		
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<invoiceDetails>listinvoiceDetails(){
        emf=DbHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<invoiceDetails> query=em.createQuery("Select b from invoiceDetails b",invoiceDetails.class);
        List<invoiceDetails> invoiceDetailsList=query.getResultList();
        return invoiceDetailsList;
    }

}
*/