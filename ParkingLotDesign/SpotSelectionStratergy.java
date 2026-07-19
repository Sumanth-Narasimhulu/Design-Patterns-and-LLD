package DesignPatternsAndLLD.ParkingLotDesign;

import java.util.List;

public interface SpotSelectionStratergy {
    ParkingSpot selectSpot(List<Floor>floors,Vehicle vehicle);
}
