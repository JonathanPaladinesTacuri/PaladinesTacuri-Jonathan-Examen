package ec.edu.ups.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Capitulo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int numero;
	private String titulo;
	@ManyToOne
	@JoinColumn
	private Libro libro;
	@JoinColumn(name = "fk_autor")
	@ManyToOne
	private Autor autor;
	public Capitulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Capitulo(int numero, String titulo, Libro libro, Autor a) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.libro = libro;
		this.autor = a;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	
	
	
	
}
