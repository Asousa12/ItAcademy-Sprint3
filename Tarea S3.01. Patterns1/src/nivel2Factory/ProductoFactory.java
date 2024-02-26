package nivel2Factory;

import nivel2Interfaces.AbstractFactory;

public class ProductoFactory {
	

	public static AbstractFactory getFactory(String tipoContacto) {
		
		if(tipoContacto.equalsIgnoreCase("Address")) {
			
			return new AddressFactory();
			
		}else if(tipoContacto.equalsIgnoreCase("PhoneNumber")) {
			
			return new PhoneNumberFactory();
		}
		return null;
	}
	

}
