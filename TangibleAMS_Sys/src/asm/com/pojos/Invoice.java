package asm.com.pojos;


import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@NamedQueries({
  @NamedQuery(name = "getInvoiceById", query = "from Invoice inv where inv.invoiceId = :invoiceId"),
  @NamedQuery(name = "selectAllInvoices", query = "from Invoice inv") })
@Entity
@Table(name = "tblInvoice")
@XmlRootElement
public class Invoice implements Serializable {

 private static final long serialVersionUID = 1L;

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 @Column(name = "tblInvoice_Id")
 private int invoiceId;

 @Column(name = "tblInvoice_Order_Date")
 private Date orderDate;

 @Column(name = "tblIvoice_Delivery_Date")
 private Date deliveryDate;

 @Column(name = "tblInvoice_Description")
 private String invoiceDescription;

 @OneToMany()
 private Set<AssetinvoiceDetails> assetinvoiceDetails;
	
 @ManyToOne()
 @JoinColumn(name="manufacturer")
 private Manufacturer manufacturer;
 
 public Invoice() {}



 /**
 * @param invoiceId
 * @param orderDate
 * @param deliveryDate
 * @param invoiceDescription
 * @param asset
 * @param manufacturer
 */


/**
 * @return the manufacturer
 */
public Manufacturer getManufacturer() {
	return manufacturer;
}



public Invoice(Date orderDate, Date deliveryDate, String invoiceDescription,
		Set<AssetinvoiceDetails> assetinvoiceDetails, Manufacturer manufacturer) {
	super();
	this.orderDate = orderDate;
	this.deliveryDate = deliveryDate;
	this.invoiceDescription = invoiceDescription;
	this.assetinvoiceDetails = assetinvoiceDetails;
	this.manufacturer = manufacturer;
}



/**
 * @param manufacturer the manufacturer to set
 */
public void setManufacturer(Manufacturer manufacturer) {
	this.manufacturer = manufacturer;
}



public int getInvoiceId() {
  return invoiceId;
 }

 public void setInvoiceId(int invoiceId) {
  this.invoiceId = invoiceId;
 }

 public Date getOrderDate() {
  return orderDate;
 }

 public void setOrderDate(Date orderDate) {
  this.orderDate = orderDate;
 }

 public Date getDeliveryDate() {
  return deliveryDate;
 }

 public void setDeliveryDate(Date deliveryDate) {
  this.deliveryDate = deliveryDate;
 }

 public String getInvoiceDescription() {
  return invoiceDescription;
 }

 public void setInvoiceDescription(String invoiceDescription) {
  this.invoiceDescription = invoiceDescription;
 }



public Set<AssetinvoiceDetails> getAssetinvoiceDetails() {
	return assetinvoiceDetails;
}



public void setAssetinvoiceDetails(Set<AssetinvoiceDetails> assetinvoiceDetails) {
	this.assetinvoiceDetails = assetinvoiceDetails;
}

 
}
