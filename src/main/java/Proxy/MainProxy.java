package Proxy;
import java.util.Arrays;

public class MainProxy {

    public static void main(String[] args) {

        //Lista de usuarios permitidos
        var usuariosPermitidos = Arrays.asList(" admin ", " usuario1 ");


        // Proxy con usuario permitido
        Archivo archivo1 = new ArchivoProxy(" documento.txt ", " admin ", usuariosPermitidos);
        archivo1.abrir(); // abrimos el archivo

        // Proxy con usuario no permitido
        Archivo archivo2 = new ArchivoProxy(" documento.txt ", " Invitado ", usuariosPermitidos);
        archivo2.abrir(); // Deberia mostrar acceso denegado
    }
}
