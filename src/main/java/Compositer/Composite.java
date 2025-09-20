package Compositer;

public class Composite {
    public static void main(String[] args) {
        Plato plato1 = new Plato(" Hamburguesa ", 1200);
        Plato plato2 = new Plato(" Papas Fritas ", 500);
        Plato plato3 = new Plato(" Ensalada ", 700);

        // Menu Principal
        Menu menuPrincipal = new Menu(" Menu Principal ");
        menuPrincipal.agregarElemento(plato1);
        menuPrincipal.agregarElemento(plato2);

        // Menu Secundario
        Menu subMenu = new Menu(" Menu Saludable ");
        subMenu.agregarElemento(plato3);

        menuPrincipal.agregarElemento(subMenu);
        menuPrincipal.mostrar();
    }
}
