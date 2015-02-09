/*package asm.com.pojos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity  
@Table(name = "Category")
public class Category {


		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="number_OrCode")
		private long numberOrCode;
		//@XmlAttribute
		@Column(name="category_Name")
		private String categoryName;
		//@XmlAttribute
		@Column(name="_description")
		private String description;
		
		//Relationships
		@OneToMany()
		private List<Asset> asset;

		public Category(String categoryName, String description,List<Asset> asset) {
			super();
			this.categoryName = categoryName;
			this.description = description;
			this.asset = asset;
		}

		public long getNumberOrCode() {
			return numberOrCode;
		}

		public void setNumberOrCode(long numberOrCode) {
			this.numberOrCode = numberOrCode;
		}

		public String getCategoryName() {
			return categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<Asset> getAsset() {
			return asset;
		}

		public void setAsset(List<Asset> asset) {
			this.asset = asset;
		}
		
}
*/