package DesignPatternsAndLLD.ParkingLotDesign;

public interface PricingStratergy {
    public double calculate(long duration,VehicleType v);
}
