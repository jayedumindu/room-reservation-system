package model;

public class Room {
    private String roomNumber;
    private String roomType;
    private String roomRate;
    private String occupancy;

    public Room() {
    }

    public Room(String roomNumber, String roomType, String roomRate, String occupancy) {
        this.setRoomNumber(roomNumber);
        this.setRoomType(roomType);
        this.setRoomRate(roomRate);
        this.setOccupancy(occupancy);
    }


    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(String roomRate) {
        this.roomRate = roomRate;
    }

    public String getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(String occupancy) {
        this.occupancy = occupancy;
    }
}
