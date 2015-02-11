package asm.com.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity  
@Table(name = "invoiceDetails")
public class AssetinvoiceDetails {

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
	@ManyToOne()
	@JoinColumn(name="asset_Id")
	private Asset asset;
	
	@ManyToOne()
	@JoinColumn(name="tblInvoice_Id")
	private Invoice invoice;

	public AssetinvoiceDetails() {
		super();
	}

	public AssetinvoiceDetails(long quantity,
			float unitPrice, String description, Asset asset, Invoice invoice) {
		super();
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.description = description;
		this.asset = asset;
		this.invoice = invoice;
	}

	public long getInvoiceDetails_id() {
		return invoiceDetails_id;
	}

	public void setInvoiceDetails_id(long invoiceDetails_id) {
		this.invoiceDetails_id = invoiceDetails_id;
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

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	

}
