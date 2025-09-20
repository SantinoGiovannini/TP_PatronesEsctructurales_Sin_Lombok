package Flyweight;

public class BosqueCompact {
    private final int[] xs;
    private final int[] ys;
    private final int[] typeIndex;
    private int size = 0;

    public BosqueCompact(int capacity) {
        xs = new int[capacity];
        ys = new int[capacity];
        typeIndex = new int[capacity];
    }

    public void plantarArbol(int x, int y, String name, String color, String texture) {
        if (size >= xs.length) {
            throw new IllegalStateException("Capacidad del bosque excedida");
        }
        TreeType t = FabricaDeArboles.getTreeType(name, color, texture);
        xs[size] = x;
        ys[size] = y;
        typeIndex[size] = t.getId();
        size++;
    }

    public int size() {
        return size;
    }

    public void dibujarPrimeros(int n) {
        int to = Math.min(n, size);
        for (int i = 0; i < to; i++) {
            TreeType tt = FabricaDeArboles.getByIndex(typeIndex[i]);
            tt.draw(xs[i], ys[i]);
        }
    }
}
