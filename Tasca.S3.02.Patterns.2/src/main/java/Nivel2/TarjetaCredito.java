package Nivel2;

public class TarjetaCredito implements MetodoPago{


    private String nombreTitular;
    private String numeroTarjeta;
    private String fechaValidad;
    private int codigoSeguridad;


    public TarjetaCredito(String nombreTitular, String numeroTarjeta, String fechaValidad, int codigoSeguridad){
        this.nombreTitular=nombreTitular;
        this.numeroTarjeta=numeroTarjeta;
        this.fechaValidad=fechaValidad;
        this.codigoSeguridad=codigoSeguridad;

    }

    public String getNombreTitular() {
        return nombreTitular;
    }
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular=nombreTitular;
    }
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta=numeroTarjeta;
    }
    public String getFechaValidad() {
        return fechaValidad;
    }
    public void setFechaValidad(String fechaValidad) {
        this.fechaValidad=fechaValidad;
    }
    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }
    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad=codigoSeguridad;
    }

    @Override
    public void processPayment(PaymentCallBack callBack) {

        System.out.println("El pagamento esta siendo processado...");

        callBack.onPagamentoEfectuado();

    }
}
