package asm.com.pojos;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity  
@Table(name = "Asset")
public class Asset {

	//Asset RElationships
	//@XmlAttribute
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name="asset_Id")
	private long assetId;


	@Column(name="asset_Name")
	private String assetName;


	@Column(name="assetModel_No")
	private String assetModelNo;


	@Column(name="serial_Num")
	private String serialNum;


	@Column(name="amount_Paid")
	private float amountPaid;


	@Column(name="_color")
	private String color;


	@Column(name="currentValue")
	private float currentValue;


	@Column(name="_description")
	private String description;


	@Column(name="number_OfYearToUse")
	private int numberOfYearToUse;


	@Column(name="purchased_Date")
	private Date purchasedDate;


	@Column(name="size")
	private double size;


	@Column(name="value_ToSellWaste")
	private float valueToSellWaste;


	@Column(name="warranty_Expire")
	private Date warrantyExpire;


	@Column(name="warrantly_Type")
	private String warrantlyType;

	@OneToMany()
	 private Set<AssetinvoiceDetails> assetinvoiceDetails;
	
	//Relationships
	//joining Asset table with Room table
	@ManyToOne()
	@JoinColumn(name="roomId")
	private Room room;
		
	//joining Asset_status table with Asset table
	@ManyToOne()
	@JoinColumn(name="assetStatusId")
	private AssetStatus assetstatus;
	
	//joining Asset table with Manufacture table
	@ManyToOne()
	@JoinColumn(name="manufacturer_Id")
	private Manufacturer manufacturer;
			
	
	@ManyToOne()
	@JoinColumn(name ="insurerId")
	private Insurance insurance;

	@ManyToOne()
	@JoinColumn(name ="number_OrCode")
	private Category category;
		
	public Asset()
	{}
	
	public Asset(String assetName, String assetModelNo, String serialNum,
		float amountPaid, String color, float currentValue, String description,
		int numberOfYearToUse, Date purchasedDate, double size,
		float valueToSellWaste, Date warrantyExpire, String warrantlyType,
		Set<AssetinvoiceDetails> assetinvoiceDetails, Room room,
		AssetStatus assetstatus, Manufacturer manufacturer,
		Insurance insurance, Category category) {
	super();
	this.assetName = assetName;
	this.assetModelNo = assetModelNo;
	this.serialNum = serialNum;
	this.amountPaid = amountPaid;
	this.color = color;
	this.currentValue = currentValue;
	this.description = description;
	this.numberOfYearToUse = numberOfYearToUse;
	this.purchasedDate = purchasedDate;
	this.size = size;
	this.valueToSellWaste = valueToSellWaste;
	this.warrantyExpire = warrantyExpire;
	this.warrantlyType = warrantlyType;
	this.assetinvoiceDetails = assetinvoiceDetails;
	this.room = room;
	this.assetstatus = assetstatus;
	this.manufacturer = manufacturer;
	this.insurance = insurance;
	this.category = category;
	}

	public Set<AssetinvoiceDetails> getInvoiceDetails() {
		return assetinvoiceDetails;
	}
	
	public void setInvoiceDetails(Set<AssetinvoiceDetails> assetinvoiceDetails) {
		this.assetinvoiceDetails = assetinvoiceDetails;
	}

	public long getAssetId() {
		return assetId;
	}

	public void setAssetId(long assetId) {
		this.assetId = assetId;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetModelNo() {
		return assetModelNo;
	}

	public void setAssetModelNo(String assetModelNo) {
		this.assetModelNo = assetModelNo;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public float getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(float amountPaid) {
		this.amountPaid = amountPaid;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(float currentValue) {
		this.currentValue = currentValue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumberOfYearToUse() {
		return numberOfYearToUse;
	}

	public void setNumberOfYearToUse(int numberOfYearToUse) {
		this.numberOfYearToUse = numberOfYearToUse;
	}

	public Date getPurchasedDate() {
		return purchasedDate;
	}

	public void setPurchasedDate(Date purchasedDate) {
		this.purchasedDate = purchasedDate;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public float getValueToSellWaste() {
		return valueToSellWaste;
	}

	public void setValueToSellWaste(float valueToSellWaste) {
		this.valueToSellWaste = valueToSellWaste;
	}

	public Date getWarrantyExpire() {
		return warrantyExpire;
	}

	public void setWarrantyExpire(Date warrantyExpire) {
		this.warrantyExpire = warrantyExpire;
	}

	public String getWarrantlyType() {
		return warrantlyType;
	}

	public void setWarrantlyType(String warrantlyType) {
		this.warrantlyType = warrantlyType;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}


	/**
	 * @return the assetstatus
	 */
	public AssetStatus getAssetstatus() {
		return assetstatus;
	}

	/**
	 * @param assetstatus the assetstatus to set
	 */
	public void setAssetstatus(AssetStatus assetstatus) {
		this.assetstatus = assetstatus;
	}

	
	/**
	 * @return the manufacturer
	 */
	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}



	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}



	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}
	
	
	
}
