/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javaee.javaeemysql;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author arungup
 */
@Stateless
public class PersonFacade extends AbstractFacade<Person> {
    @PersistenceContext(unitName = "germinate.persistence.unit")
    private EntityManager em;

    /*@Override
    protected EntityManager getEntityManager() {
        return em;
    }
*/
    public PersonFacade() {
        super(Person.class);
    }
    
}
