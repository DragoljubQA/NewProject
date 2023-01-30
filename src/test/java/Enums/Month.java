package Enums;

import java.util.Random;

public enum Month {
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December;

    public static String getRandom() {
        return values()[new Random().nextInt(values().length)].name();
    }

}
