package com.distribuida.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.entities.Cliente;
import com.distribuida.dao.ClienteDAO;



@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteDAO clienteDAO;
	
	
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return  clienteDAO.findAll();
	}

	@Override
	public Cliente findOne(int id) {
		// TODO Auto-generated method stub
		return clienteDAO.findOne(id);
	}

	@Override
	public void add(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteDAO.add(cliente);
		
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		clienteDAO.del(id);
		
	}

	@Override
	public List<Cliente> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return clienteDAO.findAll(busqueda);
	}

	@Override
	public void add(String cedula, String nombre, String apellido, int edad, Date fecha, String direccion,
			String telefono, String correo) {
		// TODO Auto-generated method stub
		Cliente cliente=new Cliente(cedula, nombre,apellido,edad,fecha,direccion,telefono,correo);
	    clienteDAO.add(cliente);
		
	}

	@Override
	public void up(int id_cliente, String cedula, String nombre, String apellido, int edad, Date fecha, String direccion,
			String telefono, String correo) {
		// TODO Auto-generated method stub
		Cliente cliente=new Cliente(id_cliente,cedula,nombre,apellido,edad,fecha,direccion,telefono,correo);
		clienteDAO.add(cliente);
		
		
	}

	

	
}
