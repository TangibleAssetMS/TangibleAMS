package asm.com.dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import asm.com.dbHelper.DbHelper;
import asm.com.pojos.Account;
import asm.com.pojos.Department;
import asm.com.pojos.Employee;

/**
 * @author Lwandle
 *
 */
public class EmployeeDao {
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	
	//for saving Employee
	public void saveEmployee(Employee employee){
		emf = DbHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
	}
	public Employee searchEmployee(Long id){
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Employee employee=em.find(Employee.class,id);
		return employee;
	}
	//for deleting Employee
	public void deleteEmployee(Long empId){
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Employee employee=em.find(Employee.class,empId);
		em.remove(employee);
		em.getTransaction().commit();
		em.close();
	}
	
	//for updating Employee
				public void updateEmployee(long empId,String empIDNum, String empName,
						String empSurname, String empTitle, Date birthDate,
						String address, String city, String homePhone, String cellPhone,
						String email, String role, Department department,
						Account account) 
						{
	
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Employee employee=em.find(Employee.class,empId);
		employee.setEmpName(empName);
		employee.setEmpSurname(empSurname);
		employee.setEmpTitle(empTitle);
		employee.setAddress(address);
		employee.setEmail(email);
		employee.setRole(role);
		
		account =em.find(Account.class,empId);
		em.remove(account);
		
		department =em.find(Department.class,empId);
		em.remove(department);
		
		employee.setDepartment(department);
		employee.setAccount(account);
		
		em.getTransaction().commit();
		em.close();
	}

	//for displaying Employee List
		public List<Employee>listEmployee(){
        emf=DbHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<Employee> query=em.createQuery("Select b from Employee b",Employee.class);
        List<Employee> employeeList=query.getResultList();
        return employeeList;
    }

}
