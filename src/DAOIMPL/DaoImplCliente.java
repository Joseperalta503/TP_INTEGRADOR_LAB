package DAOIMPL;

import java.util.ArrayList;

import org.hibernate.Session;

import DAO.DaoCliente;
import entidad.Cliente;
import utils.ConfigHibernate;

public class DaoImplCliente implements DaoCliente {

	private Conexion conexion;
	
	ConfigHibernate ch;
	public DaoImplCliente() {
		ch = new ConfigHibernate();
	}

	public boolean Agregar(Cliente cliente) {
		ch.abrirConexion();
		ch.CrearTransaccion();
		boolean agregado = false;
		try {
			ch.Guardar(cliente);
			ch.ConfimarTransaccion();
			agregado = true;
		}catch(Exception e) {
			ch.RollBackTransaccion();
		}
		ch.cerrarSession();
		return agregado;
	}


	public boolean Modificar(Cliente cliente) {
		ch.abrirConexion();
		ch.CrearTransaccion();
		boolean agregado = false;
		try {
			ch.Actualizar(cliente);
			ch.ConfimarTransaccion();
			agregado = true;
		}catch(Exception e) {
			ch.RollBackTransaccion();
		}
		ch.cerrarSession();
		return agregado;
	}


	public ArrayList<Cliente> GetAll() {
		ch.abrirConexion();
		ArrayList<Cliente> lista = (ArrayList<Cliente>)ch.getSession().createQuery("FROM Cliente").list();
		ch.cerrarSession();
		return lista;
	}


	public boolean Eliminar(Cliente cliente) {
		ch.abrirConexion();
		ch.CrearTransaccion();
		boolean eliminado = false;
		try {
			ch.Eliminar(cliente);
			ch.ConfimarTransaccion();
			eliminado = true;
		}catch(Exception e) {
			ch.RollBackTransaccion();
		}
		ch.cerrarSession();
		return eliminado;
	}
	
}