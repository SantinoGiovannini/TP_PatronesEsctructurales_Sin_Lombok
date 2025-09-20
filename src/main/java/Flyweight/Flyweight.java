package Flyweight;
import java.util.*;

public class Flyweight {
    public static void main(String[] args) {
        final int NUM_TREES = 1_000_000;
        System.out.println("Iniciando simulacion de " + NUM_TREES + " arboles... ");

        // Tipos de arboles disponibles
        String[] tipos = {"Pino", "Roble", "Abedul"};
        String[] colores = {"VerdeOscuro", "Marron", "VerdeClaro"};
        String[] texturas = {"Pine.png", "oak.png", "birch.png"};

        // Bosque compacto que almacena extrinsecos en un arrays primitivo
        BosqueCompact bosque = new BosqueCompact(NUM_TREES);

        Random rnd = new Random(42);

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < NUM_TREES; i++) {
            int x = rnd.nextInt(10);      // Posicion en X
            int y = rnd.nextInt(10);      // Posicion en Y
            int tipoIndex = rnd.nextInt(tipos.length);
            bosque.plantarArbol(x, y, tipos[tipoIndex], colores[tipoIndex], texturas[tipoIndex]);
        }

        long t1 = System.currentTimeMillis();

        // Sugerencia: forzar GC antes de medir memoria (es sólo una sugerencia, JVM decide)
        System.gc();
        Runtime rt = Runtime.getRuntime();
        long usedBytes = rt.totalMemory() - rt.freeMemory();

        System.out.println("Simulación completada.");
        System.out.printf("Tiempo de plantado: %d ms%n", (t1 - t0));
        System.out.printf("Memoria usada aproximada por la JVM: %d bytes (%.2f MiB)%n",
                usedBytes, usedBytes / 1048576.0);
        System.out.println("Tipos de TreeType creados (flyweights): " + FabricaDeArboles.getTiposCount());
        System.out.println("Arboles almacenados en BosqueCompact: " + bosque.size());

        // Dibujar sólo los primeros 5 (para no saturar la salida)
        System.out.println("\nDibujando los primeros 5 árboles (ejemplo):");
        bosque.dibujarPrimeros(5);

        // Estimación simple del coste de las arrays usadas:
        long bytesArrays = 3L * NUM_TREES * Integer.BYTES; // xs, ys, typeIndex
        System.out.printf("%nEstimación: %d bytes ocupados por las 3 arrays de int (xs, ys, typeIndex) = %d bytes (%.2f MiB)%n",
                NUM_TREES, bytesArrays, bytesArrays / 1048576.0);

    }

}
