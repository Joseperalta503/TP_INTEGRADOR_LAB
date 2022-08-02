package controlador;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DAOIMPL.DaoImplCliente;
import entidad.Cliente;
import entidad.Usuario;
import utils.ConfigHibernate;

@Controller
public class CientesController {

	@RequestMapping("Cliente.html")
	public ModelAndView Biblioteca(String usuarioActual) {
		DaoImplCliente daoCliente = new DaoImplCliente();
		ArrayList<Cliente> clientes = daoCliente.GetAll();
		ModelAndView MV = new ModelAndView();
		MV.addObject("usuarioActual", usuarioActual);
		MV.addObject("data", clientes);
		MV.setViewName("cliente");

		return MV;
	}
}