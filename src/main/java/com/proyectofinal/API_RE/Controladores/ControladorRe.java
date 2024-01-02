/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectofinal.API_RE.Controladores;


import com.proyectofinal.API_RE.Entidades.Registros;
import com.proyectofinal.API_RE.Entidades.Usuarios;
import com.proyectofinal.API_RE.Repositorios.RepositorioUsuarios;
import com.proyectofinal.API_RE.Servicios.ServiciosRegistros;
import com.proyectofinal.API_RE.Servicios.ServiciosUsuarios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jeanm
 */
@RestController
@RequestMapping("/control")
public class ControladorRe {
    @Autowired
    ServiciosRegistros SR;
    @Autowired
    ServiciosUsuarios SU;
    @Autowired
    RepositorioUsuarios RU;
    
    
    
    @GetMapping("/usuarios/reciente")
    public Usuarios getUltimoU(){
    return SU.masReciente();
    }
    @GetMapping("/registros/reciente")
    public Registros getUltimoR(){
    return SR.obtenerReciente();
    }
    @GetMapping("/registros")
    public List<Registros> getTodosLosRegistros(){
    return SR.obtenerTodosLosRegistros();
    }
    
    @GetMapping("/registrosusuario/{usuario}")
    public List<Registros> getRegistrosPorUsuario(@PathVariable int usuario){
    return SR.obtenerPorUsuario(usuario);
    }

    @GetMapping("/usuarios")
    public List<Usuarios> getTodosLosUsuarios(){
    return SU.obtenerTodosLosUsuarios();
    }
    
    @GetMapping("/registros/{id}")
    public Registros getRegistroPorID(@PathVariable int id){
    return SR.obtenerPorID(id);
    }
    
    @GetMapping("/usuarios/{id}")
    public Usuarios getUsuarioPorID(@PathVariable int id){
    return SU.obtenerPorID(id);
    }
    
    @GetMapping("/login/{nombre}&{password}")
    public boolean Login(@PathVariable String nombre,@PathVariable String password){
        boolean respuesta=false;
        List<Usuarios> lista =RU.findAll();
        for (Usuarios u : lista) {
            if (u.getNombre().equals(nombre)&u.getPassword().equals(password)){
            respuesta=true;
            }
        }
    
    return respuesta;
    }
    @GetMapping("/loginB/{nombre}&{password}")
    public Usuarios LoginT (@PathVariable String nombre,@PathVariable String password){
    Usuarios user=null;
    List<Usuarios> lista =RU.findAll();
        for (Usuarios u : lista) {
            if (u.getNombre().equals(nombre)&u.getPassword().equals(password)){
            user=u;
            }
        }
        return user;
    }
   
    
    @PostMapping("/registros")
    public List<Registros> postInsertarRegistro(@RequestBody Registros L){
        
        if(SR.insertarRegistro(L)){
        return SR.obtenerTodosLosRegistros();
        }else{
        return null;
        }
    }
    @PostMapping("/usuarios")
    public List<Usuarios> postInsertarUsuario(@RequestBody Usuarios L){
        
        if(SU.insertarUsuario(L)){
        return SU.obtenerTodosLosUsuarios();
        }else{
        return null;
        }
    }
    
    @PutMapping("/registros")
    public List<Registros> putInsertarLibro(@RequestBody Registros L){
        
        if(SR.actualizarRegistro(L)){
        return SR.obtenerTodosLosRegistros();
        }else{
        return null;
        }
    }
    
    @PutMapping("/usuarios")
    public List<Usuarios> putInsertarUsuario(@RequestBody Usuarios L){
        
        if(SU.actualizarUsuario(L)){
        return SU.obtenerTodosLosUsuarios();
        }else{
        return null;
        }
    }
    
    @DeleteMapping("/registros/{id}")
    public void deleteInsertarRegistro(@PathVariable int id){
        SR.eliminarRegistro(id);
    }
    
    @DeleteMapping("/usuarios/{id}")
    public void deleteInsertarUsuario(@PathVariable int id){
        SU.eliminarUsuario(id);
    }
    
}
