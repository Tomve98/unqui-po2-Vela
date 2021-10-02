package ar.edu.unq.po2.tp4;

public class Producto {
	String nombre;
	double precio;
	boolean esParteDePreciosCuidados;
	double descuentoAplicado;
	
	public Producto(String nombre, double precio, boolean precioCuidado, double descuento) {//constructor con descuento
		this.setNombre(nombre);
		this.setPrecio(precio, descuento);
		this.esParteDePreciosCuidados = precioCuidado;
	}
		
	public Producto(String nombre, double precio) {//constructor sin descuento
		this.nombre = nombre;
		this.precio = precio;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private void setPrecio(double precio, double descuento) {
		if (esParteDePreciosCuidados) {
			this.precio = precio - ((precio * descuento)/100);
		}
		else {
			this.precio = precio;
		}
	}
	
	public double getPrecio() {
		return precio;
	}
	
}

