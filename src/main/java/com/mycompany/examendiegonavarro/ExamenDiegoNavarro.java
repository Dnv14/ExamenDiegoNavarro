/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examendiegonavarro;

import Control.Control;
import Modelo.Cliente;
import Modelo.IModelo;
import Modelo.Modelo;
import Vista.FrmBuscarCliente;

/**
 *
 * @author Diego
 */
public class ExamenDiegoNavarro {

    public static void main(String[] args) {
        IModelo modelo = new Modelo();
        Control control = new Control(modelo);

        ((Modelo) modelo).agregarCliente(new Cliente("Juan Pérez", "Calle Falsa 123", 123456L, 150.0));
        ((Modelo) modelo).agregarCliente(new Cliente("María López", "Av. Central 456", 789012L, 220.0));
        ((Modelo) modelo).agregarCliente(new Cliente("Diego Navarro", "Valle de alamos #2120", 3202123456L, 67.05));

        FrmBuscarCliente vista = new FrmBuscarCliente(modelo, control);
        vista.setVisible(true);
    }
}
