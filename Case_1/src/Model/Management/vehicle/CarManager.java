package Model.Management;

import Model.Vehicle.Car;
import Model.Vehicle.Truck;

import java.util.ArrayList;
import java.util.List;

public class CarManager implements Management<Car> {
    private List<Car> cars;

    public CarManager() {
        cars = new ArrayList<>();
    }


    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public void delete(String id) {
        int index = findIndexById(id);
        cars.remove(index);
    }

    @Override
    public void edit(String id, Car car) {
        int index = findIndexById(id);
        cars.set(index, car);
    }


    @Override
    public int findIndexById(String id) {
        for (int i = 0; i < cars.size(); i++) {
            if (id.equals(cars.get(i).getId()))
                return i;
        }
        return -1;
    }

    public List<Car> getAllCar() {
        return cars;
    }
}
