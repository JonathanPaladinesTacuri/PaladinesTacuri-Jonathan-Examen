package ec.edu.ups.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.modelo.Libro;
@Stateless
public class LibroFacade extends AbstractFacade<Libro>{
	  @PersistenceContext(unitName = "PaladinesTacuri-Jonathan-Examen")
	    private EntityManager em;
	    public LibroFacade() {
		super(Libro.class);
	    }    
	    @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }
	
		
}
