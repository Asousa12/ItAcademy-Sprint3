package nivel1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Undo pedido = Undo.getInstancia();
		
		Scanner entrada = new Scanner(System.in);
		
		 String respuesta;
		 String comida;
		 
		while(true) {
			System.out.println("Bien venido a nuestro restaurante, eligue la opcion que deseas: \n"
					+ "1. Añadir pedido.\n"
					+ "2. Eliminar pedido.\n"
					+ "3. Mirar el listado de tu pedido.\n");
	
		    int opcion = entrada.nextInt();
		    entrada.nextLine();
		
		switch(opcion) {
	        
		case 1: System.out.println("Dime que pedido deseas añanir a la lista?");
		        comida = entrada.nextLine();
		        pedido.addPedidos(comida);
		        break;
		        
		case 2: System.out.println("Dime que pedido deseas eliminar?");
		        comida = entrada.nextLine();
		        pedido.eliminarPedido(comida);
		        break;
		     
		case 3: System.out.println("Deseas ver la lista de tus pedidos?");
		        pedido.listaPedido();
		        break;
		        
		default: respuesta = "opcion no valida";
			
		}
        
		}
 }
}
