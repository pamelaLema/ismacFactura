package com.distribuida.entities;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
@Entity
@Table(name="Facturas")
 
public class Factura {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_factura")
	private int idFactura;
	@Column(name="fecha")
	private Date fecha;
	@Column(name="total_neto")
	private double totalNeto;
	@Column(name="iva")
	private double iva;
	@Column(name="total")
	private double total;
	
	@ManyToOne (cascade = CascadeType.ALL )
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	//private DatosEmpresa datosEmpresa;

	
	
	public Factura() {}
	@Autowired
	public Factura(Cliente cliente) {
		this.cliente=cliente;
		
	}
	
	
	public Factura(int idFactura,Date fecha, double totalNeto,int iva,double total) {
		this.idFactura=idFactura;
		this.fecha=fecha;
		this.totalNeto=totalNeto;
		this.iva=iva;
		this.total=total;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Factura(Date fecha, double totalNeto, double iva, double total, Cliente cliente) {
		this.fecha = fecha;
		this.totalNeto = totalNeto;
		this.iva = iva;
		this.total = total;
		this.cliente = cliente;
	}
	
	
	public void setIdFactura(int idFactura) {
		this.idFactura=idFactura;
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setFecha(Date fecha) {
		this.fecha=fecha;
	}
	public Date getFecha() {
		return fecha;
	}
	
	public void setTotalNeto(double totalNeto) {
		this.totalNeto=totalNeto;
	}
	
	public void setTotalNeto(double subtotal, Boolean True) {
		this.totalNeto=totalNeto+subtotal;
	}
	
	
	public double getTotalNeto() {
		
		return totalNeto;
	}
	public void setIva(double iva) {
		this.iva=iva;
	}
	public double getIva() {
		return iva;
	}
	
	public void setTotal(double total) {
		this.total=total;
	}
	public double getTotal() {
		return total;
	}
	
	
	/*public DatosEmpresa getDatosEmpresa() {
		return datosEmpresa;
	}
	
	@Autowired
	public void setDatosEmpresa(DatosEmpresa datosEmpresa) {
		this.datosEmpresa = datosEmpresa;
	}*/
	
	
	
	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", fecha=" + fecha + ", totalNeto=" + totalNeto + ", iva=" + iva
				+ ", total=" + total + ", cliente=" + cliente + "]";
	}
	
}
