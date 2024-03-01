package Dtos;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class VentasDtos {
	
	SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	int idVenta;
	double precioVenta = 99999.99;
	LocalDate instante;
	
	
	
	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public LocalDate getInstante() {
		return instante;
	}
	public void setInstante(LocalDate instante) {
		this.instante = instante;
	}
	
	
	public VentasDtos(int idVenta, double precioVenta, LocalDate instante) {
		super();
		this.idVenta = idVenta;
		this.precioVenta = precioVenta;
		this.instante = instante;
	}
	
	
	public VentasDtos() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Venta numero: " + idVenta + ", Euros: " + precioVenta + ", Instante de compra: " + instante.toString().formatted(formato) ;
	}
	
	
	
}
