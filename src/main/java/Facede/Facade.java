package Facede;

public class Facade {
    public Carrito carrito;
    public Envio envio;
    public Pago pago;

    public Facade() {
        this.carrito = new Carrito();
        this.envio = new Envio();
        this.pago = new Pago();
    }

    public void comprar(String producto) {
        System.out.println(" Iniciando comprar producto ");
        carrito.agregarProducto(producto);
        pago.procesarPago(producto);
        envio.enviarProducto(producto);
        System.out.println(" Compra completada exitosamente");

    }
}
