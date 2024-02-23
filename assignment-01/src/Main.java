/*-----------------------------------------------------------------------
    PROJECT NAME    : N11 - Patika TalentHub Cohorts Homeworks
    PACKAGE NAME    : entity
    FILE            : House.java
    AUTHOR          : Serhat Acar
-----------------------------------------------------------------------*/

import entity.House;
import entity.SummerHouse;
import entity.Villa;

public class Main {
    public static void main(String[] args) {

        House house = new House(300000, 100, 3, 1);
        House house2 = new House(400000, 100, 3, 1);
        House house3 = new House(200000, 100, 3, 1);


        SummerHouse summerHouse1 = new SummerHouse(100000, 100, 3, 1);
        SummerHouse summerHouse2 = new SummerHouse(100000, 100, 3, 1);
        SummerHouse summerHouse3 = new SummerHouse(100000, 100, 3, 1);

        Villa villa1 = new Villa(100000, 100, 3, 1);
        Villa villa2 = new Villa(100000, 100, 3, 1);
        Villa villa3 = new Villa(100000, 100, 3, 1);

        RealEstate.houseList.add(house);
        RealEstate.houseList.add(house2);
        RealEstate.houseList.add(house3);

        RealEstate.summerHouseList.add(summerHouse1);
        RealEstate.summerHouseList.add(summerHouse2);
        RealEstate.summerHouseList.add(summerHouse3);

        RealEstate.villaList.add(villa1);
        RealEstate.villaList.add(villa2);
        RealEstate.villaList.add(villa3);

        System.out.println("Total House Price: " + RealEstate.getTotalHousePrice());
        System.out.println("Total Villa Price: " + RealEstate.getTotalVillaPrice());
        System.out.println("Total Summer House Price: " + RealEstate.getTotalSummerHousePrice());
        System.out.println("Total Real Estate Price: " + RealEstate.getTotalRealEstatePrice());
        System.out.println("-------------------------------------");

        System.out.println("Average House Square Meter: " + RealEstate.getAverageHouseSquareMeter());
        System.out.println("Average Villa Square Meter: " + RealEstate.getAverageVillaSquareMeter());
        System.out.println("Average Summer House Square Meter: " + RealEstate.getAverageSummerHouseSquareMeter());
        System.out.println("Average Real Estate Square Meter: " + RealEstate.getAverageRealEstateSquareMeter());
        System.out.println("-------------------------------------");

        System.out.println("Filtered House List by room count and living room count: " + RealEstate.filterHouseByRoomAndLivingRoomCount(3, 1));
        System.out.println("Filtered Villa List by room count and living room count: " + RealEstate.filterVillaByRoomAndLivingRoomCount(3, 1));
        System.out.println("Filtered Summer House List by room count and living room count: " + RealEstate.filterSummerHouseByRoomAndLivingRoomCount(3, 1));





    }
}