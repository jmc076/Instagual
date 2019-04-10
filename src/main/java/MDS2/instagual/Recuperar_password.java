package MDS2.instagual;

import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Recuperar_password extends Recuperar_password_ventana {
	/*private Label _mensajeL;
	private Button _recuperarPasswordB;
	private Button _cancelarB;
	private TextField _correoTF;*/
	public Usuario_no_registrado_movil _usuario_no_registrado_movil;	
	public Correo_no_encontrado_password _correo_no_encontrado_contraseña;

	public void enviarCorreoDePassword() {
		throw new UnsupportedOperationException();
	}

	public Recuperar_password() {
		Inicializar();
		
		recuperarPasswordB.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {

				recuperar_pass();

			}		
		});
	}

	public void cancelar() {
		throw new UnsupportedOperationException();
	}
	
	void Inicializar(){
		addComponent(cabecera);
		addComponent(logo_instagualI);
		addComponent(correoTF);
		addComponent(mensajeL);
		addComponent(mitad2);
		addComponent(cancelarB);
		addComponent(recuperarPasswordB);
	}
	
	private void recuperar_pass() {
		// TODO Auto-generated method stub
		
	}		
}