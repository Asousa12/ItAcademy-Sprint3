package Nivel1;

public interface Observable {

    void addObservador(Observer observer);

    void removeObservador(Observer observer);

    void notifyObservers(Object data);

}
