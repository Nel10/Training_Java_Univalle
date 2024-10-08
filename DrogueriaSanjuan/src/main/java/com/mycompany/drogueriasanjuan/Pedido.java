/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.drogueriasanjuan;

/**
 *
 * @author holberton
 */
public class Pedido {
    
    private String nombre,tipo,sucursal,distribuidor; 
    private int cantidad;

    public Pedido(String nombre, String tipo, String sucursal, String distribuidor, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.sucursal = sucursal;
        this.distribuidor = distribuidor;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", tipo=" + tipo + ", sucursal=" + sucursal + ", distribuidor=" + distribuidor + ", cantidad=" + cantidad  + "\n";
    }
    
    
    
}
