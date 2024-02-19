/*-----------------------------------------------------------------------
    PROJECT NAME    : N11 - Patika TalentHub Cohorts Practices
    PACKAGE NAME    : entity
    FILE            : Accommodation.java
    AUTHOR          : Serhat Acar
-----------------------------------------------------------------------*/

package entity;

public abstract class Accommodation {
    private double price;
    private double squareMeter;
    private int roomCount;
    private int livingRoomCount;

    protected Accommodation() {
        this.price = 0;
        this.squareMeter = 0;
        this.roomCount = 0;
        this.livingRoomCount = 0;
    }

    protected Accommodation(double price, double squareMeter, int roomCount, int livingRoomCount) {
        this.price = price;
        this.squareMeter = squareMeter;
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;
    }

    public double getPrice() {
        return price;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getRoomCount() {
        return roomCount;
    }


    public int getLivingRoomCount() {
        return livingRoomCount;
    }


    @Override
    public String toString() {
        return "Accommodation{" +
                "price=" + price +
                ", squareMeter=" + squareMeter +
                ", roomCount=" + roomCount +
                ", livingRoomCount=" + livingRoomCount +
                '}';
    }
}
