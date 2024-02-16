package modelo.javabean;

import java.util.ArrayList;

import modelo.dao.GestionAgenda;

public class AgendaContactos implements GestionAgenda{
	
	private ArrayList<Contacto> lista;
	private String nombreAgenda;
	
	public AgendaContactos() {

		lista = new ArrayList<>();
		cargardatos();
	}
	
	private void cargardatos() {
		lista.add(new Contacto("Tomas", "Escudero", "123456789", "tomas@ifp.es", "Inovacion en Formacion Profesional"));
		lista.add(new Contacto("Matthew", "TheGoat", "613459588", "tmatrix777@gmail.com", "Sony"));
		lista.add(new Contacto("CR7", "Siuuuuuuuuuuu", "77777777", "cr7@hotmail.com", "Al Nassr"));
	
	}
	
	// Get & Setters of nombreAgenda
	public String getNombreAgenda() {
		return nombreAgenda;
	}

	public void setNombreAgenda(String nombreAgenda) {
		this.nombreAgenda = nombreAgenda;
	}

	
	//Implement methods from GestionAgenda
	@Override
	public boolean altaContacto(Contacto contacto) {
		if (!lista.contains(contacto)) {
			lista.add(contacto);
			return true;
		}else
			return false;
	}

	@Override
	public boolean eliminarContacto(Contacto contacto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contacto buscarUno(String nombre) {
		Contacto contacto = new Contacto();
		contacto.setNombre(nombre);;
		int pos = lista.indexOf(contacto);
		if (pos == -1)
			return null;
		else
			return lista.get(pos);
		
	}

	@Override
	public Contacto buscarTelefono(String telefono) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contacto buscarEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cambiarDatos(Contacto contacto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Contacto> contactosPorEmpresa(String empresa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void exportarContactos(String nombreFichero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void importarContactos(String nombreFichero) {
		// TODO Auto-generated method stub
		
	}

	
}
