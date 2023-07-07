package Model.Management;

import Model.Vehicle.Motorbike;

import java.util.ArrayList;
import java.util.List;

public class MotorbikeManager implements Management<Motorbike>{
    private List<Motorbike> motorbikes;

    public MotorbikeManager() {
        motorbikes = new ArrayList<>();
    }


    @Override
    public void add(Motorbike motorbike) {
        motorbikes.add(motorbike);
    }

    @Override
    public void delete(String id) {
        int index = findIndexById(id);
        motorbikes.remove(index);

    }

    @Override
    public void edit(String id, Motorbike motorbike) {
        int index = findIndexById(id);
        motorbikes.set(index,motorbike);

    }

    @Override
    public int findIndexById(String id) {
        for (int i = 0; i < motorbikes.size(); i++) {
            if (id.equals(motorbikes.get(i).getId())){
                return i;
            }
        }
        return -1;
    }
    public List<Motorbike> getAllMotorbike(){
        return motorbikes;
    }
}
