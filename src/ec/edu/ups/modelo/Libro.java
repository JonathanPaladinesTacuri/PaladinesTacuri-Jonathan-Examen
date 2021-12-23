package ec.edu.ups.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	private String isbn;
	private int numPaginas;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "libro")
	private List<Capitulo> capitulos;


	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Libro(String nombre, String isbn, int numPaginas, List<Capitulo> capitulos) {
		super();
		this.nombre = nombre;
		this.isbn = isbn;
		this.numPaginas = numPaginas;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public List<Capitulo> getCapitulos() {
		return capitulos;
	}


	public void setCapitulos(List<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}
	
	
	
}
