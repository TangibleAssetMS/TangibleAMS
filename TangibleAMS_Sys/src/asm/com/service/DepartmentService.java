package asm.com.service;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import asm.com.dao.DepartmentDao;
import asm.com.dao.EmployeeDao;
import asm.com.pojos.Account;
import asm.com.pojos.Department;
import asm.com.pojos.Employee;
import asm.com.pojos.Room;

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
	
		
		public void update(@PathParam("department_Id") long department_Id,@PathParam("departmentName") String departmentName,@PathParam("abbreviationName") String abbreviationName,@PathParam("description")String description, 
        @PathParam("employee")Set<Employee> employee,@PathParam("room")Set<Room> room){

			deptDao = new DepartmentDao();
			deptDao.updateDepartment(department_Id, departmentName, abbreviationName, description, employee, room);
		}
		//
		//for deleting
		
		@DELETE 
		@Path("{id}")
		@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
		public void remove(@PathParam("department_Id") Long department_Id) {
			deptDao = new DepartmentDao();
			deptDao.deleteDepartment(department_Id);
		}

		
		
	
}
