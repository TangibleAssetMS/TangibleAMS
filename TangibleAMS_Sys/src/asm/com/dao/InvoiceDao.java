/*package asm.com.dao;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import asm.com.dbHelper.DbHelper;
import asm.com.pojos.Asset;
import asm.com.pojos.Invoice;
import asm.com.pojos.Manufacturer;

public class InvoiceDao {
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for saving an Employee Account
	public void saveInvoice(Invoice invoice){
		emf = DbHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(invoice);
		em.getTransaction().commit();
		em.close();
	}
	public Invoice searchInvoice(Long id){
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Invoice invoice=em.find(Invoice.class,id);
		return invoice;
	}
	
	
	//for updating
	
			
				
				public void updateInvoice(int invoiceId, Date orderDate, Date deliveryDate,
						String invoiceDescription, Set<Asset> asset, Manufacturer manufacturer) 
						{
	
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Invoice invoice=em.find(Invoice.class,invoiceId);
		invoice.setDeliveryDate(deliveryDate);
		invoice.setInvoiceDescription(invoiceDescription);
		invoice.setAsset(asset);
		invoice.setManufacturer(manufacturer);
		

		
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<Invoice>listInvoice(){
        emf=DbHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<Invoice> query=em.createQuery("Select b from Invoice b",Invoice.class);
        List<Invoice> InvoiceList=query.getResultList();
        return InvoiceList;
    }

}
*/