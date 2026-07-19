package DesignPatternsAndLLD.ParkingLotDesign;

public class Vehicle {
    public String licensePlate;
    public VehicleType vehicleType;

    public Vehicle(String licensePlate,VehicleType vehicleType){
        this.licensePlate=licensePlate;
        this.vehicleType = vehicleType;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
    
    

}
