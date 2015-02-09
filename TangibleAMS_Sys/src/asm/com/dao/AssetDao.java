/*package asm.com.dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import asm.com.dbHelper.DbHelper;
import asm.com.pojos.Asset;
*//**
 * @author Lwandle
 *
 *//*
public class AssetDao {
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for saving an Employee Account
	public void saveAsset(Asset asset){
		emf = DbHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(asset);
		em.getTransaction().commit();
		em.close();
	}
	public Asset searchAsset(Long id){
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Asset asset=em.find(Asset.class,id);
		return asset;
	}
	
	
	//for updating
	
			
				
				public void updateAsset(long id, float currentValue,
						String description, int numberOfYearToUse, float valueToSellWaste, Date warrantyExpire,
						String warrantlyType) 
						{
	
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Asset asset=em.find(Asset.class,id);
		asset.setCurrentValue(currentValue);
		asset.setDescription(description);
		asset.setNumberOfYearToUse(numberOfYearToUse);
		asset.setValueToSellWaste(valueToSellWaste);
		asset.setWarrantyExpire(warrantyExpire);
		asset.setWarrantlyType(warrantlyType);
		
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<Asset>listAsset(){
        emf=DbHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<Asset> query=em.createQuery("Select b from Asset b",Asset.class);
        List<Asset> assetList=query.getResultList();
        return assetList;
    }
}
*/