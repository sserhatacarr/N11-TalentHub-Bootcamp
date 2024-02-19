/*-----------------------------------------------------------------------
    PROJECT NAME    : N11 - Patika TalentHub Cohorts Practices
    PACKAGE NAME    : entity
    FILE            : Villa.java
    AUTHOR          : Serhat Acar
-----------------------------------------------------------------------*/

package entity;

public class Villa extends Accommodation {
    public Villa() {
    }

    public Villa(double price, double squareMeter, int roomCount, int livingRoomCount) {
        super(price, squareMeter, roomCount, livingRoomCount);
    }
}
