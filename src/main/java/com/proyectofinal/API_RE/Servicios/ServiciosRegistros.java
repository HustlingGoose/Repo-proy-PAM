/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectofinal.API_RE.Servicios;



import com.proyectofinal.API_RE.Entidades.Registros;
import com.proyectofinal.API_RE.Repositorios.RepositorioRegistros;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jeanm
 */
@Service
public class ServiciosRegistros {
    @Autowired
    RepositorioRegistros RR;
    
    public List<Registros> obtenerTodosLosRegistros(){
    return RR.findAll();
    }
    
    public List <Registros> obtenerPorUsuario(int usuario){
    return RR.findByUsuario(usuario);
    }
    
    public Registros obtenerPorID(int id){
    Optional <Registros> lib=RR.findById(id);
    return lib.get();
    }
    
    public boolean insertarRegistro(Registros R){
    boolean respuesta = false;
    try{
    RR.save(R); //insert o update a base de datos
    respuesta = true;
    }catch(Exception ex){
        respuesta=false;
    }
    
    return respuesta;
    }
    
    public boolean actualizarRegistro(Registros L){
    boolean respuesta = false;
    try{
    RR.save(L); //insert o update a base de datos
    respuesta = true;
    }catch(Exception ex){
        respuesta=false;
    }
    
    return respuesta;
    }
    
    public boolean eliminarRegistro(int id){
    boolean respuesta = false;
    try{
    RR.deleteById(id); //delet dis
    respuesta = true;
    }catch(Exception ex){
        respuesta=false;
    }
    
    return respuesta;
    }
    
    public Registros obtenerReciente(){
    return RR.findFirstByOrderByIDDesc();
    }
    
}
