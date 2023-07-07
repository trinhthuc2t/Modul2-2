package Bai_7_Quan_Ly_Dan_Cu.P4_Main.Management;

import Bai_7_Quan_Ly_Dan_Cu.P4_Main.Persion.Person;

import java.util.ArrayList;
import java.util.List;

public class FamilyManager implements Management<Person>{
    private int id;
    private int numberPerson;
    List<Person> people = new ArrayList<>();

    public int getId() {
        return id;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public List<Person> getPeople() {
        return people;
    }

    @Override
    public void add(Person person) {
        people.add(person);
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        people.remove(id);
    }

    @Override
    public void edit(int id, Person person) {
        int index = findIndexById(id);
        people.set(index , person);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Person> getAll() {
        return people;
    }
}
