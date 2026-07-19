package DesignPatternsAndLLD.ParkingLotDesign;

public class FlatDailyPricing implements PricingStratergy{

    @Override
    public double calculate(long duration, VehicleType v) {
        long days = (duration / 24) + 1;
        return days * 100.0;
    }
    
}
