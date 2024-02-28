package Nivel2;

public class CuentaBancaria implements MetodoPago{

    private int numeroCuenta;
    private String titular;

    public CuentaBancaria(int numeroCuenta, String titular) {
        this.numeroCuenta=numeroCuenta;
        this.titular=titular;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta=numeroCuenta;
    }
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    public void setTitular(String titular) {
        this.titular=titular;
    }
    public String getTitular() {
        return titular;
    }
    @Override
    public void processPayment(PaymentCallBack callBack) {
        // TODO Auto-generated method stub

    }
}
