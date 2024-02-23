/*-----------------------------------------------------------------------
    PROJECT NAME    : N11 - Patika TalentHub Cohorts Practices
    PACKAGE NAME    : entity
    FILE            : SummerHouse.java
    AUTHOR          : Serhat Acar
-----------------------------------------------------------------------*/

package entity;

public class SummerHouse extends Accommodation {
    public SummerHouse() {
    }

    public SummerHouse(double price, double squareMeter, int roomCount, int livingRoomCount) {
        super(price, squareMeter, roomCount, livingRoomCount);
    }
}
