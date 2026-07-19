package DesignPatternsAndLLD.ParkingLotDesign;

import java.util.List;

public class NearestFirstStrategy implements SpotSelectionStratergy{

    @Override
    public ParkingSpot selectSpot(List<Floor> floors, Vehicle vehicle) {
       // floors assumed sorted by nearness to entrance;
        // different picking logic -> its own class
        for (Floor floor : floors) {
            ParkingSpot spot = floor.findParkingSpot(vehicle);
            if (spot != null) return spot;
        }
        return null;
    }

    
}
