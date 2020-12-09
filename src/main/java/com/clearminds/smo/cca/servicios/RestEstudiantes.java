package com.clearminds.smo.cca.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.clearminds.cca.dtos.Estudiante;
import com.clearminds.cca.excepciones.BDDException;
import com.clearminds.cca.servicios.ServicioEstudiante;


@Path("/estudiantes")
public class RestEstudiantes {
	
//	@Path("/insertar1")
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	public void insertar1(Estudiante e){		
//		System.out.println("Rest insertar: " + e);		
//	}
	
	@Path("/insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante est) throws BDDException{
		
		System.out.println("Rest insertar: " + est);
		
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {
			srvEstudiante.insertarEstudiante(est);			
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}
		
	}
	
	@Path("/actualizar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Estudiante est) throws BDDException{
		
		System.out.println("Rest actualizar: " + est);
		
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {
			srvEstudiante.actualizarEstudiante(est);			
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}
		
	}
	
	@Path("/busqueda")
	@GET
	public String consultar(){
		return "Mensaje";
	}

}
