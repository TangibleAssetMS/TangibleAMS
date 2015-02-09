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

import asm.com.pojos.Account;
import asm.com.pojos.AssetStatus;
import asm.com.pojos.Category;
import asm.com.pojos.Department;
import asm.com.pojos.Insurance;
import asm.com.pojos.Invoice;
import asm.com.pojos.Manufacturer;
import asm.com.pojos.Room;



public class AssetService {

	//adding
	AssetDao assDoa = null;

	@POST
	@Path("/SaveAsset")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Asset addAsset(Asset asset){
	//empDoa = new EmployeeDao(Employee);
		assDoa.saveAsset(asset);
	return asset;		
	}
		
		
	//updating
	
		@PUT
		@Path("{id}")
		@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
		
		public Asset(String assetName, String assetModelNo, String serialNum,
				float amountPaid, String color, float currentValue,
				String description, int numberOfYearToUse, Date purchasedDate,
				double size, float valueToSellWaste, Date warrantyExpire,
				String warrantlyType, Room room, AssetStatus assetstatus,
				Manufacturer manufacturer, Invoice invoice, Insurance insurance,
				Category category) {fYearToUse, float valueToSellWaste, Date warrantyExpire,
				String warrantlyType) 
		
		/*public void updateEmployee(long empId,String empIDNum, String empName,
				String empSurname, String empTitle, Date birthDate,
				String address, String city, String homePhone, String cellPhone,
				String email, String role, Department department,
				Account account) */
		
		public void update(@PathParam("asset_Id") long id,@PathParam("asset_Name") float currentValue,@PathParam("empName") String empName,@PathParam("empSurname") 
        String empSurname,@PathParam("empTitle") String empTitle,@PathParam("birthDate") Date birthDate,
        @PathParam("address")String address,@PathParam("city")String city,
        @PathParam("homePhone")String homePhone,@PathParam("cellPhone")String cellPhone,
        @PathParam("email")String email,@PathParam("role")String role,
        @PathParam("department")Department department,@PathParam("account")Account account){
		
		/*String adminName, String adminSurname,
	String adminEmail, String adminPassword, String adminIdNr*/
			
			empDoa = new EmployeeDao();

			empDoa.updateEmployee(empId, empIDNum, empName, empSurname, empTitle, birthDate, address, city, homePhone, cellPhone, email, role, department,account);
		}

		//for deleting
		
		@DELETE 
		@Path("{id}")
		@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
		public void remove(@PathParam("empId") Long empId) {
			empDoa = new EmployeeDao();
			empDoa.deleteEmployee(empId);
		}

		
		
	//for retrieving
		
		 @GET
		 @Path("/Retrieve")
		 @Produces({ MediaType.APPLICATION_JSON})
		 public List<Employee> findAll() {
		   empDoa = new EmployeeDao();
		  return empDoa.listEmployee();
		 }

}
