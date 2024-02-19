package entity;

public abstract class Building {
    private double price;
    private double squareMeters;
    private double rooms;
    private double livingRooms;

    public Building(double price, double squareMeters, double rooms, double livingRooms) {
        this.price = price;
        this.squareMeters = squareMeters;
        this.rooms = rooms;
        this.livingRooms = livingRooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(double squareMeters) {
        this.squareMeters = squareMeters;
    }

    public double getRooms() {
        return rooms;
    }

    public void setRooms(double rooms) {
        this.rooms = rooms;
    }

    public double getLivingRooms() {
        return livingRooms;
    }

    public void setLivingRooms(double livingRooms) {
        this.livingRooms = livingRooms;
    }
}
