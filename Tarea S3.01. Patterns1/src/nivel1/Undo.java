package nivel1;

import java.util.ArrayList;
import java.util.List;

public class Undo {
	
	private static Undo instancia;
	private List<String> pedidos;


	private Undo() {
		this.pedidos = new ArrayList<>();
	}
	
	public static Undo getInstancia() {
		
		if(instancia == null) {
			instancia = new Undo();
		}
		return instancia;
		
	}
	public void addPedidos(String pedido) {
		
	    pedidos.add(pedido);
	     		
	}
	public void eliminarPedido(String pedido) {
	
		pedidos.remove(pedido);
	
	}
	public void listaPedido() {
		
		for(String lista : pedidos) {
			System.out.println(lista);
		}
			
	}
}	
	

