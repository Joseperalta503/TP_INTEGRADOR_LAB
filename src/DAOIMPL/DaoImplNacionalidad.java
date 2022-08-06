package DAOIMPL;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import DAO.DaoNacionalidad;
import DAOIMPL.Conexion;
import entidad.Nacionalidad;

public class DaoImplNacionalidad implements DaoNacionalidad {

	@Autowired
	Conexion conexion;
	public DaoImplNacionalidad() {
		conexion = new Conexion();
	}
	
	public boolean Agregar(Nacionalidad nacionalidad) {
		System.out.println("hola: " + nacionalidad);
		conexion.abrirConexion();
		System.out.println("Es la conexion: " + conexion);
		boolean agregado = true;
		try {
			conexion.IniciarTransaccion();
			conexion.GuardarObjeto(nacionalidad);
			conexion.CommitTransaccion();
			
		}catch(Exception e) {
			conexion.RollbackearTransaccion();
			agregado = false;
		}
		conexion.cerrarSession();
		return agregado;
	}

	@Override
	public boolean Modificar(Nacionalidad nacionalidad) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public ArrayList<Nacionalidad> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean Eliminar(Nacionalidad nacionalidad) {
		// TODO Auto-generated method stub
		return false;
	}

//	public boolean Modificar(Nacionalidad nacionalidad) {
//		ch.abrirConexion();
//		ch.CrearTransaccion();
//		boolean agregado = false;
//		try {
//			ch.Actualizar(nacionalidad);
//			ch.ConfimarTransaccion();
//			agregado = true;
//		}catch(Exception e) {
//			ch.RollBackTransaccion();
//		}
//		ch.cerrarSession();
//		return agregado;
//	}
//
//	@Override
//	public ArrayList<Nacionalidad> GetAll() {
//		ch.abrirConexion();
//		ArrayList<Nacionalidad> lista = (ArrayList<Nacionalidad>)ch.getSession().createQuery("FROM Nacionalidad").list();
//		ch.cerrarSession();
//		return lista;
//	}
//
//	public boolean Eliminar(Nacionalidad nacionalidad) {
//		ch.abrirConexion();
//		ch.CrearTransaccion();
//		boolean eliminado = false;
//		try {
//			ch.Eliminar(nacionalidad);
//			ch.ConfimarTransaccion();
//			eliminado = true;
//		}catch(Exception e) {
//			ch.RollBackTransaccion();
//		}
//		ch.cerrarSession();
//		return eliminado;
//	}
//	
}
