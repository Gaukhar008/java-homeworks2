package car_hierarchy_project;

public class VehicleType {

    protected String attribute;
    public VehicleType(String attribute) {
        this.attribute = attribute;
    }

    public String getAttributeOfType() {
        return attribute;
    }

    public String getTypeName() {
        return "SomeVehicletype";
    }
}
