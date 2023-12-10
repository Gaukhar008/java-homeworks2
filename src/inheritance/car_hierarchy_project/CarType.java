package car_hierarchy_project;

public class CarType extends VehicleTypeByPurpose {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.CAR.name();
    }
}
