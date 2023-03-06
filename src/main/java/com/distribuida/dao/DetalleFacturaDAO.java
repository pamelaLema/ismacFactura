package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.DetalleFactura;

public interface DetalleFacturaDAO {
	// CRUD BASICO
		public List<DetalleFactura> findAll();
		public DetalleFactura findOne(int id);
		public void add(DetalleFactura detalleFactura);
		public void up(DetalleFactura detalleFactura);

		public void del(int id);
		
		
		// CONSULTAS PERSONALIZADAS
		public List<DetalleFactura> findAll(String busqueda);
		

}
