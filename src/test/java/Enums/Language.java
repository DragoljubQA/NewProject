package Enums;

import java.util.Random;

public enum Language {
    English,
    Spanish,
    French,
    Italian,
    Chinese,
    Portuguese;

    public static String getRandom() {
        return values()[new Random().nextInt(values().length)].name();
    }

}
