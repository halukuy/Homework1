import entity.Building;
import entity.House;
import entity.SummerHouse;
import entity.Villa;
import service.BuildingService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Building> buildingList = Arrays.asList(
                new House(150000, 200, 3, 3),
                new House(220000, 180, 5, 3),
                new Villa(250000, 300, 6, 4),
                new Villa(280000, 350, 7, 5),
                new SummerHouse(80000, 100, 3, 1),
                new SummerHouse(90000, 120, 4, 2)
        );

        BuildingService buildingService = new BuildingService(buildingList);

        System.out.println("Total price of houses: " + buildingService.getTotalPriceOfHouses());
        System.out.println("Total price of villas: " + buildingService.getTotalPriceOfVillas());
        System.out.println("Total price of summer houses: " + buildingService.getTotalPriceOfSummerHouses());
        System.out.println("Total price of all buildings: " + buildingService.getTotalPriceOfAllBuildings());

        System.out.println("Average square meters of houses: " + buildingService.getAverageSquareMetersOfHouses());
        System.out.println("Average square meters of villas: " + buildingService.getAverageSquareMetersOfVillas());
        System.out.println("Average square meters of summer houses: " + buildingService.getAverageSquareMetersOfSummerHouses());
        System.out.println("Average square meters of all buildings: " + buildingService.getAverageSquareMetersOfAllBuildings());

        System.out.println("Buildings with 4 rooms and 2 living rooms: " +
                buildingService.filterBuildingsByRoomsAndLivingRooms(4, 2));
    }
}