package asm.com.pojos;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity  
@Table(name = "Insurance")
public class Insurance { 

	//@XmlAttribute
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="insurerId")
	private int insurerId;
	
	//@XmlAttribute
	@Column(name="insure_Name")
	private String insureName;
	//@XmlAttribute
	@Column(name="webSite_Link")
	private String webSiteLink;
	//@XmlAttribute
	@Column(name="contact_Name")
	private String contactName;
	//@XmlAttribute
	@Column(name="_phone")
	private long phone;
	//@XmlAttribute
	@Column(name="address")
	private String address;
	//@XmlAttribute
	@Column(name="_city")
	private String city;
	//@XmlAttribute
	@Column(name="_email")
	private String email;
	//@XmlAttribute
	@Column(name="_fax")
	private long fax;
	//@XmlAttribute
	@Column(name="_description")
	private String description;
	
	//Relationships
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "insurance")
	private Set<Asset> asset;

	

	/**
	 * @param insureName
	 * @param webSiteLink
	 * @param contactName
	 * @param phone
	 * @param address
	 * @param city
	 * @param email
	 * @param fax
	 * @param description
	 * @param asset
	 */
	
	public Insurance()
	{}
	

	public Insurance(String insureName, String webSiteLink, String contactName,
			long phone, String address, String city, String email, long fax,
			String description, Set<Asset> asset) {
		super();
		this.insureName = insureName;
		this.webSiteLink = webSiteLink;
		this.contactName = contactName;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.email = email;
		this.fax = fax;
		this.description = description;
		this.asset = asset;
	}

	public int getInsurerId() {
		return insurerId;
	}

	public void setInsurerId(int insurerId) {
		this.insurerId = insurerId;
	}


	public String getInsureName() {
		return insureName;
	}

	public void setInsureName(String insureName) {
		this.insureName = insureName;
	}

	public String getWebSiteLink() {
		return webSiteLink;
	}

	public void setWebSiteLink(String webSiteLink) {
		this.webSiteLink = webSiteLink;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getFax() {
		return fax;
	}

	public void setFax(long fax) {
		this.fax = fax;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Asset> getAsset() {
		return asset;
	}


	public void setAsset(Set<Asset> asset) {
		this.asset = asset;
	}

	
	
}
