package Flyweight;

class TreeType {
    private final int id;
    private final String name;
    private final String color;
    private final String textura;

    public TreeType(int id, String name, String color, String textura) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.textura = textura;
    }

    public int getId() {
        return id;
    }

    public void draw(int x, int y) {
        System.out.printf("  [%s id=%d] dibujado en (%d,%d) con textura=%s, color=%s%n",
                name, id, x, y, textura, color);
    }

    @Override
    public String toString() {
        return String.format(" TreeType{id=%d,name=%s,color=%s,texture=%s} ", id, name, color, textura);
    }
}
