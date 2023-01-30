package Enums;

import java.util.Random;

public enum States {
    AL,
    KY,
    OH,
    AK,
    LA,
    OK,
    AZ,
    ME,
    OR,
    AR,
    MD,
    PA,
    MA,
    CA,
    MI,
    RI,
    CO,
    MN,
    SC,
    CT,
    MS,
    SD,
    DE,
    MO,
    TN,
    MT,
    TX,
    FL,
    NE,
    GA,
    NV,
    UT,
    NH,
    VT,
    HI,
    NJ,
    VA,
    ID,
    NM,
    IL,
    NY,
    WA,
    IN,
    NC,
    WV,
    IA,
    ND,
    WI,
    KS,
    WY;

    public static String getRandom() {
        return values()[new Random().nextInt(values().length)].name();
    }

}
