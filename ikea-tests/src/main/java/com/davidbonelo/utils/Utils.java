package com.davidbonelo.utils;

import java.util.Arrays;
import java.util.List;

public class Utils {
    private Utils() {
        throw new IllegalStateException("Utility Class");
    }

    public static <T> T pickRandomItem(List<T> list) {
        int randomIdx = (int) Math.floor(Math.random() * list.size());
        return list.get(randomIdx);
    }

    public static String getRandomSearchKeyword() {
        List<String> productos = Arrays.asList("CASA", "MESA", "SILLA", "CAMA", "SOFÁ", "ESTANTE"
                , "LÁMPARA", "CORTINA", "ALFOMBRA", "ARMARIO", "ESPEJO", "ESCRITORIO", "BANCO",
                "CAJÓN", "COJÍN");
        return pickRandomItem(productos);
    }
}
