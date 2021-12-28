package ec.edu.ups.controler;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.AutorFacade;
import ec.edu.ups.ejb.CapituloFacade;
import ec.edu.ups.ejb.LibroFacade;
import ec.edu.ups.modelo.Capitulo;
import ec.edu.ups.modelo.Libro;


@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class crearLibroControler implements Serializable {
	  private static final long serialVersionUID = 1L;
	  @EJB
	  private CapituloFacade ejbCapituloFacade;
	  @EJB
	  private AutorFacade ejbAutorFacade;
	  @EJB
	  private LibroFacade ejbLibroFacade;
	  
	  private String nombre;
	  private String isbn;
	  private int numPaginas;
	  private List<Libro> libros;
	  private List<Capitulo> capitulos;

	  
	public crearLibroControler() {
		super();
		// TODO Auto-generated constructor stub
		


	}
	
	 @PostConstruct
	    public void init() {
		
		libros = ejbLibroFacade.findAll();
		capitulos = ejbCapituloFacade.findAll();
			}
	 
	 public CapituloFacade getEjbCapituloFacade() {
		return ejbCapituloFacade;
	}

	public void setEjbCapituloFacade(CapituloFacade ejbCapituloFacade) {
		this.ejbCapituloFacade = ejbCapituloFacade;
	}

	public AutorFacade getEjbAutorFacade() {
		return ejbAutorFacade;
	}

	public void setEjbAutorFacade(AutorFacade ejbAutorFacade) {
		this.ejbAutorFacade = ejbAutorFacade;
	}

	public LibroFacade getEjbLibroFacade() {
		return ejbLibroFacade;
	}

	public void setEjbLibroFacade(LibroFacade ejbLibroFacade) {
		this.ejbLibroFacade = ejbLibroFacade;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	
	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
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

	public String add() {
	    	ejbLibroFacade.create(new Libro(this.nombre,this.isbn,this.numPaginas));
	    	libros = ejbLibroFacade.findAll();
	    	return null;
	        }

}
