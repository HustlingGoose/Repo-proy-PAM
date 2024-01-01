/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectofinal.API_RE.Repositorios;


import com.proyectofinal.API_RE.Entidades.Registros;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jeanm
 */
@Repository
public interface RepositorioRegistros extends JpaRepository<Registros,Integer>{
    
    
    List <Registros> findByUsuario(int usuario);
    
    Registros findFirstByOrderByIDDesc();
}
