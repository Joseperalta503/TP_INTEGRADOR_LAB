package controlador;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DAO.DaoImplCliente;
import DAOIMPL.DaoImplNacionalidad;
import entidad.Cliente;
import entidad.Nacionalidad;
import entidad.Usuario;
import utils.ConfigHibernate;

@Controller
public class PaginaController {
	private boolean dataCargada = false;
	
	@RequestMapping("login.html")
	public ModelAndView login(String txtUsuario, String txtContrasenia) {
		
		if(!dataCargada) {
			this.cargarData();
			dataCargada = true;
		}
		System.out.println("Estoy dentro de login");
		
		ModelAndView MV = new ModelAndView();
		MV.addObject("usuarioActual", txtUsuario);
		MV.setViewName("login");
		ModelAndView MVException = new ModelAndView();
		MVException.setViewName("login");

		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion1();

		try {
			Usuario usuario = (Usuario) session.createQuery("FROM Usuario u where u.usuarioLogeo =:usuarioParametro")
					.setParameter("usuarioParametro", txtUsuario).uniqueResult();
			if (usuario != null && usuario.getContrasenia().equals(txtContrasenia)) {
				ch.cerrarSession();
				return MV;
			}
			ch.cerrarSession();
			return MVException;
		} catch (Exception e) {
			System.out.printf("EXCEPCIÓN");
			ch.cerrarSession();
			e.printStackTrace();
			return MVException;
		}
	}

	@RequestMapping("agregarUsuario.html")
	public ModelAndView agregarUsuario(String txtNombre, String txtApellido) {
		ModelAndView MV = new ModelAndView();
		MV.setViewName("index");

		// TODO - Agregar en un DaoUsuario
		SessionFactory sessionFactory;

		Configuration configuration = new Configuration();
		configuration.configure();

		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();

		sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		Usuario usuario = new Usuario();
		// usuario.setApellido(txtApellido);
		// usuario.setNombre(txtNombre);

		session.save(usuario);

		session.getTransaction().commit();

		session.close();

		sessionFactory.close();

		return MV;
	}

	@RequestMapping("index.html")
	public ModelAndView logeo(String txtUsuario, String txtContrasenia) {
		ModelAndView MV = new ModelAndView();
		MV.addObject("usuarioActual", txtUsuario);
		MV.setViewName("index");
		return MV;
	}
	
	private void cargarData() {
		DaoImplNacionalidad daoImplNacionalidad = new DaoImplNacionalidad();
		DaoImplCliente daoImplCliente = new DaoImplCliente();
		Nacionalidad nacionalidad = new Nacionalidad("Argentina");
		daoImplNacionalidad.Agregar(nacionalidad);
		Cliente cliente = new Cliente(222, "Ramiro", "Alegre", "ralegre@asd.com", "asdsa 1 2 3", "General Pacheco", 21312231, new Date(), nacionalidad);
		daoImplCliente.Agregar(cliente);
	}

}
