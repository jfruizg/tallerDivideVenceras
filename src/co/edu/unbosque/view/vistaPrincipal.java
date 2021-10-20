package co.edu.unbosque.view;

import java.util.Scanner;

public class vistaPrincipal {

	private Scanner in = new Scanner(System.in);

	public String recibirMensaje(String mensaje) {
		return mensaje;
	}

	public int recibirInt(String mensaje) {
		System.out.println(mensaje);
		String a = in.next();
		
		while (!esNumeroInt(a)) {
			System.out.println("Valide datos: ");
			System.out.println(mensaje);
			a = in.next();
		}
		return Integer.parseInt(a);
	}

	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

	protected boolean esNumeroInt(String mensaje) {
		try {
			Integer.parseInt(mensaje);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
}
