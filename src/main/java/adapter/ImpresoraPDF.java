package adapter;

public class ImpresoraPDF implements Impresora {
    @Override
    public void imprimir (String mensaje) {
        System.out.println(" Imprimiendo PDF: " + mensaje);
    }

}
