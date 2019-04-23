package MDS2.instagual;

import com.vaadin.event.MouseEvents;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;

public class Menu_inferior extends Menu_inferior_ventana {
	/*private Button _paginaPrincipalB;
	private Button _buscarB;
	private Button _publicarB;
	private Button _verNotificacionesActividadesB;
	private Button _verPerfilPropioB;*/
	public Usuario_registrado _usuario_registrado;
	public Buscar_vista_registrado _buscar_vista_registrado;
	public Publicar _publicar;
	public Ver_perfil_de_usuario_vista_perfil_propio _ver_perfil_de_usuario_vista_perfil_propio;
	public Ver_notificaciones_actividades _ver_notificaciones_actividades;
	public Ver_pagina_principal _ver_pagina_principal;
	
	public void MenuInferior() {
		Inicializar();
		
	}
	
	void Inicializar() {
		addComponent(paginaPrincipalB);
		addComponent(buscarB);
		addComponent(publicarB);
		addComponent(verNotificacionesActividadesB);
		addComponent(inicio);
		addComponent(verPerfilPropioB);
		addComponent(perfil);
		addComponent(notificaciones);
		addComponent(publicar);
		addComponent(buscar);
		addComponent(inicio);
		addComponent(contenedor_horizontal);
		addComponent(menu_inferior_layout);
	}

	public void verPaginaPrincipal() {

	}

	public void buscar() {
		throw new UnsupportedOperationException();
	}

	public void publicar() {
		throw new UnsupportedOperationException();
	}

	public void verNotificacionesActividades() {
		throw new UnsupportedOperationException();
	}

	public void verPerfilPropio() {
		throw new UnsupportedOperationException();
	}
}