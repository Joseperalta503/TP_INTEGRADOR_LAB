package DAOIMPL;

import java.util.ArrayList;

import DAO.DaoPrestamo;
import entidad.Prestamo;
import utils.ConfigHibernate;

public class DaoImplPrestamo implements DaoPrestamo{

	ConfigHibernate ch;
	public DaoImplPrestamo() {
		ch = new ConfigHibernate();
	}

	public boolean Agregar(Prestamo pres) {
		ch.abrirConexion();
		ch.CrearTransaccion();
		boolean agregado = false;
		try {
			ch.Guardar(pres);
			ch.ConfimarTransaccion();
			agregado = true;
		}catch(Exception e) {
			ch.RollBackTransaccion();
		}
		ch.cerrarSession();
		return agregado;
	}


	public boolean Modificar(Prestamo pres) {
		ch.abrirConexion();
		ch.CrearTransaccion();
		boolean agregado = false;
		try {
			ch.Actualizar(pres);
			ch.ConfimarTransaccion();
			agregado = true;
		}catch(Exception e) {
			ch.RollBackTransaccion();
		}
		ch.cerrarSession();
		return agregado;
	}


	public ArrayList<Prestamo> GetAll() {
		ch.abrirConexion();
		ArrayList<Prestamo> lista = (ArrayList<Prestamo>)ch.getSession().createQuery("FROM Prestamo").list();
		ch.cerrarSession();
		return lista;
	}


	public boolean Eliminar(Prestamo pres) {
		ch.abrirConexion();
		ch.CrearTransaccion();
		boolean eliminado = false;
		try {
			ch.Eliminar(pres);
			ch.ConfimarTransaccion();
			eliminado = true;
		}catch(Exception e) {
			ch.RollBackTransaccion();
		}
		ch.cerrarSession();
		return eliminado;
	}
	
}
