
## Table of Contents

- [Introduction](#introduction)
- [Classes and Methods](#classes-and-methods)

## Introduction

The project consists of several classes representing different types of buildings and a service class (`BuildingService`) that provides various analytical methods. Here's a brief overview of the classes:

- **Main**: The main class where the project is initiated. It creates instances of different types of buildings, adds them to a list, and then utilizes the `BuildingService` to perform various calculations.

- **BuildingService**: This service class handles the calculations related to buildings. It takes a list of `Building` objects during initialization and provides methods for calculating total prices, average square meters, and filtering buildings based on the number of rooms and living rooms.

- **Building**: An abstract class representing a generic building. It contains properties like `price`, `squareMeters`, `rooms`, and `livingRooms`. Specific building types (`House`, `Villa`, and `SummerHouse`) extend this class.

- **House**, **Villa**, **SummerHouse**: Concrete classes representing specific types of buildings, each with its own constructor.

## Classes and Methods

- **Main Class**:
  - `main(String[] args)`: The entry point of the application. It creates instances of different buildings, initializes the `BuildingService`, and prints various analytics based on the service methods.

- **BuildingService Class**:
  - `getTotalPriceOfHouses()`: Calculates the total price of all houses.
  - `getTotalPriceOfVillas()`: Calculates the total price of all villas.
  - `getTotalPriceOfSummerHouses()`: Calculates the total price of all summer houses.
  - `getTotalPriceOfAllBuildings()`: Calculates the total price of all buildings.
  - `getAverageSquareMetersOfHouses()`: Calculates the average square meters of houses.
  - `getAverageSquareMetersOfVillas()`: Calculates the average square meters of villas.
  - `getAverageSquareMetersOfSummerHouses()`: Calculates the average square meters of summer houses.
  - `getAverageSquareMetersOfAllBuildings()`: Calculates the average square meters of all buildings.
  - `filterBuildingsByRoomsAndLivingRooms(double minRooms, double minLivingRooms)`: Filters buildings based on the minimum number of rooms and living rooms.

- **Building Class**:
  - Properties: `price`, `squareMeters`, `rooms`, `livingRooms`.
  - Getters and setters for each property.

- **House, Villa, SummerHouse Classes**:
  - Constructors: Initialize specific building types.
