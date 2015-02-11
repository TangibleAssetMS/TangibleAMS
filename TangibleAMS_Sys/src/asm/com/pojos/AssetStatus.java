package asm.com.pojos;
import java.util.List;
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
@Table(name = "AssetStatus")
public class AssetStatus {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "assetStatusId")
	private long assetStatusId;
	
	@Column(name="status_Name")
	private String statusName;
	//@XmlAttribute
	@Column(name="_description")
	private String description;
	

	@OneToMany(mappedBy = "assetstatus",cascade = CascadeType.ALL)
	private Set<Asset>asset;
	
	public AssetStatus()
	{}
	
	public AssetStatus(String statusName, String description, Set<Asset> asset) {
		super();
		this.statusName = statusName;
		this.description = description;
		this.asset = asset;
	}
	public String getStatusName() {
		return statusName;
	}
	/**
	 * @param statusName the statusName to set
	 */
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Asset> getAsset() {
		return asset;
	}

	public void setAsset(Set<Asset> asset) {
		this.asset = asset;
	}

	public long getAssetStatusId() {
		return assetStatusId;
	}

	public void setAssetStatusId(long assetStatusId) {
		this.assetStatusId = assetStatusId;
	}
	
	
	
}
