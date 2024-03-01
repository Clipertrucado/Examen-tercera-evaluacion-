package Servicios;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import Dtos.PedidoDtos;
import Dtos.VentasDtos;

public class OperativaImplementacion implements OperativaInterfaz {
	Scanner sc = new Scanner(System.in);

	@Override
	public void anyadirVenta(List<VentasDtos> listaVentas) {
		// TODO Auto-generated method stub
		listaVentas.add(crearVenta(listaVentas));

	}

	private VentasDtos crearVenta(List<VentasDtos> listaVentas) {
		VentasDtos venta = new VentasDtos();
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

		System.out.println("---------------------------");
		System.out.println("    CREAR NUEVA VENTA");
		System.out.println("---------------------------------------------");
		System.out.println(" Ingresa el importe");
		venta.setPrecioVenta(sc.nextDouble());
		System.out.println("---------------------------------------------");

		venta.setInstante(LocalDate.now());

		venta.setIdVenta(calculoId(listaVentas));

		System.out.println(venta.toString());

		return venta;
	}

	private int calculoId(List<VentasDtos> listaVentas) {

		int id = 1;

		for (VentasDtos venta : listaVentas) {
			id = id + 1;
		}

		return id;

	}

	@Override
	public void mostrarVentas(List<VentasDtos> listaVentas) {
		// TODO Auto-generated method stub
		for (VentasDtos venta : listaVentas) {
			venta.toString();
		}

	}

	@Override
	public void calcularVentas(List<VentasDtos> listaVentas) {
		// TODO Auto-generated method stub
		double dinero = 0;
		for (VentasDtos venta : listaVentas) {
			dinero = dinero + venta.getPrecioVenta();
		}

		System.out.println("Total de ventas: " + dinero);

	}

	@Override
	public void anyadirPedido(List<PedidoDtos> listaPedidos) {
		// TODO Auto-generated method stub

		boolean cerrar = true;
		
		while(cerrar) {
		listaPedidos.add(crearPedido(listaPedidos));
		
		System.out.println("");
		
		}
	}

	public PedidoDtos crearPedido(List<PedidoDtos> listaPedidos) {

		PedidoDtos pedido = new PedidoDtos();
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

		System.out.println("--------------------------------------");
		System.out.println("        CREAR UN NUEVO PEDIDO");
		System.out.println("---------------------------------------------");
		System.out.println(" Ingresa el nombre del producto");
		pedido.setNombrePedido(sc.next());
		System.out.println(" Ingresa la cantidad de producto");
		pedido.setCantidadPedido(sc.nextInt());
		System.out.println(" Ingresa la fecha de recogida");

		System.out.println("---------------------------------------------");

		pedido.setIdPedido(calculoId2(listaPedidos));

		return pedido;

	}

	private int calculoId2(List<PedidoDtos> lista) {

		int id = 1;

		for (PedidoDtos pedido : lista) {
			id = id + 1;
		}

		return id;

	}

}
