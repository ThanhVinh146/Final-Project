package entity;
public class home{
    private int homeId;
    private String homeType;
    private String roomType;
    private int occupancy;
    public home(){}

    public home(int homeId, String homeType, String roomType, int occupancy) {
        super();
        this.homeId = homeId;
        this.homeType = homeType;
        this.roomType = roomType;
        this.occupancy = occupancy;
    }

    public int getHomeId() {
        return homeId;
    }

    public void setHomeId(int homeId) {
        this.homeId = homeId;
    }

    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }
}