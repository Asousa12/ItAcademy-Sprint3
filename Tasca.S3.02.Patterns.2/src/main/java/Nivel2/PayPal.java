package Nivel2;

public class PayPal implements MetodoPago{

    private String nombre;
    private String email;
    private int password;


    public PayPal(String nombre, String email, int password) {
        this.nombre=nombre;
        this.email=email;
        this.password=password;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEmail( String email) {
        this.email=email;
    }
    public String getEmail() {
        return email;
    }
    public void setPassword(int password) {
        this.password=password;
    }
    public int getPassword() {
        return password;
    }

    @Override
    public void processPayment(PaymentCallBack callBack) {
        System.out.println("El pagamento esta siendo processado...");

        callBack.onPagamentoEfectuado();

    }


}
