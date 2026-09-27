/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.Cliente;
import Modelo.IModelo;
import Vista.FrmPagoRecibo;
import java.util.LinkedList;

/**
 *
 * @author Diego
 */
public class Control {

    private final IModelo modelo;

    public Control(IModelo modelo) {
        this.modelo = modelo;
    }

    public void buscarCliente(String numeroServicio) {
        if (numeroServicio != null && !numeroServicio.trim().isEmpty()) {
            modelo.buscarCliente(numeroServicio);
        } else {

            modelo.buscarCliente("");
        }
    }

    public boolean validarTarjeta(String num, String cvv) {
        return modelo.buscarTarjeta(num, cvv);
    }

    public void pagarMonto() {
        modelo.pagarMonto();
    }

    public LinkedList<Cliente> obtenerListaClientes() {
        return modelo.getListaClientes();
    }

    public void abrirVentanaPago() {
        if (modelo.getClienteEncontrado() != null) {

            FrmPagoRecibo ventanaPago = new FrmPagoRecibo(this, this.modelo);
            ventanaPago.setVisible(true);
        }
    }
}
