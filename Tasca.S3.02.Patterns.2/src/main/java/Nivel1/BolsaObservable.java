package Nivel1;

import java.util.ArrayList;
import java.util.List;

public class BolsaObservable implements Observable{

    private List<Observer> observadores = new ArrayList<>();

    @Override
    public void addObservador(Observer observadore) {
        observadores.add(observadore);
    }

    @Override
    public void removeObservador(Observer observador) {
        observadores.remove(observador);
    }

    @Override
    public void notifyObservers(Object data) {
        for(Observer observador : observadores ) {
            observador.update(data);
        }
    }
    public void cambioEnBolsa(float cambio) {
        notifyObservers(cambio);
    }

}
