package app.model;

import app.entities.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Model {
    private static Model instance = new Model();
    private List<User> model;

    private Model() {
        this.model = new ArrayList<>();
    }

    public static Model getInstance() {
        return instance;
    }


    public void addUsers(User user) {
        model.add(user);
    }

    public List<String> getListUsers() {
        String name = " ";
        for (User user : model) {
            name = user.getName();
        }
        return Collections.singletonList(name);
    }

}
