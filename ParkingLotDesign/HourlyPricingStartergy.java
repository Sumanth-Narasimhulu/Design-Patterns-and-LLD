package DesignPatternsAndLLD.ParkingLotDesign;

import java.util.HashMap;
import java.util.Map;

public class HourlyPricingStartergy implements PricingStratergy{

    private Map<VehicleType,Integer>map = Map.of(
        VehicleType.BIKE,10,
        VehicleType.CAR,20,
        VehicleType.TRUCK,30
    );
    @Override
    public double calculate(long duration, VehicleType v) {
        return duration*map.get(v);
    }
    
}
