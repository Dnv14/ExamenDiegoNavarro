/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.ISubscriber;
import java.util.LinkedList;

/**
 *
 * @author Diego
 */
public class Modelo implements IModelo {

    private LinkedList<Cliente> listaClientes;
    private Cliente clienteEncontrado;
    private LinkedList<ISubscriber> suscriptores;

    public Modelo() {
        this.listaClientes = new LinkedList<>();
        this.clienteEncontrado = null;
        this.suscriptores = new LinkedList<>();
    }

    public Cliente getClienteEncontrado() {
        return this.clienteEncontrado;
    }

    public void agregarCliente(Cliente cliente) {
        this.listaClientes.add(cliente);
    }

    public void suscribir(ISubscriber sub) {
        this.suscriptores.add(sub);
    }

    public void notificarSuscriptores() {
        for (ISubscriber sub : suscriptores) {
            sub.update(this);
        }
    }

    @Override
    public void pagarMonto() {

    }

    @Override
    public void buscarCliente(String numeroServicio) {
        this.clienteEncontrado = null;
        for (Cliente c : listaClientes) {

            if (String.valueOf(c.getNumeroServicio()).equals(numeroServicio)) {
                this.clienteEncontrado = c;
                break;
            }
        }
        notificarSuscriptores();
    }

    @Override
    public void buscarTarjeta(String numeroTarjeta, String cvv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
