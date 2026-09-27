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

    private LinkedList<Tarjeta> listaTarjetas;
    private LinkedList<Cliente> listaClientes;
    private Cliente clienteEncontrado;
    private LinkedList<ISubscriber> suscriptores;

    public Modelo() {
        this.listaClientes = new LinkedList<>();
        this.listaTarjetas = new LinkedList<>();
        this.clienteEncontrado = null;
        this.suscriptores = new LinkedList<>();
    }

    @Override
    public Cliente getClienteEncontrado() {
        return this.clienteEncontrado;
    }

    public void agregarCliente(Cliente cliente) {
        this.listaClientes.add(cliente);
    }

    public void agregarTarjeta(Tarjeta tarjeta) {
        this.listaTarjetas.add(tarjeta);
    }

    @Override
    public LinkedList<Cliente> getListaClientes() {
        return this.listaClientes;
    }

    @Override
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
        if (this.clienteEncontrado != null) {
            this.clienteEncontrado.setMontoPago(0.0);
            this.clienteEncontrado.setKwhGastados(0.0);
            notificarSuscriptores();
        }
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
    public boolean buscarTarjeta(String numeroTarjeta, String cvv) {
        for (Tarjeta t : listaTarjetas) {
            if (t.getNumeroTarjeta().equals(numeroTarjeta) && t.getCvv().equals(cvv)) {
                return true;
            }
        }
        return false;
    }
}
