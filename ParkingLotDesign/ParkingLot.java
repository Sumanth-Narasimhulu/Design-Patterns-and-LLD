package DesignPatternsAndLLD.ParkingLotDesign;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
  
    private List<Floor>floors;
    private SpotSelectionStratergy spotSelectionStratergy;
    private PricingStratergy pricingStratergy;
    private int ticketCounter=0;
    public ParkingLot(SpotSelectionStratergy spotSelectionStratergy,PricingStratergy pricingStratergy){
        this.floors = new ArrayList<>();
        this.spotSelectionStratergy = spotSelectionStratergy;
        this.pricingStratergy = pricingStratergy;
    }
    public void addFloor(Floor floor){
        floors.add(floor);
    }
    //==entry==
    public Ticket parkVehicle(Vehicle vehicle){
        ParkingSpot spot = spotSelectionStratergy.selectSpot(floors, vehicle);
        if(spot == null){
            System.out.println("No spot for "+ vehicle.getVehicleType() +" "+vehicle.licensePlate);
            return null;
        }
        spot.parkVehicle(vehicle);
        String ticketId = "T"+(++ticketCounter);
        Ticket ticket = new Ticket(ticketId, vehicle, spot);
        System.out.println("parked "+ vehicle.getLicensePlate()+" at " + spot.getParkingSpotId() +" . Ticket "+ ticketId);
        return ticket;
    }
    //==exit
    public double exitVehicle(Ticket ticket){
        long exitTime = System.currentTimeMillis();
        long durationHours = (exitTime - ticket.getEntryTime())/(1000*60*60);
        if(durationHours==0)durationHours=1;
        VehicleType type = ticket.getVehicle().getVehicleType();
        double fare = pricingStratergy.calculate(durationHours, type);
        ticket.getSpot().removeVehicle();

        System.out.println("Exited " + ticket.getVehicle().getLicensePlate()+" . "+durationHours+"h. Fare: Rs."+fare);
        return fare;
    }
    
}
