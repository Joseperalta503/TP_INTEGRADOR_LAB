package DAOIMPL;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import DAO.DaoBiblioteca;
import entidad.Biblioteca;
import entidad.Cliente;
import utils.ConfigHibernate;

public class DaoImplBiblioteca implements DaoBiblioteca {

	@Autowired
	private Conexion conexion;
	
	ConfigHibernate ch;
	public DaoImplBiblioteca() {
		ch = new ConfigHibernate();
	}
	
	@Override
	public boolean addBiblioteca(Biblioteca biblioteca) {
		conexion.abrirConexion();
		boolean flag = true;
		try {
			conexion.InitTransaction();
			conexion.SaveObject(biblioteca);
			conexion.CommitTransaccion();
		} catch (Exception e) {
			conexion.RollbackTransaccion();
			flag = false;
		}
		conexion.cerrarSession();
		return flag;
	}

	@Override
	public ArrayList<Biblioteca> getBibliotecas() {
		conexion.abrirConexion();
		ArrayList<Biblioteca> lista = (ArrayList<Biblioteca>)conexion.getSession().createQuery("FROM Biblioteca").list();
		conexion.cerrarSession();
		return lista;
	}
	
	@Override
	public Biblioteca getBibliotecaById(int id) {
		conexion.abrirConexion();
		Biblioteca biblioteca = (Biblioteca)conexion.getSession().createQuery("FROM Biblioteca b Where b.ID = '" + id + "'").uniqueResult();
		conexion.cerrarSession();
		return biblioteca;
	}
	

	@Override
	public boolean deleteBiblioteca(Biblioteca biblioteca) {
		conexion.abrirConexion();
		boolean flag = true;
		try {
			conexion.InitTransaction();
			conexion.EraseObject(biblioteca);
			conexion.CommitTransaccion();
		} catch (Exception e) {
			conexion.RollbackTransaccion();
			flag = false;
		}
		conexion.cerrarSession();
		return flag;
	}

	@Override
	public ArrayList<Biblioteca> getAllAvailableBibliotecas() {
		conexion.abrirConexion();
		ArrayList<Biblioteca> lista = (ArrayList<Biblioteca>)conexion.getSession().createQuery("FROM Biblioteca b Where b.Estado = 'En biblioteca'").list();
		conexion.cerrarSession();
		return lista;
	}

	@Override
	public boolean modifyBiblioteca(Biblioteca biblioteca) {
		conexion.abrirConexion();
		boolean flag = true;
		try {
			conexion.InitTransaction();
			conexion.UpdateObject(biblioteca);
			conexion.CommitTransaccion();
		} catch (Exception e) {
			conexion.RollbackTransaccion();
			flag = false;
		}
		conexion.cerrarSession();
		return flag;
	}
	
	
	public ArrayList<Biblioteca> getLibroXbilioteca() {
		ch.abrirConexion();
		ArrayList<Biblioteca> lista = (ArrayList<Biblioteca>)ch.getSession().createQuery("FROM Biblioteca").list();
		ch.cerrarSession();
		return lista;
	}
	

}