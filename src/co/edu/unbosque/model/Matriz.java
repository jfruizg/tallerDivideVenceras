package co.edu.unbosque.model;

import java.util.Iterator;
import java.util.Random;

public class Matriz {

	private int size;
	private int fila;
	private int columna;
	private int[][] matriz1;
	private int[][] matriz2;
	private int[][] res;

	public Matriz(int size) {
		this.fila = size;
		this.columna = size;
		this.matriz1 = new int[fila][columna];
		this.matriz2 = new int[fila][columna];
		this.res = new int[fila][columna];

	}

	public void inicialziarMatriz() {
		String a = "";

		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				Random rnd = new Random();
				matriz1[i][j] = rnd.nextInt(10000);
				matriz2[i][j] = rnd.nextInt(10000);

			}

		}

	}

	public String imprimirMatriz(int[][] matriz) {
		String a = "";
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				a += matriz[i][j] + " ";
			}

			a += "\n";
		}
		return a;

	}

	public void multiSinDivide(int[][] a, int[][] b) {
		if (a[0].length == b.length) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					for (int k = 0; k < a[0].length; k++) {
						res[i][j] += a[i][k] * b[k][j];
					}
				}
			}
		}

	}

	public int[][] getMatriz1() {
		return matriz1;
	}

	public void setMatriz1(int[][] matriz1) {
		this.matriz1 = matriz1;
	}

	public int[][] getMatriz2() {
		return matriz2;
	}

	public void setMatriz2(int[][] matriz2) {
		this.matriz2 = matriz2;
	}

	public int[][] getRes() {
		return res;
	}

	public void setRes(int[][] res) {
		this.res = res;
	}
	

}
