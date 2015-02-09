/*package asm.com.dao;


import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import asm.com.dbHelper.DbHelper;
import asm.com.pojos.Asset;
import asm.com.pojos.AssetStatus;

public class AssetStatusDao {
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for saving an Employee Account
	public void saveAssetStatus(AssetStatus assetStatus){
		emf = DbHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(assetStatus);
		em.getTransaction().commit();
		em.close();
	}
	public AssetStatus searchAssetstatus(Long id){
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		AssetStatus assetStatus=em.find(AssetStatus.class,id);
		return assetStatus;
	}
	
	
	//for updating
	
			
				
				public void updateAsset(long id,List<Asset> asset, String statusName, String description) 
						{
	
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		AssetStatus assetstatus=em.find(AssetStatus.class,id);
		assetstatus.setAsset(asset);
		assetstatus.setDescription(description);
		assetstatus.setStatusName(statusName);
		
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<AssetStatus>listAssetStatus(){
        emf=DbHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<AssetStatus> query=em.createQuery("Select b from AssetStatus b",AssetStatus.class);
        List<AssetStatus> assetstatusList=query.getResultList();
        return assetstatusList;
    }

}
*/