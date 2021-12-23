package ec.edu.ups.controler;

import java.io.Serializable;


import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.AutorFacade;
import ec.edu.ups.modelo.Autor;


@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class crearAutorControler implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private AutorFacade ejbAutorFacade;
	

	public void agregarDatos() {
		
		
		//Autores
		Autor tar1 = new Autor("Pedro Pérez","Español");
		Autor tar2 = new Autor("Joaquín Romero","Ecuatoriano");
		Autor tar3 = new Autor("Ana Rosales","Argentina");
		Autor tar4 = new Autor("Johan Smith","Inglés");
		
		ejbAutorFacade.create(tar1);
		ejbAutorFacade.create(tar2);
		ejbAutorFacade.create(tar3);
		ejbAutorFacade.create(tar4);

		
	
	}
}
