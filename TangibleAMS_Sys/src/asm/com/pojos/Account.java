package asm.com.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity  
@Table(name = "Account")  
public class Account implements Serializable{ 

	////changed!!
	

	@Id
	@OneToOne()
	@JoinColumn(name="emp_Id")
	private Employee employee;

	@Column(name="User_name")
	private String Username;


	@Column(name="_Password")
	private String Password;


	@Column(name="_role")
	private String role;	
	
	@Column(name="isActive")
	private boolean isActive;


	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Account()
	{
		
	}

	public Account(Employee employeeId, String username, String password,
			String role, boolean isActive) {
		super();
		this.employee = employeeId;
		Username = username;
		Password = password;
		this.role = role;
		this.isActive = isActive;
	}


	/**
	 * @return the username
	 */
	public String getUsername() {
		return Username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		Username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}

	/**
	 * @return the employeeId
	 */
	public Employee getEmployeeId() {
		return employee;
	}


	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(Employee employeeId) {
		this.employee = employeeId;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	

	
}
