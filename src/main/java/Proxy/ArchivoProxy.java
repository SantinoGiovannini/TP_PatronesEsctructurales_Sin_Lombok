package Proxy;

import java.util.List;

public class ArchivoProxy implements Archivo {
    private ArchivoReal archivoReal;
    private String nombreArchivo;
    public String usuario;
    private List<String> usuariosPermitidos;

    public ArchivoProxy(String nombreArchivo, String usuario, List<String> usuariosPermitidos) {
        this.nombreArchivo = nombreArchivo;
        this.usuario = usuario;
        this.usuariosPermitidos = usuariosPermitidos;
    }

    @Override
    public void abrir() {
        if(usuariosPermitidos.contains(usuario)){
            if(archivoReal == null){
                archivoReal = new ArchivoReal(nombreArchivo);
            }
            archivoReal.abrir();
        }else {
            System.out.println(" Acceso denegado para el usuario " + usuario);

        }
    }
}
