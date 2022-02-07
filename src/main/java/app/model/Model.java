package app.model;

import app.entities.Rate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model instance = new Model();

    private List<Rate> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<>();
    }

    public void add(Rate user) {
        model.add(user);
    }

    public List<String> list() {
        return model.stream()
                .map(Rate::getName)
                .collect(Collectors.toList());
    }
}