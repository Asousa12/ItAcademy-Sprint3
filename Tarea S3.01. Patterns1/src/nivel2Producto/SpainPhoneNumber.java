package nivel2Producto;

import nivel2Interfaces.PhoneNumber;

public class SpainPhoneNumber implements PhoneNumber {
	
	private int numero;
	private int indicativo;
	
	public SpainPhoneNumber() {
		
		this.indicativo = +34;
	}

	@Override
	public void setContacto(int numero) {
		
		this.numero=numero;
		
		 System.out.println("Contacto de telefone con el numero: " + indicativo +" " + numero);
		
	}

	

}