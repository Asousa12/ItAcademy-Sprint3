package nivel2Producto;

import nivel2Interfaces.Address;

public class SpainAddress implements Address {
	
	private String calle;
	private int numeroPuerta;
	private String codigoPostal;
	private String ciudad;
	
	public SpainAddress() {
	}	

	@Override
	public void setAddress(String calle, int numeroPuerta, String codigoPostal, String ciudad) {
		
		this.calle=calle;
		this.numeroPuerta=numeroPuerta;
		this.codigoPostal=codigoPostal;
		this.ciudad=ciudad;

		
		System.out.println("La calle se llama: " + calle + ", con el numero de puerta: " + numeroPuerta + " e con el codigo postal: " + codigoPostal + " e la ciudade es: " + ciudad);	
	}


	
}