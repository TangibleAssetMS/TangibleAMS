package asm.com.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import asm.com.dbHelper.DbHelper;
import asm.com.pojos.Department;
import asm.com.pojos.Employee;

/**
 * @author Lwandle
 *
 */
public class DepartmentDao {
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for adding
	public void saveDepartment(Department department){
		emf = DbHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(department);
		em.getTransaction().commit();
		em.close();
	}
	public Department search(Long id){
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Department department=em.find(Department.class,id);
		return department;
	}
	//for deleting
	public void deleteDepartment(Long id){
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Department department=em.find(Department.class,id);
		em.remove(department);
		em.getTransaction().commit();
		em.close();
	}
	
	//for updating
	
			
				
				public void updateDepartment(long id, String departmentName,
						String abbreviationName, String description, Set<Employee> employee) 
						{
	
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Department department=em.find(Department.class,id);
		
		department.setDepartmentName(departmentName);
		department.setAbbreviationName(abbreviationName);
		department.setDescription(description);
		department.setEmployee(employee);
		
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<Department>listDepartments(){
        emf=DbHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<Department> query=em.createQuery("Select b from Department b",Department.class);
        List<Department> departmentList=query.getResultList();
        return departmentList;
    }

}
