package com.distribuida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.ProductoDAO;
import com.distribuida.entities.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoDAO productoDAO;
	
	
	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return  productoDAO.findAll();
	}

	@Override
	public Producto findOne(int id) {
		// TODO Auto-generated method stub
		return productoDAO.findOne(id);
	}

	
	@Override
	public void add(Producto producto) {
		// TODO Auto-generated method stub
		productoDAO.add(producto);
		
	}

	/*@Override
	public void up(Producto producto) {
		// TODO Auto-generated method stub
		productoDAO.del(id);
		
	}*/


	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		productoDAO.del(id);
		
	}

	@Override
	public List<Producto> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return productoDAO.findAll(busqueda);
	}

	@Override
	public void add(String nombre, String descripcion, double precio, int stock) {
		// TODO Auto-generated method stub
		Producto producto=new Producto(nombre,descripcion,precio,stock);
	    productoDAO.add(producto);
		
		
	}

	@Override
	public void up(int id_producto, String nombre, String descripcion, double precio, int stock) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Producto producto=new Producto(id_producto,nombre,descripcion,precio,stock);
				productoDAO.add(producto);
				
		
	}

	/*@Override
	public void add(String nombre,String descripcion,double precio,int stock) {
		// TODO Auto-generated method stub
		Producto producto=new Producto(nombre,descripcion,precio,stock);
	    productoDAO.add(producto);
		
	}

	@Override
	public void up(int id_producto,String nombre,String descripcion,double precio,int stock) {
		// TODO Auto-generated method stub
		Producto producto=new Producto(id_producto,nombre,descripcion,precio,stock);
		productoDAO.add(producto);
		
		
	}*/

	
    
	
	
	
	
}
