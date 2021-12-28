package ec.edu.ups.controler;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.CapituloFacade;
import ec.edu.ups.ejb.LibroFacade;
import ec.edu.ups.modelo.Autor;
import ec.edu.ups.modelo.Capitulo;
import ec.edu.ups.modelo.Libro;



@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class crearCapituloControler implements Serializable  {
	  private static final long serialVersionUID = 1L;
	  @EJB
	  private LibroFacade ejbLibroFacade;
	  @EJB
	  private CapituloFacade ejbCapituloFacade;
	  
		private int numero;
		private String titulo;
		private List<Capitulo> capitulos;

	  
	  public crearCapituloControler() {
			super();
			// TODO Auto-generated constructor stub
		}
	  @PostConstruct
	    public void init() {
			capitulos = ejbCapituloFacade.findAll();
	
			}
	  
	  
	  public LibroFacade getEjbLibroFacade() {
		return ejbLibroFacade;
	}
	public void setEjbLibroFacade(LibroFacade ejbLibroFacade) {
		this.ejbLibroFacade = ejbLibroFacade;
	}
	public CapituloFacade getEjbCapituloFacade() {
		return ejbCapituloFacade;
	}
	public void setEjbCapituloFacade(CapituloFacade ejbCapituloFacade) {
		this.ejbCapituloFacade = ejbCapituloFacade;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<Capitulo> getCapitulos() {
		return capitulos;
	}
	public void setCapitulos(List<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String add(Libro l, Autor a) {
	    	ejbCapituloFacade.create(new Capitulo(this.numero,this.titulo,l,a));
	    	capitulos = ejbCapituloFacade.findAll();
	    	return null;
	        }
	    
	  
}
