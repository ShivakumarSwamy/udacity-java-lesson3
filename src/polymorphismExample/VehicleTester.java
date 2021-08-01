package polymorphismExample;

public class VehicleTester {

    public static void main(String[] args) {
        var vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Plane();
        vehicles[2] = new Boat();

        for (int i = 0; i < vehicles.length; i++) {
            var vehicle = vehicles[i];
            vehicle.speed();
        }
    }
}
