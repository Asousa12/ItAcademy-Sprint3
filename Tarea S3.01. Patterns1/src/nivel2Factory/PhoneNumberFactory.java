package nivel2Factory;

import nivel2Interfaces.AbstractFactory;
import nivel2Interfaces.Address;
import nivel2Interfaces.PhoneNumber;
import nivel2Producto.PortugalPhoneNumber;
import nivel2Producto.SpainPhoneNumber;

public class PhoneNumberFactory implements AbstractFactory {

	@Override
	public Address getAddress(String address) {
	
		return null;
	}

	@Override
	public PhoneNumber getPhoneNumber(String numero) {
		
		if(numero == null) {
			return null;
		}
		if(numero.equalsIgnoreCase("PortugalPhoneNumber")) {
			return new PortugalPhoneNumber();
		}
		if(numero.equalsIgnoreCase("SpainPhoneNUmber")) {
			return new SpainPhoneNumber();
		}
		return null;
	}	
	

}
