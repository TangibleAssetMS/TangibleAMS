/*package asm.com.pojos;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity  
@Table(name = "AssetStatus")
public class AssetStatus {
 

	@Id
	@OneToMany()
	@JoinColumn(name="asset_fk")
	private List<Asset> asset;
	
	
	
	@Column(name="status_Name")
	private String statusName;
	//@XmlAttribute
	@Column(name="_description")
	private String description;
	
	public AssetStatus(List<Asset> asset, String statusName, String description) {
		super();
		this.asset = asset;
		this.statusName = statusName;
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
	 * @return the statusName
	 *//*
	public String getStatusName() {
		return statusName;
	}
	*//**
	 * @param statusName the statusName to set
	 *//*
	public void setStatusName(String statusName) {
		this.statusName = statusName;
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
	
	
	
}
*/