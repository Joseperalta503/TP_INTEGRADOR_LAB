package controlador;

import java.sql.Date;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ServiceImpl.ServiceClienteImpl;
import entidad.Cliente;
import entidad.Nacionalidad;
import entidad.Usuario;
import utils.ConfigHibernate;


@Controller
public class ClientesController {
	
	@RequestMapping("ListaCliente.html")
	public ModelAndView ListaClientes() {
		ServiceClienteImpl Clientes = new ServiceClienteImpl();
		ArrayList<Cliente> lista_clientes = Clientes.GetAll();
		ModelAndView MV = new ModelAndView();
		MV.addObject("data", lista_clientes);
		MV.setViewName("ListaCliente");

		return MV;
	}
	
	@RequestMapping("AltaCliente.html")
	public ModelAndView AltaCliente() {
		ModelAndView MV = new ModelAndView();
		MV.setViewName("AltaCliente");
		return MV;
	}
	
	@RequestMapping("AgregarCliente.html")
	public ModelAndView agregar_Cliente(String dni, String nombre, String apellido, 
			Nacionalidad nacionalidad, String email,String direccion, String localidad, String telefono, Date fechanacimiento) {
		
		ServiceClienteImpl Clientes = new ServiceClienteImpl();
		Cliente cliente = new Cliente();
		cliente.setApellido(apellido);
		cliente.setDireccion(direccion);
		cliente.setDni(Integer.parseInt(dni));
		cliente.setEmail(email);
		cliente.setFechaNacimiento(fechanacimiento);
		cliente.setLocalidad(localidad);
		cliente.setNombre(nombre);
		cliente.setTelefono(Integer.parseInt(telefono));
		cliente.setNacionalidad(nacionalidad);
		
		Clientes.Agregar(cliente);
		
//		if(estado) {
//			System.out.println("NASHEEEE");
//		}
//		else {
//			System.out.println("NASHEN'T :C");
//		}
		
		ModelAndView MV = new ModelAndView();
		
		MV.setViewName("ListaCliente");

		return MV;
	}
}