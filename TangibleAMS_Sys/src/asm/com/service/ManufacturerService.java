package asm.com.service;

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

import asm.com.dao.ManufacturerDao;
import asm.com.pojos.Asset;
import asm.com.pojos.Invoice;
import asm.com.pojos.Manufacturer;


public class ManufacturerService {
	
	ManufacturerDao manufactDao = null;
	
	
	@Path("/list")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Manufacturer> findAll() {
		manufactDao = new ManufacturerDao();
		return  manufactDao.listManufacturer();
	}
	@POST
	@Path("/SaveManufacturer")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Manufacturer addDepartment(Manufacturer manuf){
		manufactDao = new ManufacturerDao();
		manufactDao.saveManufacturer(manuf);
	return manuf;		
	}
	
	
	//updating
	
		@PUT
		@Path("{id}")
		@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	
		
		public void update(@PathParam("manufacturerId") long manufacturerId,@PathParam("manuFacturerName") String manuFacturerName,@PathParam("webSiteLink") String webSiteLink,@PathParam("contactName")String contactName, 
        @PathParam("phone")Integer phone,@PathParam("address")String address,@PathParam("city")String city,@PathParam("email")String email,@PathParam("fax")Integer fax,@PathParam("description")String description,@PathParam("asset")Set<Asset> asset,@PathParam("invoice")Set<Invoice> invoice){

			manufactDao = new ManufacturerDao();
			manufactDao.updateManufacturer(manufacturerId, manuFacturerName,webSiteLink,contactName,phone,address, city, email,fax,description,asset,invoice);
		}
		
		//
		//for deleting
		
		@DELETE 
		@Path("{id}")
		@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
		public void remove(@PathParam("manufacturerId") Long manufacturerId) {
			manufactDao = new ManufacturerDao();
			manufactDao.deleteManufacturer(manufacturerId);
			
		}

}
