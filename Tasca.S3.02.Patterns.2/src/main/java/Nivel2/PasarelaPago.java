package Nivel2;

public class PasarelaPago {

    public static void processPayment(MetodoPago paymentMethod, PaymentCallBack callback) {
        paymentMethod.processPayment(callback);
    }
}
