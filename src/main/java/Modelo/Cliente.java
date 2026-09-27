/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Diego
 */
public class Cliente {

    private String nombre;
    private String domicilio;
    private Long numeroServicio;
    private Double kwhGastados;
    private Double montoPago;

    public Cliente(String nombre, String domicilio, Long numeroServicio, Double kwhGastados, Double montoPago) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.numeroServicio = numeroServicio;
        this.kwhGastados = kwhGastados;
        this.montoPago = montoPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Long getNumeroServicio() {
        return numeroServicio;
    }

    public void setNumeroServicio(Long numeroServicio) {
        this.numeroServicio = numeroServicio;
    }

    public Double getKwhGastados() {
        return kwhGastados;
    }

    public void setKwhGastados(Double kwhGastados) {
        this.kwhGastados = kwhGastados;
    }

    public Double getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(Double montoPago) {
        this.montoPago = montoPago;
    }

}
