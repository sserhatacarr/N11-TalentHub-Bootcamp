/*-----------------------------------------------------------------------
    PROJECT NAME    : N11 - Patika TalentHub Cohorts Homeworks
    PACKAGE NAME    : entity
    FILE            : House.java
    AUTHOR          : Serhat Acar
-----------------------------------------------------------------------*/

package entity;

public class House extends Accommodation {
    private String owner ;

    public House() {
        super();
        this.owner="";
    }

    public House(double price, double squareMeter, int roomCount, int livingRoomCount) {
        super(price, squareMeter, roomCount, livingRoomCount);

    }

    @Override
    public void setRoomCount(int roomCount) {
        super.setRoomCount(roomCount);
    }

    @Override
    public String toString() {
      return super.toString() + "\nOwner: " + owner;
    }
}
