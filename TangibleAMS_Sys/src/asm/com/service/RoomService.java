/**
 * 
 */
package asm.com.service;

import java.sql.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import asm.com.dao.RoomDao;
import asm.com.pojos.Department;
import asm.com.pojos.Room;

/**
 * @author King
 *
 */
public class RoomService {
 
 // adding
 RoomDao roomDoa = null;

 @POST
 @Path("/SaveRoom")
 @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
 public Room addRoom(Room rm) {
  roomDoa.saveRoom(rm);
  return rm;
 }

 // updating the save
 

 @PUT
 @Path("{id}")
 @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
 @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
 public void update(@PathParam("roomId") long roomId,
   @PathParam("roomName") String roomName,
   @PathParam("description") String description,
   @PathParam("department") Department department) {

  roomDoa = new RoomDao();

  roomDoa.updateRoom(roomId, roomName, description, department);
 }

 // for searching the room
/*
 @DELETE
 @Path("{id}")
 @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
 @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
 public void remove(@PathParam("roomId") Long roomId) {
  roomDoa = new RoomDao();
  roomDoa.searchRoom(roomId);
 }*/

 // for retrieving

 @GET
 @Path("/Retrieve")
 @Produces({ MediaType.APPLICATION_JSON })
 public List<Room> findAll() {
  roomDoa = new RoomDao();
  return roomDoa.listRoom();
 }

}