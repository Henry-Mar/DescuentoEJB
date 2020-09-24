/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb;

import com.entidades.Descuento;
import com.servicio.DescuentoFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author USUARIO
 */

@Named("DescuentoBean")
@RequestScoped

public class DescuentoBean {

    @EJB
    private DescuentoFacadeLocal descuentoFacade;
    private Descuento newdescuento;

    public Descuento getNewdescuento() {
        
        if(newdescuento==null){
        newdescuento = new Descuento();
        }
        return newdescuento;
    }

    public void setNewdescuento(Descuento newdescuento) {
        this.newdescuento = newdescuento;
    }
    
    
    public  DescuentoBean(){
        
        
    } 
    public List<Descuento>getDescuento(){
        
        return this.descuentoFacade.findAll();
    }
    
    public void Insertar(){
        this.descuentoFacade.create(newdescuento);
    }
    
    public void Eliminar(Descuento descuento){
        
      this.descuentoFacade.remove(descuento);
    }
    
    public void Actualizar(Descuento descuento){
        this.descuentoFacade.edit(descuento);
    }
}
