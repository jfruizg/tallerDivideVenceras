package co.edu.unbosque.controller;

import co.edu.unbosque.model.Matriz;
import co.edu.unbosque.view.vistaPrincipal;

public class controller {

	private vistaPrincipal vista;
	private Matriz matriz;

	public controller() {
		vista = new vistaPrincipal();

		inicializar();
	}

	public void inicializar() {

		vista.mostrarMensaje("Bienvenido a Matrices Cuadradas");
		matriz = new Matriz(3);
		matriz.inicialziarMatriz();
		vista.mostrarMensaje("________________________________________________________\n" + "Matirz 1 :\n");
		vista.mostrarMensaje(matriz.imprimirMatriz(matriz.getMatriz1()));
		vista.mostrarMensaje("________________________________________________________\n" + "Matirz 2 :\n");
		vista.mostrarMensaje(matriz.imprimirMatriz(matriz.getMatriz2()));

		vista.mostrarMensaje("Matriz multiplicada sin divide y venceras: ");
		matriz.multiSinDivide(matriz.getMatriz1(), matriz.getMatriz2());
		vista.mostrarMensaje("________________________________________________________\n"
				+ "Multiplicacion de las dos matices sin divide y venceras :\n");
		vista.mostrarMensaje(matriz.imprimirMatriz(matriz.getRes()));

	}

}
