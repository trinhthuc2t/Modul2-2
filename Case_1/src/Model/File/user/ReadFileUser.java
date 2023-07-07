package Model.File.user;

import Model.User.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    File file = new File("Case_1/data/user.csv");
    public List<User> readData() {
        List<User> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                list.add(new User(strings[0], strings[1], Integer.parseInt(strings[2]), Integer.parseInt(strings[3]), strings[4],strings[5],strings[6]));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}