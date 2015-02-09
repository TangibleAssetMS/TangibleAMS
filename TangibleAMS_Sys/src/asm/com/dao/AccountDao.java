 package asm.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import asm.com.dbHelper.DbHelper;
import asm.com.pojos.Account;
import asm.com.pojos.Employee;

/**
 * @author Lwandle
 *
 */
public class AccountDao {
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for saving an Employee Account
	public void saveAccount(Account account){
		emf = DbHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(account);
		em.getTransaction().commit();
		em.close();
	}
	public Account searchAccount(Long id){
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Account account=em.find(Account.class,id);
		return account;
	}
	
	
	//for updating
	
			
				
				public void updateAccount(Employee employee, String username, String password,
						String role, boolean isActive) 
						{
	
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Account account=em.find(Account.class,employee.getEmpId());
		account.setUsername(username);
		account.setPassword(password);
		account.setRole(role);
		account.setActive(isActive);
		
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<Account>listAccounts(){
        emf=DbHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<Account> query=em.createQuery("Select b from Account b",Account.class);
        List<Account> accountList=query.getResultList();
        return accountList;
    }

}
