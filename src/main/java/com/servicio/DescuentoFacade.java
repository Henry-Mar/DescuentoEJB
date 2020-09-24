/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicio;

import com.entidades.Descuento;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USUARIO
 */
@Stateless
public class DescuentoFacade extends AbstractFacade<Descuento> implements DescuentoFacadeLocal {

    @PersistenceContext(unitName = "ejbdescuento")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DescuentoFacade() {
        super(Descuento.class);
    }
    
}
