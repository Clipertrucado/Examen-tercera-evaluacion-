package Dtos;

import java.time.LocalDate;

public class PedidoDtos {
	
	int idPedido;
	String nombrePedido = "aaaaa";
	int cantidadPedido = 99999;
	LocalDate fechaEntregaPedido;
	
	
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getNombrePedido() {
		return nombrePedido;
	}
	public void setNombrePedido(String nombrePedido) {
		this.nombrePedido = nombrePedido;
	}
	public int getCantidadPedido() {
		return cantidadPedido;
	}
	public void setCantidadPedido(int cantidadPedido) {
		this.cantidadPedido = cantidadPedido;
	}
	public LocalDate getFechaEntregaPedido() {
		return fechaEntregaPedido;
	}
	public void setFechaEntregaPedido(LocalDate fechaEntregaPedido) {
		this.fechaEntregaPedido = fechaEntregaPedido;
	}
	
	
	public PedidoDtos(int idPedido, String nombrePedido, int cantidadPedido, LocalDate fechaEntregaPedido) {
		super();
		this.idPedido = idPedido;
		this.nombrePedido = nombrePedido;
		this.cantidadPedido = cantidadPedido;
		this.fechaEntregaPedido = fechaEntregaPedido;
	}
	
	
	public PedidoDtos() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "PedidoDtos [idPedido=" + idPedido + ", nombrePedido=" + nombrePedido + ", cantidadPedido="
				+ cantidadPedido + ", fechaEntregaPedido=" + fechaEntregaPedido + "]";
	}
	

}
