package DAOIMPL;

import java.util.ArrayList;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import DAO.DaoCliente;
import entidad.Cliente;

public class DaoImplCliente implements DaoCliente {

	@Autowired
	Conexion conexion;
	public DaoImplCliente() {
		conexion = new Conexion();
	}
	
	@Override
	public boolean Agregar(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean Modificar(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public ArrayList<Cliente> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean Eliminar(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

//	public boolean Agregar(Cliente cliente) {
//		ch.abrirConexion();
//		ch.CrearTransaccion();
//		boolean agregado = false;
//		try {
//			ch.Guardar(cliente);
//			ch.ConfimarTransaccion();
//			agregado = true;
//		}catch(Exception e) {
//			ch.RollBackTransaccion();
//		}
//		ch.cerrarSession();
//		return agregado;
//	}
//
//
//	public boolean Modificar(Cliente cliente) {
//		ch.abrirConexion();
//		ch.CrearTransaccion();
//		boolean agregado = false;
//		try {
//			ch.Actualizar(cliente);
//			ch.ConfimarTransaccion();
//			agregado = true;
//		}catch(Exception e) {
//			ch.RollBackTransaccion();
//		}
//		ch.cerrarSession();
//		return agregado;
//	}
//
//
//	public ArrayList<Cliente> GetAll() {
//		ch.abrirConexion();
//		ArrayList<Cliente> lista = (ArrayList<Cliente>)ch.getSession().createQuery("FROM Cliente").list();
//		ch.cerrarSession();
//		return lista;
//	}
//
//
//	public boolean Eliminar(Cliente cliente) {
//		ch.abrirConexion();
//		ch.CrearTransaccion();
//		boolean eliminado = false;
//		try {
//			ch.Eliminar(cliente);
//			ch.ConfimarTransaccion();
//			eliminado = true;
//		}catch(Exception e) {
//			ch.RollBackTransaccion();
//		}
//		ch.cerrarSession();
//		return eliminado;
//	}
	
}