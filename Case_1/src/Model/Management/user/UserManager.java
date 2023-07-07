package Model.Management;

import Model.People.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> userList;

    public UserManager() {
        userList = new ArrayList<>();
    }

    public void add(User user) {
        userList.add(user);
    }


    public void delete(int id) {

    }


    public void edit(int id, User user) {

    }

    public int findIndexById(String user) {
        for (int i = 0; i < userList.size(); i++) {
            if (user.equals(userList.get(i).getUserName())) {
                return i;
            }
        }
        return -1;
    }
   public List<User> getAllUser(){
        return this.userList;

    }
}
