package asm.com.pojos;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity  
@Table(name = "Department")  
public class Department {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="departmentId")
	private long department_Id;
	
	
	@Column(name="department_Name")
	private String departmentName;


	@Column(name="abbreviation_Name")
	private String abbreviationName;


	@Column(name="_description")
	private String description;
	
	//Relationships
	@OneToMany(mappedBy = "department")
	private List<Employee> employee;
	
	@OneToMany(mappedBy = "department")
	private Set<Room> room;



	public Department(String departmentName, String abbreviationName,
			String description) {
		super();
		this.departmentName = departmentName;
		this.abbreviationName = abbreviationName;
		this.description = description;
		

	}
	public Department()
	{
		
	}

	public Set<Room> getRoom() {
		return room;
	}

	public void setRoom(Set<Room> room) {
		this.room = room;
	}

	/**
	 * @return the department_Id
	 */
	public long getDepartment_Id() {
		return department_Id;
	}

	/**
	 * @param department_Id the department_Id to set
	 */
	public void setDepartment_Id(long department_Id) {
		this.department_Id = department_Id;
	}

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return the abbreviationName
	 */
	public String getAbbreviationName() {
		return abbreviationName;
	}

	/**
	 * @param abbreviationName the abbreviationName to set
	 */
	public void setAbbreviationName(String abbreviationName) {
		this.abbreviationName = abbreviationName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the employee
	 */
	public List<Employee> getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	
}

