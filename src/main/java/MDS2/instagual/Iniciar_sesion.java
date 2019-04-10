package MDS2.instagual;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class Iniciar_sesion extends Iniciar_sesion_ventana {
	/*
	 * private TextField _correoTF; private TextField _passwordTF; private Button
	 * _iniciarSesionB;
	 */

	public void iniciarSesion() {
		Inicializar();

		recuperarPasswordB.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {

				recuperar_pass();
			}
		});

	}

	void Inicializar() {
		addComponent(cabecera);
		addComponent(logo_instagualI);
		addComponent(correoTF);
		addComponent(passwordTF);
		addComponent(inicio);
		addComponent(iniciarSesionB);
		addComponent(recuperarCuentaB);
		addComponent(recuperarPasswordB);
		addComponent(noTieneCuentaL);
		addComponent(registro);
		addComponent(registrarseB);
		addComponent(invitadoB);
	}

	private void recuperar_pass() {
		Recuperar_password rC = new Recuperar_password();
		rC.Inicializar();
	}
}