/*package asm.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import asm.com.dbHelper.DbHelper;
import asm.com.pojos.Category;

public class CategoryDao {
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for saving an Employee Account
	public void saveCategory(Category category){
		emf = DbHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(category);
		em.getTransaction().commit();
		em.close();
	}
	public Category searchCategory(Long id){
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Category category=em.find(Category.class,id);
		return category;
	}
	
	
	//for updating
	
			
				
				public void updateCategory(long id,String categoryName, String description) 
						{
	
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Category category=em.find(Category.class,id);
		category.setCategoryName(categoryName);
		category.setDescription(description);
		
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<Category>listCategory(){
        emf=DbHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<Category> query=em.createQuery("Select b from Category b",Category.class);
        List<Category> categoryList=query.getResultList();
        return categoryList;
    }

}
*/