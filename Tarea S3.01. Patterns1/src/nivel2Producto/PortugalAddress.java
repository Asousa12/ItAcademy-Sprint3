package nivel2Producto;

import nivel2Interfaces.Address;

public class PortugalAddress implements Address{
	
	private String calle;
	private int numeroPuerta;
	private String codigoPostal;
	private String ciudad;
	
	public PortugalAddress() {
		
	}

	@Override
	public void setAddress(String calle, int numeroPuerta, String codigoPostal, String ciudad) {
		
		this.calle=calle;
		this.numeroPuerta=numeroPuerta;;
		this.codigoPostal=codigoPostal;
		this.ciudad=ciudad;
		
		System.out.println("La calle se llama: " + calle + ", con el numero de puerta: " + numeroPuerta + ", e con el codigo postal: " + codigoPostal+" en la ciudad " + ciudad);
		
	}

	
		
	}


