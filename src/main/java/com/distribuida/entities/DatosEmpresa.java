package com.distribuida.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class DatosEmpresa {
	@Value("${empresa}")
	private String empresa;
	@Value("${direccion}")
	private String direccion;
	@Value("${telefono}")
	private String telefono;
	@Value("${correo}")
	private String correo;

	
	public DatosEmpresa() {}
	public DatosEmpresa(String empresa,String direccion,String telefono,String correo) {
   	 this.empresa=empresa;
   	 this.direccion=direccion;
   	 this.telefono=telefono;
   	 this.correo=correo;
   	 
    }
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	

	@Override
	public String toString() {
		return "\n DatosEmpresa=" + empresa + " \n direccion=" + direccion + "\n telefono=" + telefono + "\n correo="
				+ correo + "\n" ;
	}

}
