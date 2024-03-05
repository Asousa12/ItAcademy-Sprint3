package Nivel1;

public class AgenciaBolsaObserver implements Observer{

    private String nombre;

    public AgenciaBolsaObserver(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(Object data) {

        float cambio = (float) data;
        System.out.println("Bolsa  " + nombre + ": La bolsa ha cambiado: " + cambio + "%");

    }
}
