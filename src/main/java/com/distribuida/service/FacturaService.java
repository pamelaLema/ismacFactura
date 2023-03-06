package com.distribuida.service;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.Factura;

public interface FacturaService {
	


	public List<Factura> findAll();
	public Factura findOne(int id);

	public void del(int id);
	
	public  void add(Date fecha,double total_neto,double iva,double total,int id_cliente);
   	void up(int id_factura,Date fecha, double total_neto, double iva, double total, int id_cliente);

  // Resto de consultas
	public List<Factura> findAll(String busqueda);
	
	 
}
