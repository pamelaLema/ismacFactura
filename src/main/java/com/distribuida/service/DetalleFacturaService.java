package com.distribuida.service;

import java.util.List;

import com.distribuida.entities.DetalleFactura;

public interface DetalleFacturaService {

	public List<DetalleFactura> findAll();
	public DetalleFactura findOne(int id);
	public void add(DetalleFactura detalleFactura);
	public void up(DetalleFactura detalleFactura);

	public void del(int id);
	
	
	
	public void add(int cantidad,Double subtotal,int id_factura,int id_producto);
	public void up(int idFacturaDetalle,int cantidad,Double subtotal,int id_factura,int id_producto);

	
}
