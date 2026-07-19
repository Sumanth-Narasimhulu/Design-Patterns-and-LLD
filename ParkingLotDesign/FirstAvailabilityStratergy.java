package DesignPatternsAndLLD.ParkingLotDesign;

import java.util.List;

public class FirstAvailabilityStratergy implements SpotSelectionStratergy {

    @Override
    public ParkingSpot selectSpot(List<Floor> floors, Vehicle vehicle) {
        for (Floor floor : floors) {
            ParkingSpot spot = floor.findParkingSpot(vehicle);
            if (spot != null) return spot;
        }
        return null;
    }
    
}
