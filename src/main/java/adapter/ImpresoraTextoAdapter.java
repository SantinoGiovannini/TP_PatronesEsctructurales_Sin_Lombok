package adapter;

public class ImpresoraTextoAdapter implements Impresora {
    private ImpresoraTexto impresoraTexto;

    public ImpresoraTextoAdapter(ImpresoraTexto impresoraTexto) {
        this.impresoraTexto = impresoraTexto;
    }

    @Override
    public void imprimir (String mensaje) {
        impresoraTexto.imprimirTextoPlano(mensaje);
    }
}
