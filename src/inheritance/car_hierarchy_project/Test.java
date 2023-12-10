package car_hierarchy_project;

public class Test {
    public static void main(String[] args) {
        AdService adsService = new AdService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
                new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickupType(), new DieselType());
        VehicleAd renoAd = new VehicleAd("Reno", "678", new CarType(),
                new SedanType(), new PetrolType());

        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd, renoAd});
        adsService.filterByVehicleTypeByPurpose(new PassengerType());
        adsService.filterByVehicleTypeByPurpose(new TruckType());
        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());
    }
}
