package Nivel1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BolsaObservable bolsaObservable = new BolsaObservable();

        AgenciaBolsaObserver agencia1 = new AgenciaBolsaObserver("Agencia 1");
        AgenciaBolsaObserver agencia2 = new AgenciaBolsaObserver("Agencia 2");
        AgenciaBolsaObserver agencia3 = new AgenciaBolsaObserver("Agencia 3");


        bolsaObservable.addObservador(agencia1);
        bolsaObservable.addObservador(agencia2);
        bolsaObservable.addObservador(agencia3);

        bolsaObservable.cambioEnBolsa(5.9f);
        bolsaObservable.cambioEnBolsa(8.6f);
        bolsaObservable.removeObservador(agencia2);

        bolsaObservable.cambioEnBolsa(7.9f);


    }
}