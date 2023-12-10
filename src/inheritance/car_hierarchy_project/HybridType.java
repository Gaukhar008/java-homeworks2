package car_hierarchy_project;

public class HybridType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}
