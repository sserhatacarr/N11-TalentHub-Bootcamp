/*-----------------------------------------------------------------------
    PROJECT NAME    : N11 - Patika TalentHub Cohorts Homeworks
    PACKAGE NAME    : entity
    FILE            : House.java
    AUTHOR          : Serhat Acar
-----------------------------------------------------------------------*/

import entity.House;
import entity.SummerHouse;
import entity.Villa;

import java.util.ArrayList;
import java.util.List;

public class RealEstate {
    public static List<House> houseList = new ArrayList<>();
    public static List<Villa> villaList = new ArrayList<>();
    public static List<SummerHouse> summerHouseList = new ArrayList<>();



    public static double getTotalHousePrice() {
        double totalHousePrice = 0;
        for (House house : houseList) {
            totalHousePrice += house.getPrice();
        }
        return totalHousePrice;
    }

    public static double getTotalVillaPrice() {
        double totalVillaPrice = 0;
        for (Villa villa : villaList) {
            totalVillaPrice += villa.getPrice();
        }
        return totalVillaPrice;
    }

    public static double getTotalSummerHousePrice() {
        double totalSummerHousePrice = 0;
        for (SummerHouse summerHouse : summerHouseList) {
            totalSummerHousePrice += summerHouse.getPrice();
        }
        return totalSummerHousePrice;
    }

    public static double getTotalRealEstatePrice() {
        return getTotalHousePrice() + getTotalVillaPrice() + getTotalSummerHousePrice();
    }

    public static double getAverageHouseSquareMeter() {
        double totalHouseSquareMeter = 0;
        for (House house : houseList) {
            totalHouseSquareMeter += house.getSquareMeter();
        }
        return totalHouseSquareMeter / houseList.size();
    }

    public static double getAverageVillaSquareMeter() {
        double totalVillaSquareMeter = 0;
        for (Villa villa : villaList) {
            totalVillaSquareMeter += villa.getSquareMeter();
        }
        return totalVillaSquareMeter / villaList.size();
    }

    public static double getAverageSummerHouseSquareMeter() {
        double totalSummerHouseSquareMeter = 0;
        for (SummerHouse summerHouse : summerHouseList) {
            totalSummerHouseSquareMeter += summerHouse.getSquareMeter();
        }
        return totalSummerHouseSquareMeter / summerHouseList.size();
    }

    public static double getAverageRealEstateSquareMeter() {
        return (getTotalHousePrice() + getTotalVillaPrice() + getTotalSummerHousePrice()) / (houseList.size() + villaList.size() + summerHouseList.size());
    }

    public static List < House > filterHouseByRoomAndLivingRoomCount(int roomCount, int livingRoomCount) {
           List < House > filteredHouseList = new ArrayList<>();
            for (House house: houseList) {
                if (house.getRoomCount() == roomCount && house.getLivingRoomCount() == livingRoomCount) {
                    filteredHouseList.add(house);
                }
            }
            return filteredHouseList;
    }

    public static List < Villa > filterVillaByRoomAndLivingRoomCount(int roomCount, int livingRoomCount) {
        List < Villa > filteredVillaList = new ArrayList<>();
        for (Villa villa: villaList) {
            if (villa.getRoomCount() == roomCount && villa.getLivingRoomCount() == livingRoomCount) {
                filteredVillaList.add(villa);
            }
        }
        return filteredVillaList;
    }

    public static List < SummerHouse > filterSummerHouseByRoomAndLivingRoomCount(int roomCount, int livingRoomCount) {
        List < SummerHouse > filteredSummerHouseList = new ArrayList<>();
        for (SummerHouse summerHouse: summerHouseList) {
            if (summerHouse.getRoomCount() == roomCount && summerHouse.getLivingRoomCount() == livingRoomCount) {
                filteredSummerHouseList.add(summerHouse);
            }
        }
        return filteredSummerHouseList;
    }
}
