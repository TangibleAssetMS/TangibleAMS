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

import asm.com.dao.AssetDao;
import asm.com.pojos.Account;
import asm.com.pojos.Asset;
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
		
		
		
		
		
		public void update(@PathParam("assetId") long assetId,@PathParam("assetName") String assetName,@PathParam("assetModelNo") String assetModelNo,@PathParam("serialNum") 
        String serialNum,@PathParam("amountPaid") float amountPaid,@PathParam("color") String color,
        @PathParam("currentValue") float currentValue,@PathParam("description")String description,
        @PathParam("numberOfYearToUse") int numberOfYearToUse,@PathParam("purchasedDate") Date purchasedDate,
        @PathParam("size") double size,@PathParam("valueToSellWaste") float valueToSellWaste,
        @PathParam("warrantyExpire") Date warrantyExpire,@PathParam("warrantlyType") String warrantlyType,  @PathParam("room") Room room,@PathParam("assetstatus") AssetStatus assetstatus,
        @PathParam("manufacturer") Manufacturer manufacturer,@PathParam("invoice") Invoice invoice,
        @PathParam("insurance") Insurance insurance,@PathParam("category") Category category){
		
	
			
			assDoa = new AssetDao();

			assDoa.updateAsset(assetId, currentValue, description, numberOfYearToUse, valueToSellWaste, warrantyExpire, warrantlyType);
			
			//empDoa.updateEmployee(empId, empIDNum, empName, empSurname, empTitle, birthDate, address, city, homePhone, cellPhone, email, role, department,account);
		}

		//for deleting
		
		@DELETE 
		@Path("{id}")
		@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
		public void remove(@PathParam("assetId") Long assetId) {
			assDoa = new AssetDao();
//			assDoa.deleteAsset(assetId);
		}

		
	//	
	//for retrieving
		
		 @GET
		 @Path("/Retrieve")
		 @Produces({ MediaType.APPLICATION_JSON})
		 public List<Asset> findAll() {
			 assDoa = new AssetDao();
		  return assDoa.listAsset();
		 }

}
