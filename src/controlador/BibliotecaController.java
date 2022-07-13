package controlador;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import entidad.Usuario;
import utils.ConfigHibernate;

@Controller
public class BibliotecaController {

	@RequestMapping("Biblioteca.html")
	public ModelAndView Biblioteca(String usuarioActual) {
		ModelAndView MV = new ModelAndView();
		MV.addObject("usuarioActual", usuarioActual);
		MV.setViewName("biblioteca");
		

		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();

		ch.cerrarSession();
		ch.cerrarSessionFactory();
		return MV;
	}
}