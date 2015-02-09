/*package asm.com.pojos;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

*//**
 * @author Lwandle
 *
 *//*

@Entity  
@Table(name = "Manufacturer")
public class Manufacturer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name="manufacturer_Id")
	private long manufacturerId;
	
	@Column(name ="manuFacturerName")
	private String manuFacturerName;
	
	@Column(name ="webSiteLink")
	private String webSiteLink;
	
	@Column(name="contactName")
	private String contactName;
	
	@Column(name="phone")
	private Integer phone;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="email")
	private String email;
	
	@Column(name="fax")
	private Integer fax;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy = "Manufacturer")
	private List<Asset> asset;
	
	@OneToMany(mappedBy = "Manufacturer")
	private List<Invoice> invoice;

	*//**
	 * @param manufacturerId
	 * @param manuFacturerName
	 * @param webSiteLink
	 * @param contactName
	 * @param phone
	 * @param address
	 * @param city
	 * @param email
	 * @param fax
	 * @param description
	 * @param asset
	 * @param invoice
	 *//*
	public Manufacturer(String manuFacturerName,
			String webSiteLink, String contactName, Integer phone, String address,
			String city, String email, Integer fax, String description,
			 List<Invoice> invoice) {
		super();
		
		this.manuFacturerName = manuFacturerName;
		this.webSiteLink = webSiteLink;
		this.contactName = contactName;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.email = email;
		this.fax = fax;
		this.description = description;
		
		this.invoice = invoice;
	}

	*//**
	 * @return the manufacturerId
	 *//*
	public long getManufacturerId() {
		return manufacturerId;
	}

	*//**
	 * @param manufacturerId the manufacturerId to set
	 *//*
	public void setManufacturerId(long manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	*//**
	 * @return the manuFacturerName
	 *//*
	public String getManuFacturerName() {
		return manuFacturerName;
	}

	*//**
	 * @param manuFacturerName the manuFacturerName to set
	 *//*
	public void setManuFacturerName(String manuFacturerName) {
		this.manuFacturerName = manuFacturerName;
	}

	*//**
	 * @return the webSiteLink
	 *//*
	public String getWebSiteLink() {
		return webSiteLink;
	}

	*//**
	 * @param webSiteLink the webSiteLink to set
	 *//*
	public void setWebSiteLink(String webSiteLink) {
		this.webSiteLink = webSiteLink;
	}

	*//**
	 * @return the contactName
	 *//*
	public String getContactName() {
		return contactName;
	}

	*//**
	 * @param contactName the contactName to set
	 *//*
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	*//**
	 * @return the phone
	 *//*
	public Integer getPhone() {
		return phone;
	}

	*//**
	 * @param phone the phone to set
	 *//*
	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	*//**
	 * @return the address
	 *//*
	public String getAddress() {
		return address;
	}

	*//**
	 * @param address the address to set
	 *//*
	public void setAddress(String address) {
		this.address = address;
	}

	*//**
	 * @return the city
	 *//*
	public String getCity() {
		return city;
	}

	*//**
	 * @param city the city to set
	 *//*
	public void setCity(String city) {
		this.city = city;
	}

	*//**
	 * @return the email
	 *//*
	public String getEmail() {
		return email;
	}

	*//**
	 * @param email the email to set
	 *//*
	public void setEmail(String email) {
		this.email = email;
	}

	*//**
	 * @return the fax
	 *//*
	public Integer getFax() {
		return fax;
	}

	*//**
	 * @param fax the fax to set
	 *//*
	public void setFax(Integer fax) {
		this.fax = fax;
	}

	*//**
	 * @return the description
	 *//*
	public String getDescription() {
		return description;
	}

	*//**
	 * @param description the description to set
	 *//*
	public void setDescription(String description) {
		this.description = description;
	}

	*//**
	 * @return the asset
	 *//*
	public List<Asset> getAsset() {
		return asset;
	}

	*//**
	 * @param asset the asset to set
	 *//*
	public void setAsset(List<Asset> asset) {
		this.asset = asset;
	}

	*//**
	 * @return the invoice
	 *//*
	public List<Invoice> getInvoice() {
		return invoice;
	}

	*//**
	 * @param invoice the invoice to set
	 *//*
	public void setInvoice(List<Invoice> invoice) {
		this.invoice = invoice;
	}
	
	

}
*/