package dao;

import java.util.List;
/*
 * Generic CRUD interface to implement DAO for each entity
 */
public interface GenericDAO<E> {
	
	/**
	 * A method to make new record in database
	 * @param e - values to be inserted into database
	 */
	void create(E e);
	/**
	 * A method to update information in database
	 * @param e - values to be updated in database 
	 * @return true, if updated successfully
	 */
	boolean update(E e);
	/**
	 * A method to delete information from database
	 * @param e - values to be deleted in database 
	 * @return true if deleted successfully
	 */
	boolean delete(E e);
	/**
	 * A method to get an object E with values from database
	 * @param e - values to be read in database 
	 * @return specified object 
	 */
	E read(E e);
	/**
	 * A method to find all available objects from database
	 * @return list of objects E
	 */
	List<E> findAll();	
}
