package nivel2Factory;

import java.util.ArrayList;
import java.util.List;

import nivel2Interfaces.AbstractFactory;
import nivel2Interfaces.Address;
import nivel2Interfaces.PhoneNumber;
import nivel2Producto.PortugalAddress;
import nivel2Producto.PortugalPhoneNumber;


public class Main {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		    
        ArrayList<Address>address=new ArrayList<>();
        ArrayList<PhoneNumber>phoneNumber=new ArrayList<>();
        
        AbstractFactory addressFactory = ProductoFactory.getFactory("Address");
        Address address1 = addressFactory.getAddress("PortugalAddress");
        address1.setAddress("Saudade de cima", 15, "4800-800", "Guimaraes");
        address.add(address1);
        
        AbstractFactory addressFactory1 = ProductoFactory.getFactory("Address");
        Address address2 = addressFactory.getAddress("SpainAddress");
        address2.setAddress("Riojita", 18, "8000-523", "Barcelona");
        address.add(address2);
        
        
        AbstractFactory phoneNumberFactory = ProductoFactory.getFactory("PhoneNumber");
        PhoneNumber phoneNumber1 = phoneNumberFactory.getPhoneNumber("PortugalPhoneNumber");
        phoneNumber1.setContacto(68795462);
        phoneNumber.add(phoneNumber1);
        
        AbstractFactory phoneNumberFactory1 = ProductoFactory.getFactory("PhoneNumber");
        PhoneNumber phoneNumber2 = phoneNumberFactory1.getPhoneNumber("SpainPhoneNumber");
        phoneNumber2.setContacto(897569845);
        phoneNumber.add(phoneNumber2);
 
       
        
		
	}

}
