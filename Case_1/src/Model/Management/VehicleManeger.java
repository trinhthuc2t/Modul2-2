package Model.Management.vehicle;

import Model.Management.Management;
import Model.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleManeger implements Management<Vehicle> {
    private List<Vehicle> vehicles;

    public VehicleManeger() {
        vehicles = new ArrayList<>();
    }

    @Override
    public void add(Vehicle vehicle) {
        vehicles.add(vehicle);

    }

    @Override
    public void delete(String id) {
        int index = findIndexById(id);
        vehicles.remove(index);
    }

    @Override
    public void edit(String id, Vehicle vehicle) {
        int index = findIndexById(id);
        vehicles.set(index, vehicle);
    }

    @Override
    public int findIndexById(String id) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public List<Vehicle> findByLicensePlate(String licensePlate) {
        List<Vehicle> vehicleList = new ArrayList<>();
        for (Vehicle vhc :
                vehicles) {
            if (vhc.getLicensePlate().toLowerCase().contains(licensePlate)) {
                vehicleList.add(vhc);
            }
        }
        return vehicleList;

    }
}
