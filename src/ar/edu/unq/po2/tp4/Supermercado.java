package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private ArrayList<Producto> productosComercializados = new ArrayList<Producto>();
	private double precioTotalDeProductos;
	
	public Supermercado(String nombre, String direccion) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void agregarProducto(Producto producto) {
		productosComercializados.add(producto);
	}
	
	public int getCantidadDeProductos() {
		return productosComercializados.size();
	}
	
	public double getPrecioTotal() {
	for(Producto objeto : productosComercializados) {
	    precioTotalDeProductos += objeto.getPrecio();
	}
	return precioTotalDeProductos;
}

}