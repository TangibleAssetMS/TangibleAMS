
package asm.com.pojos;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import asm.com.dao.AccountDao;
import asm.com.dao.DepartmentDao;
import asm.com.dao.EmployeeDao;
import asm.com.dao.RoomDao;

/**
 * @author Lwandle
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TAMS");
		EntityManager em = emf.createEntityManager();
		
		/*AssetDao assetdao=null;
		
		AssetStatusDao assetstatusdao=null;
		ManufacturerDao manufacturerdao=null;
		InsuranceDao insurancedao=null;
		InvoiceDetailsDao invoicedetailsdao=null;
		CategoryDao categorydao=null;
		
		InvoiceDao invoiceDao=null;
		AccountDao accountdao=null;
		*/
		RoomDao roomdao=new RoomDao();
		EmployeeDao employeedao=new EmployeeDao();
		
		long id=1;
		
		/*Room room=null;
		AssetStatus assetstatus=null;
		Manufacturer manufacturer=null;
		List<Insurance> insurance=null;
		List<invoiceDetails> invoicedetails=null;
		List<Category> category=null;
		Invoice invoice=null;
		
		List<Invoice> invoicelist=null;
		List<Asset> assetlist=null;*/
		
		Employee emp=null;
		
		DepartmentDao deptDao=new DepartmentDao();
		AccountDao accdao=new AccountDao();
		
		Date d = new Date(14-10-2014);
		
		List<Employee> emplist=null;
		
		
		/*String departmentName, String abbreviationName,
			String description, List<Employee> employee, Room room*/
		Department department=new Department("Information Technology",
				"IT", "Data Management");
		
		
		deptDao.saveDepartment(department);
		
		Department dep=em.find(Department.class,id);
		Room room_=new Room("RN-O1","StoreRoom",dep);
		/*room_.setRoomName("RN-O1");
		room_.setDescription("StoreRoom");
		room_.setDepartment(dep);*/
		roomdao.saveRoom(room_);

		
		emp=new Employee("9098765432122"," Yethaba",
				"Duma", "Mr", d,
				"BB649 income Umlazi", "Durban", "012345733", "021223445",
				"yethabalwandle@gmail.com", "Admin", department);
		employeedao.saveEmployee(emp);
		
		emp=employeedao.searchEmployee(id);
		Account account=new Account(emp,"yethabalwandle", "lwandle@2",
				"Admin", true);
		accdao.saveAccount(account);
		
		
		/*room, assetstatus, manufacturer, invoicedetails, insurance, category*/
	
		
	/*		
		
		 manufacturer=new Manufacturer("Samsung","www.samsung.co.za", "Marketing",033333333, "qwert",
				"CapetoParrow", "samsung@gmail.com", 03245567, "supplier", invoicelist);
		 
			emplist = employeedao.listEmployee();
			
		room=roomdao.searchRoom(id);
			
			
			assetstatus=assetstatusdao.searchAssetstatus(id);
			
			
			manufacturer = manufacturerdao.searchManufacturer(id);
			
			
			insurance =insurancedao.listInsurance();
			
			invoicelist=invoiceDao.listInvoice();
			
			
			invoicedetails=invoicedetailsdao.listinvoiceDetails();
			
			
			category=categorydao.listCategory();		 
		 
		
		Asset ass=null;
				
		 ass = new Asset("assetName", "assetModelNo", "serialNum",	123,"Red", 322,	"I dont know", 8, d,78.0, 898, d,"monthly",room, assetstatus, manufacturer, invoicedetails, insurance);
		ass.setAssetstatus(assetstatus);
		ass.setInvoicedetails(invoicedetails);
		ass.setInsurance(insurance);
		ass.setCategory(category);		
		
		assetdao.saveAsset(ass);
		
		
		
		Category cat=new Category("Elec","PC",assetlist);
		categorydao.saveCategory(cat);
		
		assetlist=assetdao.listAsset();
		
		assetstatus=new AssetStatus(assetlist, "In-use", "In-use by IT department");
		assetstatusdao.saveAssetStatus(assetstatus);*/

	}

}
