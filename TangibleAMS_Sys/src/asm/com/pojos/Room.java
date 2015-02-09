package asm.com.pojos;

import java.io.Serializable;
import java.nio.MappedByteBuffer;
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
@Table(name = "Room")  
public class Room {


		//@XmlAttribute
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="roomId")
		private long roomId;
		
		
		@Column(name="room_Name")
		private String roomName;


		@Column(name="_description")
		private String description;
		
		//Relationships
		
		@ManyToOne()
		@JoinColumn(name="department_id")
		private Department department;

		@OneToMany(mappedBy = "room",cascade = CascadeType.ALL)
		private Set<Asset>asset;
		
		public Room()
		{}

		public Room(String roomName, String description,Department department) {
			super();
			this.roomName = roomName;
			this.description = description;
			this.department = department;
		}

		
		public String getRoomName() {
			return roomName;
		}

		public void setRoomName(String roomName) {
			this.roomName = roomName;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Department getDepartment() {
			return department;
		}

		public void setDepartment(Department department) {
			this.department = department;
		}

		public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public Set<Asset> getAsset() {
		return asset;
	}

	public void setAsset(Set<Asset> asset) {
		this.asset = asset;
	}

		
}
