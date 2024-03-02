package util;

import entity.House;
import entity.SummerHouse;
import entity.Villa;
import service.RealEstateService;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Serhat Acar
 */

public class LoadTestData {

    public static List<House> houseList = new ArrayList<>();
    public static List<Villa> villaList = new ArrayList<>();
    public static List<SummerHouse> summerHouseList = new ArrayList<>();

    static
    {
        loadData();
    }

    private LoadTestData() {
    }

    public static void loadData() {
        House house = new House(300000, 100, 3, 1);
        House house2 = new House(400000, 100, 3, 1);
        House house3 = new House(200000, 100, 3, 1);

        SummerHouse summerHouse1 = new SummerHouse(100000, 100, 3, 1);
        SummerHouse summerHouse2 = new SummerHouse(100000, 100, 3, 1);
        SummerHouse summerHouse3 = new SummerHouse(100000, 100, 3, 1);

        Villa villa1 = new Villa(100000, 100, 3, 1);
        Villa villa2 = new Villa(100000, 100, 3, 1);
        Villa villa3 = new Villa(100000, 100, 3, 1);

        RealEstateService.houseList.add(house);
        RealEstateService.houseList.add(house2);
        RealEstateService.houseList.add(house3);

        RealEstateService.summerHouseList.add(summerHouse1);
        RealEstateService.summerHouseList.add(summerHouse2);
        RealEstateService.summerHouseList.add(summerHouse3);

        RealEstateService.villaList.add(villa1);
        RealEstateService.villaList.add(villa2);
        RealEstateService.villaList.add(villa3);
    }
}