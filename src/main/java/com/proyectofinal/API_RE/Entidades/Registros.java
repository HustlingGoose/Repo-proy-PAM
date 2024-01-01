/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectofinal.API_RE.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 *
 * @author jeanm
 */
@Entity
public class Registros {
    @Id
    int ID;
    @Column(length=60)
    String Producto;
    double Precio;
    String Tienda;
    String Tipotienda;
    String UbicacionGPS;
    int usuario;

    public Registros() {
    }

    public Registros(int ID, String Producto, double Precio, String Tienda, String Tipotienda, String UbicacionGPS, int usuario) {
        this.ID = ID;
        this.Producto = Producto;
        this.Precio = Precio;
        this.Tienda = Tienda;
        this.Tipotienda = Tipotienda;
        this.UbicacionGPS = UbicacionGPS;
        this.usuario = usuario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getTienda() {
        return Tienda;
    }

    public void setTienda(String Tienda) {
        this.Tienda = Tienda;
    }

    public String getTipotienda() {
        return Tipotienda;
    }

    public void setTipotienda(String Tipotienda) {
        this.Tipotienda = Tipotienda;
    }

    public String getUbicacionGPS() {
        return UbicacionGPS;
    }

    public void setUbicacionGPS(String UbicacionGPS) {
        this.UbicacionGPS = UbicacionGPS;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    
    
    
    
}
