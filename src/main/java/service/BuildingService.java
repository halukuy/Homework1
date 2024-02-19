package service;

import entity.Building;
import entity.House;
import entity.Summery;
import entity.Villa;
import java.util.ArrayList;
import java.util.List;

public class BuildingService {

    private List<Building> buildings;

    public BuildingService(List<Building> buildings) {
        this.buildings = buildings;
    }

    public double getTotalPriceOfHouses() {
        double totalPrice = 0;
        for (Building building : buildings) {
            if (building instanceof House) {
                totalPrice += building.getPrice();
            }
        }
        return totalPrice;
    }

    public double getTotalPriceOfVillas() {
        double totalPrice = 0;
        for (Building building : buildings) {
            if (building instanceof Villa) {
                totalPrice += building.getPrice();
            }
        }
        return totalPrice;
    }

    public double getTotalPriceOfSummerHouses() {
        double totalPrice = 0;
        for (Building building : buildings) {
            if (building instanceof Summery) {
                totalPrice += building.getPrice();
            }
        }
        return totalPrice;
    }

    public double getTotalPriceOfAllBuildings() {
        double totalPrice = 0;
        for (Building building : buildings) {
            totalPrice += building.getPrice();
        }
        return totalPrice;
    }

    public double getAverageSquareMetersOfHouses() {
        double totalSquareMeters = 0;
        int houseCount = 0;
        for (Building building : buildings) {
            if (building instanceof House) {
                totalSquareMeters += building.getSquareMeters();
                houseCount++;
            }
        }
        return houseCount > 0 ? totalSquareMeters / houseCount : 0;
    }

    public double getAverageSquareMetersOfVillas() {
        double totalSquareMeters = 0;
        int villaCount = 0;
        for (Building building : buildings) {
            if (building instanceof Villa) {
                totalSquareMeters += building.getSquareMeters();
                villaCount++;
            }
        }
        return villaCount > 0 ? totalSquareMeters / villaCount : 0;
    }

    public double getAverageSquareMetersOfSummerHouses() {
        double totalSquareMeters = 0;
        int summerHouseCount = 0;
        for (Building building : buildings) {
            if (building instanceof Summery) {
                totalSquareMeters += building.getSquareMeters();
                summerHouseCount++;
            }
        }
        return summerHouseCount > 0 ? totalSquareMeters / summerHouseCount : 0;
    }

    public double getAverageSquareMetersOfAllBuildings() {
        double totalSquareMeters = 0;
        for (Building building : buildings) {
            totalSquareMeters += building.getSquareMeters();
        }
        return buildings.size() > 0 ? totalSquareMeters / buildings.size() : 0;
    }

    public List<Building> filterBuildingsByRoomsAndLivingRooms(double minRooms, double minLivingRooms) {
        List<Building> filteredBuildings = new ArrayList<>();
        for (Building building : buildings) {
            if (building.getRooms() >= minRooms && building.getLivingRooms() >= minLivingRooms) {
                filteredBuildings.add(building);
            }
        }
        return filteredBuildings;
    }
}
