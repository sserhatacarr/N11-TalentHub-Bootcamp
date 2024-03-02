import entity.House;
import entity.SummerHouse;
import entity.Villa;
import service.RealEstateService;
import util.LoadTestData;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        LoadTestData.loadData();

        List<House> houseList = LoadTestData.houseList;
        List<Villa> villaList = LoadTestData.villaList;
        List<SummerHouse> summerHouseList = LoadTestData.summerHouseList;

        RealEstateService realEstateService = new RealEstateService();

        System.out.println("Total House Price: " + realEstateService.getTotalHousePrice());
        System.out.println("Total Villa Price: " + realEstateService.getTotalVillaPrice());
        System.out.println("Total Summer House Price: " + realEstateService.getTotalSummerHousePrice());
        System.out.println("Total Real Estate Price: " + realEstateService.getTotalRealEstatePrice());
        System.out.println("-------------------------------------");

        System.out.println("Average House Square Meter: " + realEstateService.getAverageHouseSquareMeter());
        System.out.println("Average Villa Square Meter: " + realEstateService.getAverageVillaSquareMeter());
        System.out.println("Average Summer House Square Meter: " + realEstateService.getAverageSummerHouseSquareMeter());
        System.out.println("Average Real Estate Square Meter: " + realEstateService.getAverageRealEstateSquareMeter());
        System.out.println("-------------------------------------");

        System.out.println("Filtered House List by room count and living room count: " + realEstateService.filterHouseByRoomAndLivingRoomCount(3, 1));
        System.out.println("Filtered Villa List by room count and living room count: " + realEstateService.filterVillaByRoomAndLivingRoomCount(3, 1));
        System.out.println("Filtered Summer House List by room count and living room count: " + realEstateService.filterSummerHouseByRoomAndLivingRoomCount(3, 1));
    }
}