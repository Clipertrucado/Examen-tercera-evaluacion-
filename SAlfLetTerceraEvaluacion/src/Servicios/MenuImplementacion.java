package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {
	Scanner sc = new Scanner(System.in);

	@Override
	public int menuPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------");
		System.out.println("    seleccione el menu que desea");
		System.out.println("------------------------------------");
		System.out.println("       1. Menu para empleados");
		System.out.println("       2. Menu para gerencia");
		System.out.println("------------------------------------");

		int seleccion = sc.nextInt();
		return seleccion;
	}

	@Override
	public int menuEmpleado() {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------------------");
		System.out.println("    seleccione la funcionalidad que desea");
		System.out.println("---------------------------------------------");
		System.out.println("      1. Cálculo total de ventas diario");
		System.out.println("      2. Añadir venta");
		System.out.println("---------------------------------------------");
		
		int seleccion = sc.nextInt();
		return seleccion;
		
	}

	@Override
	public int menuGerencia() {
		// TODO Auto-generated method stub
		System.out.println("----------------------------------------------");
		System.out.println("    seleccione la funcionalidad que desea");
		System.out.println("----------------------------------------------");
		System.out.println("     1. Mostrar todas las ventas del día");
		System.out.println("     2. Crear un nuevo pedido para proveedores");
		System.out.println("----------------------------------------------");
		
		int seleccion = sc.nextInt();
		return seleccion;
	}

}
