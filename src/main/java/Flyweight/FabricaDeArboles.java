package Flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FabricaDeArboles {
    private static final Map<String, TreeType> tipos = new HashMap<>();
    private static final List<TreeType> tiposList = new ArrayList<>();


     // Devuelve un TreeType compartido (crea si no existe)
    public static synchronized TreeType getTreeType(String name, String color, String texture) {
        String key = buildKey(name, color, texture);
        TreeType tt = tipos.get(key);
        if (tt == null) {
            tt = new TreeType(tiposList.size(), name, color, texture);
            tipos.put(key, tt);
            tiposList.add(tt);
        }
        return tt;
    }

    private static String buildKey(String name, String color, String texture) {
        return name + "|" + color + "|" + texture;
    }

    public static TreeType getByIndex(int idx) {
        return tiposList.get(idx);
    }

    public static int getTiposCount() {
        return tiposList.size();
    }
}
