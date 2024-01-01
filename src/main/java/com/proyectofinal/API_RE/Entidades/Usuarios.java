/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectofinal.API_RE.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author jeanm
 */
@Entity
@Table  (name="Usuarios")
public class Usuarios {
    @Id
    int ID;
    @Column(length=60)
    String Nombre;
    String Apellidos;
    String Password;
    String Ciudad;
    String CorreoE;
    String Tipo;

    public Usuarios() {
    }

    public Usuarios(int ID, String Nombre, String Apellidos, String Password, String Ciudad, String CorreoE, String Tipo) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Password = Password;
        this.Ciudad = Ciudad;
        this.CorreoE = CorreoE;
        this.Tipo = Tipo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

   

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getCorreoE() {
        return CorreoE;
    }

    public void setCorreoE(String CorreoE) {
        this.CorreoE = CorreoE;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
    
}

