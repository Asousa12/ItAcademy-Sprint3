package Nivel2;

public class TiendaZapatos {
    private PasarelaPago pasarelaPago;

    public TiendaZapatos(PasarelaPago pasarelaPago) {
        this.pasarelaPago = pasarelaPago;
    }

    public void purchaseItem(MetodoPago metodoPago) {
        PaymentCallBack callBack = new PaymentCallBack() {

            @Override
            public void onPagamentoEfectuado() {

                System.out.println("El pago ha sido procesado. Gracias por comprar en nuestra tienda.");

            }
        };
        PasarelaPago.processPayment(metodoPago, callBack);
    }
}
