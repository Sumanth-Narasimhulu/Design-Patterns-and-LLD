package DesignPatternsAndLLD.ParkingLotDesign;

public class ParkingSpot {
    public String parkingSpotId;
    public Vehicle vehicle;
    public VehicleType vehicleType;

    public ParkingSpot(String parkingSpotId,VehicleType type){
        this.parkingSpotId = parkingSpotId;
        this.vehicleType = type;
    }

    public boolean isFree(){
        return this.vehicle == null;
    }
    public boolean canFit(Vehicle v){
        return isFree()&&v.vehicleType==vehicleType;
    }
    public void parkVehicle(Vehicle v){
        this.vehicle  = v;
    }
    public void removeVehicle(){
        this.vehicle = null;
    }
    public String getParkingSpotId() {
        return parkingSpotId;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }

    
}
