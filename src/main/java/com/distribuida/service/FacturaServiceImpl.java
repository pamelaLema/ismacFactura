package com.distribuida.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Producto;

@Service
public class FacturaServiceImpl implements FacturaService {
	
	
	


	@Autowired
	private FacturaDAO facturaDAO;
	
	@Autowired
	private ClienteDAO clienteDAO;
	
	

	@Override
	public List<Factura> findAll() {
		// TODO Auto-generated method stub
		return facturaDAO.findAll();
	}

	@Override
	public Factura findOne(int id) {
		return facturaDAO.findOne(id);
	}

	
	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		facturaDAO.del(id);
		
	}
	

	@Override
	public List<Factura> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return facturaDAO.findAll(busqueda);
	}

	@Override
	public void add(Date fecha, double total_neto, double iva, double total,int id_cliente) {
		// TODO Auto-generated method stub
		Cliente cliente=clienteDAO.findOne(id_cliente);
		Factura factura1=new Factura(cliente);
		factura1.setCliente(cliente);
		facturaDAO.add(factura1);
		
		
	}

	@Override
	public void up(int id_factura,Date fecha, double total_neto, double iva, double total,int id_cliente) {
		// TODO Auto-generated method stub
		Cliente cliente=clienteDAO.findOne(id_cliente);
		Factura factura= facturaDAO.findOne(id_factura);
		factura.setFecha(fecha);
		factura.setTotalNeto(total_neto);
		factura.setIva(iva);
		factura.setTotal(total);
		factura.setCliente(cliente);


		facturaDAO.add(factura);
		
		
	}


	
	

	
}
