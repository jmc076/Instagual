package MDS2.instagual;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class Buscar_vista_admin_ventana extends VerticalLayout {
	protected HorizontalLayout cabecera;
	protected Image instaTextI;
	protected TextField busquedaTF;
	protected Button buscarB;
	protected Button cerrar_sesion_admin;
	protected Label mensajeBienvenidaL;
	protected Button buscarUsuarioB;
	protected Button buscarEtiquetaB;
	protected VerticalLayout lista_de_usuarios_de_busqueda;
	protected Image imagenUsuarioI;
	protected Label nombreUsuarioL;
	protected Button verPerfilUsuarioB;
	protected VerticalLayout lista_de_publicaciones1;

	public Buscar_vista_admin_ventana() {
		Design.read(this);
	}
}
