package asm.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import asm.com.dbHelper.DbHelper;
import asm.com.pojos.Asset;
import asm.com.pojos.AssetinvoiceDetails;

public class InvoiceDetailsDao {
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for saving an Employee Account
	public void saveInvoiceDetails(AssetinvoiceDetails invoicedetails){
		emf = DbHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(invoicedetails);
		em.getTransaction().commit();
		em.close();
	}
	public AssetinvoiceDetails searchinvoiceDetails(Long id){
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		AssetinvoiceDetails invoicedetails=em.find(AssetinvoiceDetails.class,id);
		return invoicedetails;
	}
	
	
	//for updating
	
			
				
				public void updateInvoice(long id,long quantity, float unitPrice, String description, Asset asset) 
						{
	
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		AssetinvoiceDetails invoicedetails=em.find(AssetinvoiceDetails.class,id);
		invoicedetails.setAsset(asset);
		invoicedetails.setDescription(description);
		invoicedetails.setQuantity(quantity);
		invoicedetails.setUnitPrice(unitPrice);
		
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<AssetinvoiceDetails>listinvoiceDetails(){
        emf=DbHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<AssetinvoiceDetails> query=em.createQuery("Select b from invoiceDetails b",AssetinvoiceDetails.class);
        List<AssetinvoiceDetails> invoiceDetailsList=query.getResultList();
        return invoiceDetailsList;
    }

}
