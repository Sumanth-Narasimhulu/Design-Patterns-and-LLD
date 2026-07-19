package DesignPatternsAndLLD.ParkingLotDesign;

public class Main {
    public static void main(String[] args) {
        Floor floor1 = new Floor(1);
        ParkingSpot spot1 = new ParkingSpot("F101", VehicleType.BIKE);
        ParkingSpot spot2 = new ParkingSpot("F102", VehicleType.CAR);
        ParkingSpot spot3 = new ParkingSpot("F103", VehicleType.TRUCK);
        ParkingSpot spot4 = new ParkingSpot("F104", VehicleType.BIKE);
        ParkingSpot spot5 = new ParkingSpot("F105", VehicleType.TRUCK);
        floor1.addSpot(spot1);
        floor1.addSpot(spot2);
        floor1.addSpot(spot3);
        floor1.addSpot(spot4);
        floor1.addSpot(spot5);
        ParkingLot parkingLot = new ParkingLot(new FirstAvailabilityStratergy(), new HourlyPricingStartergy());
        parkingLot.addFloor(floor1);
        Vehicle bike = new Vehicle("APO22590", VehicleType.BIKE);
        Vehicle car = new Vehicle("APO20933", VehicleType.CAR);
        Vehicle truck = new Vehicle("APO20932", VehicleType.TRUCK);
        Vehicle car2 = new Vehicle("APO20931", VehicleType.CAR);
        Ticket t1 = parkingLot.parkVehicle(bike);
        Ticket t2= parkingLot.parkVehicle(car);
        Ticket t3= parkingLot.parkVehicle(truck);
        Ticket t4=parkingLot.parkVehicle(car2);

        parkingLot.exitVehicle(t1);
        parkingLot.exitVehicle(t2);
        Ticket t5 = parkingLot.parkVehicle(car2);

        

        
    }
}
