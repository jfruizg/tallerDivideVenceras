package co.edu.unbosque.controller;

import co.edu.unbosque.model.productoMatrices;
import co.edu.unbosque.view.vistaPrincipal;

public class controller {

    vistaPrincipal vista;
    productoMatrices modelo;

    public controller() {
        vista = new vistaPrincipal();
        modelo = new productoMatrices();
        inicializar();
    }
    public void inicializar(){

        vista.mostrarMensaje("Bienvenido a Matrices Cuadradas");

    }


}
