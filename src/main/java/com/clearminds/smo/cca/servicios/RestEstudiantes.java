package com.clearminds.smo.cca.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
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
	@PUT
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
	
//	@Path("/listar")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public ArrayList<Estudiante> listar() throws BDDException{
//		
//		System.out.println("Rest listar...");
//		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
//		
//		ArrayList<Estudiante> estudiantes = null;				
//		
//		try {
//			estudiantes = srvEstudiante.listarEstudiantes();			
//		} catch (BDDException e) {
//			e.printStackTrace();
//			e.getMessage();
//		}
//		return estudiantes;
//		
//	}
	
//	@Path("/buscar/{idEstudiante}")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public Estudiante buscar(@PathParam("idEstudiante") int idEst) throws BDDException{		
//		
//		System.out.println("Rest buscar...");
//		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
//		
//		Estudiante estudianteEnc = null;				
//		
//		try {
//			estudianteEnc = srvEstudiante.buscarEstudiante(idEst);			
//		} catch (BDDException e) {
//			e.printStackTrace();
//			e.getMessage();
//		}
//		return estudianteEnc;
//		
//	}
	
	
	@Path("/busqueda")
	@GET
	public String consultar(){
		return "Mensaje";
	}

}
