package asm.com.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import asm.com.dbHelper.DbHelper;
import asm.com.pojos.Department;
import asm.com.pojos.Room;

public class RoomDao {
	
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	//for saving an Employee Account
	public void saveRoom(Room room){
		emf = DbHelper.provideFactory();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(room);
		em.getTransaction().commit();
		em.close();
	}
	public Room searchRoom(Long id){
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Room room=em.find(Room.class,id);
		return room;
	}
	
	
	//for updating
	DepartmentDao deptDao=new DepartmentDao();
			
				
				public void updateRoom(long id,String roomName, String description, Department department) 
						{
	
		emf=DbHelper.provideFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Room room=em.find(Room.class,id);
		
		Department dep= deptDao.search(id);
		room.setDepartment(dep);
		room.setRoomName(roomName);
		room.setDescription(description);
		
		em.getTransaction().commit();
		em.close();
	}

	//for displaying
		public List<Room>listRoom(){
        emf=DbHelper.provideFactory();
        em=emf.createEntityManager();
        TypedQuery<Room> query=em.createQuery("Select b from Room b",Room.class);
        List<Room> roomList=query.getResultList();
        return roomList;
    }

}
