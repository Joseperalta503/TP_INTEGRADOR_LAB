package DAOIMPL;

import java.util.ArrayList;

import entidad.Libro;
import utils.ConfigHibernate;

public class DaoImplLibro {
	
	ConfigHibernate ch;
	public DaoImplLibro() {
		ch = new ConfigHibernate();
	}

	public boolean Agregar(Libro libro) {
		ch.abrirConexion();
		ch.CrearTransaccion();
		boolean agregado = false;
		try {
			ch.Guardar(libro);
			ch.ConfimarTransaccion();
			agregado = true;
		}catch(Exception e) {
			ch.RollBackTransaccion();
		}
		ch.cerrarSession();
		return agregado;
	}


	public boolean Modificar(Libro libro) {
		ch.abrirConexion();
		ch.CrearTransaccion();
		boolean agregado = false;
		try {
			ch.Actualizar(libro);
			ch.ConfimarTransaccion();
			agregado = true;
		}catch(Exception e) {
			ch.RollBackTransaccion();
		}
		ch.cerrarSession();
		return agregado;
	}


	public ArrayList<Libro> GetAll() {
		ch.abrirConexion();
		ArrayList<Libro> lista = (ArrayList<Libro>)ch.getSession().createQuery("FROM Libro").list();
		ch.cerrarSession();
		return lista;
	}


	public boolean Eliminar(Libro libro) {
		ch.abrirConexion();
		ch.CrearTransaccion();
		boolean eliminado = false;
		try {
			ch.Eliminar(libro);
			ch.ConfimarTransaccion();
			eliminado = true;
		}catch(Exception e) {
			ch.RollBackTransaccion();
		}
		ch.cerrarSession();
		return eliminado;
	}
}
