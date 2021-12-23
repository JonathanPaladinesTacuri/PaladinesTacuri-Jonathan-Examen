package ec.edu.ups.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.modelo.Capitulo;


@Stateless
public class CapituloFacade extends AbstractFacade<Capitulo> {
	   @PersistenceContext(unitName = "PaladinesTacuri-Jonathan-Examen")
	    private EntityManager em;
	    
	    public CapituloFacade() {
		super(Capitulo.class);
	    }    

	    @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }

}
