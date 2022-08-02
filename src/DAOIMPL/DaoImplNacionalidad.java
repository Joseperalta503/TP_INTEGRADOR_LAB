package DAOIMPL;

import java.util.ArrayList;

import org.hibernate.Session;

import DAO.DaoNacionalidad;
import entidad.Nacionalidad;
import utils.ConfigHibernate;

public class DaoImplNacionalidad implements DaoNacionalidad {

	ConfigHibernate ch;
	public DaoImplNacionalidad() {
		ch = new ConfigHibernate();
	}

	public boolean Agregar(Nacionalidad nacionalidad) {
		ch.abrirConexion();
		ch.CrearTransaccion();
		boolean agregado = false;
		try {
			ch.Guardar(nacionalidad);
			ch.ConfimarTransaccion();
			agregado = true;
		}catch(Exception e) {
			ch.RollBackTransaccion();
		}
		ch.cerrarSession();
		return agregado;
	}

	public boolean Modificar(Nacionalidad nacionalidad) {
		ch.abrirConexion();
		ch.CrearTransaccion();
		boolean agregado = false;
		try {
			ch.Actualizar(nacionalidad);
			ch.ConfimarTransaccion();
			agregado = true;
		}catch(Exception e) {
			ch.RollBackTransaccion();
		}
		ch.cerrarSession();
		return agregado;
	}

	@Override
	public ArrayList<Nacionalidad> GetAll() {
		ch.abrirConexion();
		ArrayList<Nacionalidad> lista = (ArrayList<Nacionalidad>)ch.getSession().createQuery("FROM Nacionalidad").list();
		ch.cerrarSession();
		return lista;
	}

	public boolean Eliminar(Nacionalidad nacionalidad) {
		ch.abrirConexion();
		ch.CrearTransaccion();
		boolean eliminado = false;
		try {
			ch.Eliminar(nacionalidad);
			ch.ConfimarTransaccion();
			eliminado = true;
		}catch(Exception e) {
			ch.RollBackTransaccion();
		}
		ch.cerrarSession();
		return eliminado;
	}
	
}
