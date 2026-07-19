package DesignPatternsAndLLD.ParkingLotDesign;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    public int floorNumber;
    public List<ParkingSpot> parkingSpots;
    public Floor(int floorNumber){
        this.floorNumber = floorNumber;
        this.parkingSpots = new ArrayList<>();
    }
    public void addSpot(ParkingSpot spot){
        parkingSpots.add(spot);
    }
    public ParkingSpot findParkingSpot(Vehicle v){
        for(ParkingSpot spot:parkingSpots){
            if(spot.canFit(v)){
                return spot;
            }
        }
        return null;
    }
    public int getFloorNumber() {
        return floorNumber;
    }
    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
    


    
}
