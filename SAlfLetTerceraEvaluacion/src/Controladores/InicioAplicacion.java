package Controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dtos.PedidoDtos;
import Dtos.VentasDtos;
import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

public class InicioAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		List<VentasDtos> listaVentas = new ArrayList<>();
		List<PedidoDtos> listaPedidos = new ArrayList<>();

		boolean cerrar = true;

		while (cerrar) {
			int seleccion = mi.menuPrincipal();

			switch (seleccion) {
			
			// MENU PARA EMPLEADOS---------------------
			case 1:
				int seleccionEmpleado = mi.menuEmpleado();

				switch (seleccionEmpleado) {

				case 1:
					oi.calcularVentas(listaVentas);
					break;

				case 2:
					oi.anyadirVenta(listaVentas);
					break;
					
				}
				break;
				
			// MENU PARA GERENCIA---------------------
			case 2:
				int seleccionGerencia = mi.menuGerencia();

				switch (seleccionGerencia) {

				case 1:
					oi.mostrarVentas(listaVentas);
					break;

				case 2:
					oi.anyadirPedido(listaPedidos);
					break;

				}
				break;

			}

		}

	}

}
