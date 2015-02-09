package asm.com.pojos;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity  
@Table(name = "Employee")  
public class Employee {
	
	//@XmlAttribute
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_Id")
	private long empId;


	@Column(name="empID_Num")
	private String empIDNum;


	@Column(name="emp_Name")
	private String empName;


	@Column(name="emp_Surname")
	private String empSurname;


	@Column(name="emp_Title")
	private String empTitle;


	@Column(name="Birth_Date")
	private Date BirthDate;


	@Column(name="_address")
	private String address;


	@Column(name="_city")
	private String city;


	@Column(name="home_Phone")
	private String homePhone;


	@Column(name="cell_Phone")
	private String cellPhone;


	@Column(name="_email")
	private String email;


	@Column(name="_role")
	private String role;
	
	
	
	//Relationships
		@ManyToOne()
		@JoinColumn(name="departmentId")
		private Department department;
		
		@OneToOne(mappedBy="employee")
		private Account account;
		
		public Employee()
		{
			
		}

		/**
		 * @param empId
		 * @param empIDNum
		 * @param empName
		 * @param empSurname
		 * @param empTitle
		 * @param birthDate
		 * @param address
		 * @param city
		 * @param homePhone
		 * @param cellPhone
		 * @param email
		 * @param role
		 * @param department
		 * @param account
		 */
		public Employee(String empIDNum,String empName,
				String empSurname, String empTitle, Date birthDate,
				String address, String city, String homePhone, String cellPhone,
				String email, String role, Department department) {
			super();
			
			this.empIDNum = empIDNum;
			this.empName = empName;
			this.empSurname = empSurname;
			this.empTitle = empTitle;
			BirthDate = birthDate;
			this.address = address;
			this.city = city;
			this.homePhone = homePhone;
			this.cellPhone = cellPhone;
			this.email = email;
			this.role = role;
			this.department = department;
		
		}

		/**
		 * @return the empId
		 */
		public long getEmpId() {
			return empId;
		}

		/**
		 * @param empId the empId to set
		 */
		public void setEmpId(long empId) {
			this.empId = empId;
		}

		/**
		 * @return the empIDNum
		 */
		public String getEmpIDNum() {
			return empIDNum;
		}

		/**
		 * @param empIDNum the empIDNum to set
		 */
		public void setEmpIDNum(String empIDNum) {
			this.empIDNum = empIDNum;
		}

		/**
		 * @return the empName
		 */
		public String getEmpName() {
			return empName;
		}

		/**
		 * @param empName the empName to set
		 */
		public void setEmpName(String empName) {
			this.empName = empName;
		}

		/**
		 * @return the empSurname
		 */
		public String getEmpSurname() {
			return empSurname;
		}

		/**
		 * @param empSurname the empSurname to set
		 */
		public void setEmpSurname(String empSurname) {
			this.empSurname = empSurname;
		}

		/**
		 * @return the empTitle
		 */
		public String getEmpTitle() {
			return empTitle;
		}

		/**
		 * @param empTitle the empTitle to set
		 */
		public void setEmpTitle(String empTitle) {
			this.empTitle = empTitle;
		}

		/**
		 * @return the birthDate
		 */
		public Date getBirthDate() {
			return BirthDate;
		}

		/**
		 * @param birthDate the birthDate to set
		 */
		public void setBirthDate(Date birthDate) {
			BirthDate = birthDate;
		}

		/**
		 * @return the address
		 */
		public String getAddress() {
			return address;
		}

		/**
		 * @param address the address to set
		 */
		public void setAddress(String address) {
			this.address = address;
		}

		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}

		/**
		 * @param city the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}

		/**
		 * @return the homePhone
		 */
		public String getHomePhone() {
			return homePhone;
		}

		/**
		 * @param homePhone the homePhone to set
		 */
		public void setHomePhone(String homePhone) {
			this.homePhone = homePhone;
		}

		/**
		 * @return the cellPhone
		 */
		public String getCellPhone() {
			return cellPhone;
		}

		/**
		 * @param cellPhone the cellPhone to set
		 */
		public void setCellPhone(String cellPhone) {
			this.cellPhone = cellPhone;
		}

		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}

		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
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
		 * @return the department
		 */
		public Department getDepartment() {
			return department;
		}

		/**
		 * @param department the department to set
		 */
		public void setDepartment(Department department) {
			this.department = department;
		}

		/**
		 * @return the account
		 */
		public Account getAccount() {
			return account;
		}

		/**
		 * @param account the account to set
		 */
		public void setAccount(Account account) {
			this.account = account;
		}
		

		
}
