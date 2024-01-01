/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectofinal.API_RE.Servicios;

import com.proyectofinal.API_RE.Entidades.Usuarios;
import com.proyectofinal.API_RE.Repositorios.RepositorioUsuarios;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jeanm
 */
@Service
public class ServiciosUsuarios {
    @Autowired
    RepositorioUsuarios RU;
    
    public List<Usuarios> obtenerTodosLosUsuarios(){
    return RU.findAll();
    }
    
    public Usuarios obtenerPorID(int id){
    Optional <Usuarios> lib=RU.findById(id);
    return lib.get();
    }
    
    public boolean insertarUsuario(Usuarios R){
    boolean respuesta = false;
    try{
    RU.save(R); //insert o update a base de datos
    respuesta = true;
    }catch(Exception ex){
        respuesta=false;
    }
    
    return respuesta;
    }
    
    public boolean actualizarUsuario(Usuarios L){
    boolean respuesta = false;
    try{
    RU.save(L); //insert o update a base de datos
    respuesta = true;
    }catch(Exception ex){
        respuesta=false;
    }
    
    return respuesta;
    }
    
    public boolean eliminarUsuario(int id){
    boolean respuesta = false;
    try{
    RU.deleteById(id); //delet dis
    respuesta = true;
    }catch(Exception ex){
        respuesta=false;
    }
    
    return respuesta;
    }
    
    public Usuarios masReciente(){
    return RU.findFirstByOrderByIDDesc();
    }
    
    
}
