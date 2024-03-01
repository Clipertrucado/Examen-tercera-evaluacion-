package Servicios;

import java.util.List;

import Dtos.PedidoDtos;
import Dtos.VentasDtos;

public interface OperativaInterfaz {
	
	public void anyadirVenta(List<VentasDtos> listaVentas);
	
	public void mostrarVentas(List<VentasDtos> listaVentas);
	
	public void calcularVentas(List<VentasDtos> listaVentas);
	
	public void anyadirPedido(List<PedidoDtos> listaPedidos);

}
