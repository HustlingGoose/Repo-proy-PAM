/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectofinal.API_RE.Repositorios;

import com.proyectofinal.API_RE.Entidades.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jeanm
 */
@Repository
public interface RepositorioUsuarios extends JpaRepository<Usuarios,Integer>{
    
    Usuarios findFirstByOrderByIDDesc();
    
}
