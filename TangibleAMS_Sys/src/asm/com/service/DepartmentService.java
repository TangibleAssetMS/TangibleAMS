package asm.com.service;

import java.sql.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jpahiber.dao.CustomerDao;
import com.jpahiber.pojos.Customer;

import asm.com.dao.DepartmentDao;
import asm.com.dao.EmployeeDao;
import asm.com.pojos.Account;
import asm.com.pojos.Department;
import asm.com.pojos.Employee;

@Path("/Department")
public class DepartmentService {

	DepartmentDao deptDao = null;
	
	
	@Path("/list")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Department> findAll() {
		deptDao = new DepartmentDao();
		return  deptDao.listDepartments();
	}
	@POST
	@Path("/SaveDepartment")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Department addDepartment(Department dept){
	deptDao = new DepartmentDao();
	deptDao.saveDepartment(dept);
	return dept;		
	}
	
	
	//updating
	
		@PUT
		@Path("{id}")
		@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	
		
		public void update(@PathParam("department_Id") long empId,@PathParam("empIDNum") String empIDNum,@PathParam("empName") String empName,@PathParam("empSurname") 
        String empSurname,@PathParam("empTitle") String empTitle,@PathParam("birthDate") Date birthDate,
        @PathParam("address")String address,@PathParam("city")String city,
        @PathParam("homePhone")String homePhone,@PathParam("cellPhone")String cellPhone,
        @PathParam("email")String email,@PathParam("role")String role,
        @PathParam("department")Department department,@PathParam("account")Account account){
		
//			(String departmentName, String abbreviationName,
//					String description)
			
			empDoa = new EmployeeDao();

			empDoa.updateEmployee(empId, empIDNum, empName, empSurname, empTitle, birthDate, address, city, homePhone, cellPhone, email, role, department,account);
		}
		//
		//for deleting
		
		@DELETE 
		@Path("{id}")
		@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
		public void remove(@PathParam("empId") Long empId) {
			empDoa = new EmployeeDao();
			empDoa.deleteEmployee(empId);
		}

		
		
	
}
