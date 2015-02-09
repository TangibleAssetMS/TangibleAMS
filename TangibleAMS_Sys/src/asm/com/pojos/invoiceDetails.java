/*package asm.com.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity  
@Table(name = "invoiceDetails")
public class invoiceDetails {

	//@XmlAttribute
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="invoiceDetails_id")
	private long invoiceDetails_id;
	
	@Column(name="_quantity")
	private long quantity;
	//@XmlAttribute
	@Column(name="unit_Price")
	private float unitPrice;
	//@XmlAttribute
	@Column(name="_description")
	private String description;
	
	//Relationships
	@OneToMany()
	@JoinColumn(name="asset_Id")
	Asset asset;

	

	*//**
	 * @param quantity
	 * @param unitPrice
	 * @param description
	 * @param asset
	 *//*
	public invoiceDetails(long quantity, float unitPrice, String description,
			Asset asset) {
		super();
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.description = description;
		this.asset = asset;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	
}
*/