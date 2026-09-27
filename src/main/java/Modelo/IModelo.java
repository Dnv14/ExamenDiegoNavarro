/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

/**
 *
 * @author Diego
 */
public interface IModelo {

    public void pagarMonto();

    public void buscarCliente(String numeroServicio);

    public void buscarTarjeta(String numeroTarjeta, String cvv);
}
