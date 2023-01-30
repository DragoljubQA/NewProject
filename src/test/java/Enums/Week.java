package Enums;

import java.util.Random;

public enum Week {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;

    public static String getRandom() {
        return values()[new Random().nextInt(values().length)].name();
    }

}
