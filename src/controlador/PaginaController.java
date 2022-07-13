package controlador;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import entidad.Genero;
import entidad.Usuario;
import utils.ConfigHibernate;

@Controller
public class PaginaController {

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
		//usuario.setApellido(txtApellido);
		//usuario.setNombre(txtNombre);

		session.save(usuario);

		session.getTransaction().commit();

		session.close();

		sessionFactory.close();

		return MV;
	}
	
	@RequestMapping("panel.html")
	public ModelAndView logeo(String txtUsuario, String txtContrasenia) {
		ModelAndView MV = new ModelAndView();
		MV.addObject("usuarioActual", txtUsuario);
		MV.setViewName("panel");
		ModelAndView MVException = new ModelAndView();
		MVException.setViewName("index");

		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();

		try {
			Usuario usuario = (Usuario)session.createQuery("FROM Usuario u where u.usuarioLogeo =:usuarioParametro")
					.setParameter("usuarioParametro", txtUsuario)
					.uniqueResult();
			System.out.printf(usuario.toString());
			if(usuario != null && usuario.getContrasenia().equals(txtContrasenia)) {
				ch.cerrarSession();
				return MV;
			}
			ch.cerrarSession();
			return MVException;
		}catch(Exception e) {
			System.out.printf("EXCEPCIÓN");
			ch.cerrarSession();
			e.printStackTrace();
			return MVException;
		}
	}
	
	

	@RequestMapping("index.html")
	public ModelAndView index() {
		ModelAndView MV = new ModelAndView();
		MV.setViewName("index");
		
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		session.beginTransaction();
		Usuario usuario = new Usuario("asd", "asd");
		session.save(usuario);
		session.getTransaction().commit();
		ch.cerrarSession();
		ch.cerrarSessionFactory();
		
		return MV;
	}

}
