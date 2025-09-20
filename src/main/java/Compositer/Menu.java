package Compositer;

import java.util.ArrayList;
import java.util.List;

public class Menu implements ElementoMenu {
    private String nombre;
    private List<ElementoMenu> elementos = new ArrayList<>();

    public Menu(String nombre) {
        this.nombre = nombre;
    }

    public void agregarElemento(ElementoMenu elemento) {
        elementos.add(elemento);
    }

    public void eliminarElemento(ElementoMenu elemento) {
        elementos.remove(elemento);
    }

    @Override
    public void mostrar() {
        System.out.println("Menu: " + nombre);
        for (ElementoMenu e : elementos) {
            e.mostrar(); // Llamada recursiva, muestra platos y submenús
        }
    }
}