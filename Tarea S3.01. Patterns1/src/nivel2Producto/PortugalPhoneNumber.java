package nivel2Producto;

import nivel2Interfaces.PhoneNumber;

public class PortugalPhoneNumber implements PhoneNumber {
	
	private int numero;
	private int indicativo;
	
	public PortugalPhoneNumber() {
		this.indicativo = +351;
	}

	@Override
	public void setContacto(int numero) {
		
		this.numero = numero;
		System.out.println("El numero de telefono es: "+ indicativo + " "+ numero);
		

	}

}
