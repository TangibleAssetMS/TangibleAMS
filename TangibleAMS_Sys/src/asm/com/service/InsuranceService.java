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

import asm.com.dao.InsuranceDao;
import asm.com.pojos.Asset;
import asm.com.pojos.Insurance;


public class InsuranceService {

InsuranceDao insureDao = null;
	
	
	@Path("/list")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Insurance> findAll() {
		insureDao = new InsuranceDao();
		return  insureDao.listInsurance();
	}
	@POST
	@Path("/SaveInsurance")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Insurance addInsurance(Insurance insure){
	insureDao = new InsuranceDao();
	insureDao.saveInsurance(insure);
	return insure;		
	}
	
	
	//updating
	
		@PUT
		@Path("{id}")
		@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	
		
		public void update(@PathParam("insurerId") int insurerId,@PathParam("insureName") String insureName,@PathParam("webSiteLink") String webSiteLink,@PathParam("contactName")String contactName, 
        @PathParam("phone")long phone,@PathParam("address")String address,@PathParam("city")String city,@PathParam("email")String email,@PathParam("fax")long fax,@PathParam("description")String description,@PathParam("asset")Set<Asset> asset){

			insureDao = new InsuranceDao();
			insureDao.updateInsurance(insurerId, insureName, webSiteLink, contactName, phone, address, city, email, fax, description, asset);
		}

		//
		//for deleting
		
		@DELETE 
		@Path("{id}")
		@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
		public void remove(@PathParam("insurerId") int insurerId) {
			insureDao = new InsuranceDao();
			insureDao.deleteInsurance(insurerId);
		}

}
