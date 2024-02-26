package nivel2Factory;


import nivel2Interfaces.AbstractFactory;
import nivel2Interfaces.Address;
import nivel2Interfaces.PhoneNumber;
import nivel2Producto.PortugalAddress;

import nivel2Producto.SpainAddress;

public class AddressFactory implements AbstractFactory{
	

	@Override
	public Address getAddress(String address) {
		if(address == null) {
			return null;
		}
		if(address.equalsIgnoreCase("SpainAddress")) {
			return new SpainAddress();
		}
		if(address.equalsIgnoreCase("PortugalAddress")){
			return new PortugalAddress();
		}
		return null;
	}

	@Override
	public PhoneNumber getPhoneNumber(String numero) {
		
		return null;
	}

	

	
	
	

}
