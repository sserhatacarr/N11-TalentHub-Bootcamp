/*-----------------------------------------------------------------------
    PROJECT NAME    : N11 - Patika TalentHub Cohorts Homeworks
    PACKAGE NAME    : entity
    FILE            : House.java
    AUTHOR          : Serhat Acar
-----------------------------------------------------------------------*/

package entity;

public class House extends Accommodation {
    public House() {
    }

    public House(double price, double squareMeter, int roomCount, int livingRoomCount) {
        super(price, squareMeter, roomCount, livingRoomCount);
    }
}
