package org.example;

import Bridge.*;
import Decorador.*;
import Facede.Facade;
import adapter.Impresora;
import adapter.ImpresoraPDF;
import adapter.ImpresoraTexto;
import adapter.ImpresoraTextoAdapter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" ----------------------------------------------------------------- Ejercicio 1 Adapter ----------------------------------------------------------------------- ");
        // Usamos la impresora
        Impresora impresoraPDF = new ImpresoraPDF();
        impresoraPDF.imprimir("Factura #12345");


        // Usando la impresora de texto plano a traves del adapter
        ImpresoraTexto impresoraTexto = new ImpresoraTexto();
        Impresora impresoraTextoAdapter = new ImpresoraTextoAdapter(impresoraTexto);
        impresoraTextoAdapter.imprimir("Ticket #00001");

        System.out.println(" ----------------------------------------------------------------- Ejercicio 2 Bridge ----------------------------------------------------------------------- ");
        // Usando Email
        Notificacion alertaEmail = new Alerta(new EnvioEmail());
        alertaEmail.enviar(" Servidor Caido ");

        // Usando SMS
        Notificacion recordatorioSMS = new Recordatorio(new EnvioSMS());
        recordatorioSMS.enviar(" Reunion mañana a las 10hs ");

        // Usando otro canal
        Notificacion promoEmail = new Promocion(new EnvioEmail());
        promoEmail.enviar( "50% de descuento en tu proxima compra!");

        System.out.println(" ----------------------------------------------------------------- Ejercicio 3 Decorador -----------------------------------------------------");
        // Plan Basico
        Plan plan1 = new PlanBasico();
        System.out.println(plan1.getDescripcion() + " --> $ " + plan1.getCosto());

        // Plan + HD
        Plan plan2 = new HDDecorador(new PlanBasico());
        System.out.println(plan2.getDescripcion() + " --> $ " + plan2.getCosto());

        //Plan + HD + descargas
        Plan plan3 = new DescargasDecorator(new HDDecorador(new PlanBasico()));
        System.out.println(plan3.getDescripcion() + " --> $ " + plan3.getCosto());

        //Plan + UltraHD + Descargas
        Plan plan4 = new DescargasDecorator(new UltraHDDecorador(new PlanBasico()));
        System.out.println(plan4.getDescripcion() + " --> $ " + plan4.getCosto());

        // Plan + HD + UltraHD + Descargas
        Plan plan5 = new DescargasDecorator(new UltraHDDecorador(new HDDecorador(new PlanBasico())));
        System.out.println(plan5.getDescripcion() + " --> $ " + plan5.getCosto());

        System.out.println(" ----------------------------------------------------------------- Ejercicio 4 facade -----------------------------------------------------");

        // Creamos la tienda
        Facade tienda = new Facade();
        tienda.comprar("Laptop Gamer\n");
        tienda.comprar("PC gamer");

    }
}