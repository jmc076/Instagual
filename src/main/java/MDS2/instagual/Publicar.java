package MDS2.instagual;

import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.InlineDateField;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.DateField;
import com.vaadin.ui.TextArea;

public class Publicar extends Publicar_ventana {
	/*private Button _publicarB;
	private Button _galeriaB;
	private TextField _descripcionTF;
	private Label _publicacionL;
	private Button _atrasB;*/
	public Menu_inferior _menu_inferior;
	public Ver_lista_de_elementos_en_la_publicacion _ver_lista_de_elementos_en_la_publicacion;
	private int longitud = galeria_layout.getComponentCount();
	
	public void Publicar() {
		Inicializar();
	
	}
	
	void Inicializar() {
		addComponent(barra_superior);
		addComponent(contenedor_barra);
		addComponent(atrasB);
		addComponent(galeriaB);
		addComponent(imagen_video_layout);
		addComponent(publicarB);
		addComponent(publicarB1);
		addComponent(publicar);
		addComponent(elemento_imagen);
		addComponent(galeria_layout);
		addComponent(descripcion_layout);
		addComponent(descripcionTA);
		addComponent(menu_inferior_layout);
		addComponent(contenedor_horizontal);
		addComponent(inicio);
		addComponent(paginaPrincipalB);
		addComponent(buscar);
		addComponent(buscarB);
		addComponent(notificaciones);
		addComponent(verNotificacionesActividadesB);
		addComponent(perfil);
		addComponent(verPerfilPropioB);
		galeria_layout.addComponent(new Button("R/C 1"));
		for (int i = 0; i < 3; i++) {
			galeria_layout.addComponent(new Button("Col " + (galeria_layout.getCursorX() + 1)));
		}
	}
	
	public void publicar() {
		throw new UnsupportedOperationException();
	}

	public void galeria() {
		throw new UnsupportedOperationException();
	}

	public void atras() {
	}
}